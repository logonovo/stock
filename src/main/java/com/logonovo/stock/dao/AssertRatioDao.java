package com.logonovo.stock.dao;

import com.logonovo.stock.model.AssertRatio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @Author 小凡
 * Email: logonovo@gmail.com
 * @Date 2017/10/20 15:49
 */
@Component
public interface AssertRatioDao extends JpaRepository<AssertRatio,Integer> {


}
