package com.logonovo.stock.dao;

import com.logonovo.stock.model.CashFlow;
import com.logonovo.stock.model.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;

/**
 * @Author 小凡
 * Email: logonovo@gmail.com
 * @Date 2017/10/20 21:56
 */
@Component
public interface CashFlowDao extends JpaRepository<CashFlow,Integer> {
}
