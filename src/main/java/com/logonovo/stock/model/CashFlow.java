package com.logonovo.stock.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Author 小凡
 * Email: logonovo@gmail.com
 * @Date 2017/10/20 19:37
 */
@Entity
public class CashFlow extends Base{
    private Double 营业活动现金流量;
    private Double 投资活动现金流量;
    private Double 筹资活动现金流量;

    public Double get营业活动现金流量() {
        return 营业活动现金流量;
    }

    public void set营业活动现金流量(Double 营业活动现金流量) {
        this.营业活动现金流量 = 营业活动现金流量;
    }

    public Double get投资活动现金流量() {
        return 投资活动现金流量;
    }

    public void set投资活动现金流量(Double 投资活动现金流量) {
        this.投资活动现金流量 = 投资活动现金流量;
    }

    public Double get筹资活动现金流量() {
        return 筹资活动现金流量;
    }

    public void set筹资活动现金流量(Double 筹资活动现金流量) {
        this.筹资活动现金流量 = 筹资活动现金流量;
    }

}
