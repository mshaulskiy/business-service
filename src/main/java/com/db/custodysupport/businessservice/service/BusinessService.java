package com.db.custodysupport.businessservice.service;

import com.db.custodysupport.businessservice.model.Trade;
import com.db.custodysupport.businessservice.model.TradeRequest;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {

    public Trade getTrade(TradeRequest request) {

        return getTrade(request.getClientId());
    }

    public Trade getTrade(String tradeId) {

        return new Trade(tradeId);
    }


}
