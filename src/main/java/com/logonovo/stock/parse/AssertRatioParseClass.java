package com.logonovo.stock.parse;

import com.logonovo.stock.model.AssertRatio;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.util.Assert;

/**
 * @Author 小凡
 * Email: logonovo@gmail.com
 * @Date 2017/10/20 21:37
 */
public class AssertRatioParseClass extends AbstractParseClass<AssertRatio> {
    @Override
    protected Elements getElements(Document doc) {
        return doc.select("#assets_ratio_table > tbody >tr");
    }

    @Override
    protected void setObjectValue(int i, AssertRatio assertRatio, Double value) {
        if(i == 0){
            assertRatio.set现金与约当现金(value);
        }else if(i == 1){
            assertRatio.set应收账款(value);
        }else if(i == 2){
            assertRatio.set存货(value);
        }else if(i == 3){
            assertRatio.set流动资产(value);
        }else if(i == 4){
            assertRatio.set非流动资产(value);
        }else if(i == 5){
            assertRatio.set总资产(value);
        }else if(i == 6){
            assertRatio.set应付账款(value);
        }else if(i == 7){
            assertRatio.set流动负债(value);
        }else if(i == 8){
            assertRatio.set非流动负债(value);
        }else if(i == 9){
            assertRatio.set股东权益(value);
        }else if(i == 10){
            assertRatio.set负债和所有者权益(value);
        }
    }
}
