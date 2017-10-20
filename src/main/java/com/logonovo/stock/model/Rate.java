package com.logonovo.stock.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Author 小凡
 * Email: logonovo@gmail.com
 * @Date 2017/10/20 18:28
 */
@Entity
public class Rate extends Base{
    private Double 负债占资产比率;
    private Double 长期资金占不动产及设备比率;
    private Double 流动比率;
    private Double 速动比率;
    private Double 应收账款周转率;
    private Double 应收账款周转天数;
    private Double 存货周转率;
    private Double 存货周转天数;
    private Double 固定资产周转率;
    private Double 总资产周转率;
    private Double ROA资产收益率 ;
    private Double ROE净资产收益率;
    private Double 税前纯益占实收资本比率;
    private Double 毛利率 ;
    private Double 营业利润率;
    private Double 净利率;
    private Double 基本每股收益;
    private Double 现金流量;
    private Double 现金流量比率;
    private Double 现金流量充当比率;
    private Double 现金再投资比率;

    public Double get负债占资产比率() {
        return 负债占资产比率;
    }

    public void set负债占资产比率(Double 负债占资产比率) {
        this.负债占资产比率 = 负债占资产比率;
    }

    public Double get长期资金占不动产及设备比率() {
        return 长期资金占不动产及设备比率;
    }

    public void set长期资金占不动产及设备比率(Double 长期资金占不动产及设备比率) {
        this.长期资金占不动产及设备比率 = 长期资金占不动产及设备比率;
    }

    public Double get流动比率() {
        return 流动比率;
    }

    public void set流动比率(Double 流动比率) {
        this.流动比率 = 流动比率;
    }

    public Double get速动比率() {
        return 速动比率;
    }

    public void set速动比率(Double 速动比率) {
        this.速动比率 = 速动比率;
    }

    public Double get应收账款周转率() {
        return 应收账款周转率;
    }

    public void set应收账款周转率(Double 应收账款周转率) {
        this.应收账款周转率 = 应收账款周转率;
    }

    public Double get应收账款周转天数() {
        return 应收账款周转天数;
    }

    public void set应收账款周转天数(Double 应收账款周转天数) {
        this.应收账款周转天数 = 应收账款周转天数;
    }

    public Double get存货周转率() {
        return 存货周转率;
    }

    public void set存货周转率(Double 存货周转率) {
        this.存货周转率 = 存货周转率;
    }

    public Double get存货周转天数() {
        return 存货周转天数;
    }

    public void set存货周转天数(Double 存货周转天数) {
        this.存货周转天数 = 存货周转天数;
    }

    public Double get固定资产周转率() {
        return 固定资产周转率;
    }

    public void set固定资产周转率(Double 固定资产周转率) {
        this.固定资产周转率 = 固定资产周转率;
    }

    public Double get总资产周转率() {
        return 总资产周转率;
    }

    public void set总资产周转率(Double 总资产周转率) {
        this.总资产周转率 = 总资产周转率;
    }

    public Double getROA资产收益率() {
        return ROA资产收益率;
    }

    public void setROA资产收益率(Double ROA资产收益率) {
        this.ROA资产收益率 = ROA资产收益率;
    }

    public Double getROE净资产收益率() {
        return ROE净资产收益率;
    }

    public void setROE净资产收益率(Double ROE净资产收益率) {
        this.ROE净资产收益率 = ROE净资产收益率;
    }

    public Double get税前纯益占实收资本比率() {
        return 税前纯益占实收资本比率;
    }

    public void set税前纯益占实收资本比率(Double 税前纯益占实收资本比率) {
        this.税前纯益占实收资本比率 = 税前纯益占实收资本比率;
    }

    public Double get毛利率() {
        return 毛利率;
    }

    public void set毛利率(Double 毛利率) {
        this.毛利率 = 毛利率;
    }

    public Double get营业利润率() {
        return 营业利润率;
    }

    public void set营业利润率(Double 营业利润率) {
        this.营业利润率 = 营业利润率;
    }

    public Double get净利率() {
        return 净利率;
    }

    public void set净利率(Double 净利率) {
        this.净利率 = 净利率;
    }

    public Double get基本每股收益() {
        return 基本每股收益;
    }

    public void set基本每股收益(Double 基本每股收益) {
        this.基本每股收益 = 基本每股收益;
    }

    public Double get现金流量() {
        return 现金流量;
    }

    public void set现金流量(Double 现金流量) {
        this.现金流量 = 现金流量;
    }

    public Double get现金流量比率() {
        return 现金流量比率;
    }

    public void set现金流量比率(Double 现金流量比率) {
        this.现金流量比率 = 现金流量比率;
    }

    public Double get现金流量充当比率() {
        return 现金流量充当比率;
    }

    public void set现金流量充当比率(Double 现金流量充当比率) {
        this.现金流量充当比率 = 现金流量充当比率;
    }

    public Double get现金再投资比率() {
        return 现金再投资比率;
    }

    public void set现金再投资比率(Double 现金再投资比率) {
        this.现金再投资比率 = 现金再投资比率;
    }
}
