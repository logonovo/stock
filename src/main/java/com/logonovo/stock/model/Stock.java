package com.logonovo.stock.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Author 小凡
 * Email: logonovo@gmail.com
 * @Date 2017/10/20 17:58
 */
@Entity
public class Stock {
    @Id
    @GeneratedValue
    private Integer id;
    private String code;//股票代码
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
