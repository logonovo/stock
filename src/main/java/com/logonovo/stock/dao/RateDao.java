package com.logonovo.stock.dao;

import com.logonovo.stock.model.Rate;
import com.logonovo.stock.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author 小凡
 * Email: logonovo@gmail.com
 * @Date 2017/10/20 19:35
 */
public interface RateDao extends JpaRepository<Rate,Integer> {
}
