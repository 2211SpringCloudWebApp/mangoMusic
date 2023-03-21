package com.kh.mango.trade.store;

import com.kh.mango.cs.domain.PageInfo;
import com.kh.mango.trade.domain.Trade;
import com.kh.mango.trade.domain.TradeComment;

import java.util.List;

public interface TradeStore {
    int getQListCount();

    List<Trade> selectTradeList(PageInfo pi);

    Trade selectTradeOneByNo(int tradeNo);

    List<TradeComment> selectTradeCommentList(int tradeNo);
}
