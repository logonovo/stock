package com.logonovo.stock.parse;

import com.logonovo.stock.model.AssertRatio;
import com.logonovo.stock.model.Rate;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * @Author 小凡
 * Email: logonovo@gmail.com
 * @Date 2017/10/20 21:44
 */
public class RateParseClass extends AbstractParseClass<Rate> {
    @Override
    protected Elements getElements(Document doc) {
        return doc.select("#rate_table > tbody >tr");
    }

    @Override
    protected void setObjectValue(int i, Rate rate, Double value) {
        switch (i){
            case 1: rate.set负债占资产比率(value);break;
            case 2: rate.set长期资金占不动产及设备比率(value);break;
            case 4: rate.set流动比率(value);break;
            case 5: rate.set速动比率(value);break;
            case 7: rate.set应收账款周转率(value);break;
            case 8: rate.set应收账款周转天数(value);break;
            case 9: rate.set存货周转率(value);break;
            case 10: rate.set存货周转天数(value);break;
            case 11: rate.set固定资产周转率(value);break;
            case 12: rate.set总资产周转率(value);break;
            case 14: rate.setROA资产收益率(value);break;
            case 15: rate.setROE净资产收益率(value);break;
            case 16: rate.set税前纯益占实收资本比率(value);break;
            case 17: rate.set毛利率(value);break;
            case 18: rate.set营业利润率(value);break;
            case 19: rate.set净利率(value);break;
            case 20: rate.set基本每股收益(value);break;
            case 22: rate.set现金流量比率(value);break;
            case 23: rate.set现金流量充当比率(value);break;
            case 24: rate.set现金再投资比率(value);break;
        }
    }
}
