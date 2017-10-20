package com.logonovo.stock.service;

import com.logonovo.stock.dao.AssertRatioDao;
import com.logonovo.stock.dao.CashFlowDao;
import com.logonovo.stock.dao.RateDao;
import com.logonovo.stock.dao.StockDao;
import com.logonovo.stock.model.AssertRatio;
import com.logonovo.stock.model.CashFlow;
import com.logonovo.stock.model.Rate;
import com.logonovo.stock.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author 小凡
 * Email: logonovo@gmail.com
 * @Date 2017/10/20 18:02
 */
@Service
@Transactional
public class StockService {

    @Autowired
    private StockDao stockDao;

    @Autowired
    private RateDao rateDao;
    @Autowired
    private AssertRatioDao assertRatioDao;
    @Autowired
    private CashFlowDao cashFlowDao;

    public void saveAssertRatio(List<AssertRatio> assertRatioList){
        assertRatioDao.save(assertRatioList);
    }

    public void saveStock(Stock stock){
        stockDao.save(stock);
    }

    public void saveRates(List<Rate> rateList){
        rateDao.save(rateList);
    }

    public void saveCashFlows(List<CashFlow> cashFlows) {
        cashFlowDao.save(cashFlows);
    }

    public void saveAll(Stock stock, List<AssertRatio> ratios, List<Rate> rates, List<CashFlow> cashFlows) {
        saveStock(stock);
        saveAssertRatio(ratios);
        saveRates(rates);
        saveCashFlows(cashFlows);
    }
}
