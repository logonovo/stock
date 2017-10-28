package com.logonovo.stock.controller;

import com.logonovo.stock.model.AssertRatio;
import com.logonovo.stock.model.CashFlow;
import com.logonovo.stock.model.Rate;
import com.logonovo.stock.model.Stock;
import com.logonovo.stock.parse.AbstractParseClass;
import com.logonovo.stock.parse.AssertRatioParseClass;
import com.logonovo.stock.parse.CashFlowParseClass;
import com.logonovo.stock.parse.RateParseClass;
import com.logonovo.stock.service.StockService;
import com.logonovo.stock.utils.DateUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/**
 * @Author 小凡
 * Email: logonovo@gmail.com
 * @Date 2017/10/20 15:33
 */
@RestController
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping(value = "/hello")
    public String hello(){
        return "stock system";
    }

    @PutMapping(value = "/parse")
    public void parse() throws IOException {
        String file = "E:/1.地球online/投资/财报说资料/银行_600036_招商银行.html";
        File input = new File(file);

        String fileName = input.getName();
        String code = fileName.split("_")[1];
        String type = fileName.split("_")[0];
        String name = (fileName.split("_")[2]).split("\\.")[0];

        Stock stock = new Stock();
        stock.setCode(code);
        stock.setName(name);
        Document doc = Jsoup.parse(input, "UTF-8", "http://caibaoshuo.com/");

        AbstractParseClass<AssertRatio> arpc = new AssertRatioParseClass();
        List<AssertRatio> ratios = arpc.parse(doc,AssertRatio.class, code);

        AbstractParseClass<Rate> rateParse = new RateParseClass();
        List<Rate> rates = rateParse.parse(doc,Rate.class, code);
        int i = 0;
        for (Rate rate : rates){
            rate.setCode(code);
        }

        AbstractParseClass<CashFlow> cashFlowParse = new CashFlowParseClass();
        List<CashFlow> cashFlows = cashFlowParse.parse(doc,CashFlow.class, code);
        for (CashFlow cashFlow : cashFlows){
            cashFlow.setCode(code);
        }
        this.stockService.saveAll(stock, ratios, rates, cashFlows);
    }

}
