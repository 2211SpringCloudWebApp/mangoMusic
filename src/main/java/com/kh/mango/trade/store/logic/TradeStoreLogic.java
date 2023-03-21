package com.kh.mango.trade.store.logic;

import com.kh.mango.cs.domain.PageInfo;
import com.kh.mango.trade.domain.Trade;
import com.kh.mango.trade.store.TradeStore;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TradeStoreLogic implements TradeStore {
    @Autowired
    private SqlSession session;
    @Override
    public int getQListCount() {
        return session.selectOne("CsMapper.getQnaListCount");
    }

    @Override
    public List<Trade> selectTradeList(PageInfo pi) {
        int limit = pi.getBoardLimit();
        int currentPage = pi.getCurrentPage();
        int offset = (currentPage - 1) * limit;
        RowBounds rowBounds = new RowBounds(offset, limit);
        return session.selectList("TradeMapper.selectTradeList",null,rowBounds);
    }


}
