package com.logonovo.stock.parse;

import com.logonovo.stock.model.AssertRatio;
import com.logonovo.stock.model.CashFlow;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * @Author 小凡
 * Email: logonovo@gmail.com
 * @Date 2017/10/20 21:46
 */
public class CashFlowParseClass extends AbstractParseClass<CashFlow> {
    @Override
    protected Elements getElements(Document doc) {
        return doc.select("#cash_flow_table > tbody >tr");
    }

    @Override
    protected void setObjectValue(int i, CashFlow cashFlow, Double value) {
        if(i == 0){
            cashFlow.set营业活动现金流量(value);
        }else if(i == 1){
            cashFlow.set投资活动现金流量(value);
        }else if(i == 2){
            cashFlow.set筹资活动现金流量(value);
        }
    }
}
