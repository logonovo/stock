package com.logonovo.stock.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * AssertRatio
 * @Author 小凡
 * Email: logonovo@gmail.com
 * @Date 2017/10/20 15:42
 */
@Entity
public class AssertRatio extends Base{

    private Double 现金与约当现金;
    private Double 应收账款;
    private Double 存货;
    private Double 流动资产;
    private Double 非流动资产;
    private Double 总资产;
    private Double 应付账款;
    private Double 流动负债;
    private Double 非流动负债;
    private Double 股东权益;
    private Double 负债和所有者权益;

    public AssertRatio() {
    }

    public Double get现金与约当现金() {
        return 现金与约当现金;
    }

    public void set现金与约当现金(Double 现金与约当现金) {
        this.现金与约当现金 = 现金与约当现金;
    }

    public Double get应收账款() {
        return 应收账款;
    }

    public void set应收账款(Double 应收账款) {
        this.应收账款 = 应收账款;
    }

    public Double get存货() {
        return 存货;
    }

    public void set存货(Double 存货) {
        this.存货 = 存货;
    }

    public Double get流动资产() {
        return 流动资产;
    }

    public void set流动资产(Double 流动资产) {
        this.流动资产 = 流动资产;
    }

    public Double get非流动资产() {
        return 非流动资产;
    }

    public void set非流动资产(Double 非流动资产) {
        this.非流动资产 = 非流动资产;
    }

    public Double get总资产() {
        return 总资产;
    }

    public void set总资产(Double 总资产) {
        this.总资产 = 总资产;
    }

    public Double get应付账款() {
        return 应付账款;
    }

    public void set应付账款(Double 应付账款) {
        this.应付账款 = 应付账款;
    }

    public Double get流动负债() {
        return 流动负债;
    }

    public void set流动负债(Double 流动负债) {
        this.流动负债 = 流动负债;
    }

    public Double get非流动负债() {
        return 非流动负债;
    }

    public void set非流动负债(Double 非流动负债) {
        this.非流动负债 = 非流动负债;
    }

    public Double get股东权益() {
        return 股东权益;
    }

    public void set股东权益(Double 股东权益) {
        this.股东权益 = 股东权益;
    }

    public Double get负债和所有者权益() {
        return 负债和所有者权益;
    }

    public void set负债和所有者权益(Double 负债和所有者权益) {
        this.负债和所有者权益 = 负债和所有者权益;
    }

}
