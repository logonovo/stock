package com.logonovo.stock.dao;

import com.logonovo.stock.model.AssertRatio;
import com.logonovo.stock.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @Author 小凡
 * Email: logonovo@gmail.com
 * @Date 2017/10/20 18:02
 */
@Component
public interface StockDao extends JpaRepository<Stock,Integer> {
}
