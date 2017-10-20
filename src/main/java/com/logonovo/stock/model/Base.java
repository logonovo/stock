package com.logonovo.stock.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * @Author 小凡
 * Email: logonovo@gmail.com
 * @Date 2017/10/20 22:42
 */
@MappedSuperclass
public class Base {
    @Id
    @GeneratedValue
    private Integer id;
    private String code;
    private Date year;

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

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }
}
