package com.logonovo.stock.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author 小凡
 * Email: logonovo@gmail.com
 * @Date 2017/10/20 16:17
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StockControllerTest {

    @Autowired
    private StockController stockController;

    @Test
    public void parseTest() throws Exception {
        stockController.parse();
    }

}