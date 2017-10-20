package com.logonovo.stock.parse;

import com.logonovo.stock.model.AssertRatio;
import com.logonovo.stock.model.Base;
import com.logonovo.stock.model.Rate;
import com.logonovo.stock.utils.DateUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 小凡
 * Email: logonovo@gmail.com
 * @Date 2017/10/20 19:56
 */
public abstract  class AbstractParseClass<T extends Base> {
    protected Document doc;
    protected String code;
    public List<T> parse(Document doc,Class<T> clazz, String code){
        this.doc = doc;
        this.code = code;
        Elements elements = getElements(doc);
        List<T> target = getTargets(clazz, elements);
        return target;
    }

    private List<T> getTargets(Class<T> clazz, Elements elements) {
        List<T> target = new ArrayList<>();
        for (int i = 0; i < elements.size(); i++) {
            Element tr = elements.get(i);
            Elements tds = tr.select("td");
            for (int j = 1; j < tds.size(); j++) {
                T obj = null;
                if (target.size() <= j - 1) {
                    obj = newTclass(clazz);
                    target.add(obj);
                } else {
                    obj = target.get(j - 1);
                }

                obj.setCode(code);
                if(j == 1){
                    obj.setYear(DateUtil.LocalDateToUdate(LocalDate.of(2012, Month.JANUARY, 01)));
                }else if(j == 2){
                    obj.setYear(DateUtil.LocalDateToUdate(LocalDate.of(2013, Month.JANUARY, 01)));
                }else if(j == 3){
                    obj.setYear(DateUtil.LocalDateToUdate(LocalDate.of(2014, Month.JANUARY, 01)));
                }else if(j == 4){
                    obj.setYear(DateUtil.LocalDateToUdate(LocalDate.of(2015, Month.JANUARY, 01)));
                }else if(j == 5){
                    obj.setYear(DateUtil.LocalDateToUdate(LocalDate.of(2016, Month.JANUARY, 01)));
                }

                String text = tds.get(j).text();

                Double value = null;
                if (text != null) {
                    if("--".equals(text)){
                        value = 0.0;
                    }else {
                        if(text.contains("(")){
                            text = "-"+text.replaceAll("\\(","").replaceAll("\\)","");
                        }
                        text = text.replaceAll(",","");
                        value = Double.parseDouble(text);
                    }
                }
                setObjectValue(i, obj, value);
            }

        }
        return target;
    }

    protected  abstract Elements getElements(Document doc);

    private static <T> T newTclass(Class<T> clazz){
        try {
            T a=clazz.newInstance();
            return a;
        } catch (Exception e) {
        }
        return null;
    }

    protected abstract void setObjectValue(int i, T obj, Double value);
}
