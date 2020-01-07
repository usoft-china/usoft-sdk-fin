package com.usoft.sdk.fin;

import com.usoft.fin.external.open.api.protobuf.*;
import com.usoft.sdk.fin.client.TradingHallSdk;
import com.usoft.sdk.fin.utils.ProtoBufUtil;
import org.junit.jupiter.api.Test;

/**
 * @author: linjh
 * @date: 2019-12-30 17:37
 **/
public class TradingHallSdkTest {
    /**
     * 测试地址
     */
    private TradingHallSdk tradingHallSdk = new TradingHallSdk("https://finrest.uuzcc.cn", "10042875", "c49f7be6a861461ab951e55030055a5c");

    @Test
    public void getFinanceSides() throws Exception {
        GetFinanceSidesReq.Builder req = GetFinanceSidesReq.newBuilder();
        req.setPageNumber(1);
        req.setPageSize(10);
        GetFinanceSidesResp resp = tradingHallSdk.getFinanceSides(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void getOrderByOrderId() throws Exception {
        GetOrderByOrderIdReq.Builder req = GetOrderByOrderIdReq.newBuilder();
        req.setEnuu(10041961);
        req.setOrderId(14125390);
        GetOrderByOrderIdResp resp = tradingHallSdk.getOrderByOrderId(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void GetAcceptOrderByAcceptId() throws Exception {
        GetAcceptOrderByAcceptIdReq.Builder req = GetAcceptOrderByAcceptIdReq.newBuilder();
        req.setEnuu(10000666);
        req.setAcceptIdPrimary(1856822);
        GetAcceptOrderByAcceptIdResp resp = tradingHallSdk.GetAcceptOrderByAcceptId(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void getBaseInfo() throws Exception {
        GetBaseInfoReq.Builder req = GetBaseInfoReq.newBuilder();
        req.setEnuu(10005285);
        req.setCsEnuu(10050856);
        req.setUu(10005285);
        GetBaseInfoResp resp = tradingHallSdk.getBaseInfo(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void getCapitalSideLoanAndRepaymentPlan() throws Exception {
        GetCapitalSideLoanAndRepaymentPlanReq.Builder req = GetCapitalSideLoanAndRepaymentPlanReq.newBuilder();
        req.setEnuu(10042875);
        req.setCode("73191218665544296649");
        GetCapitalSideLoanAndRepaymentPlanResp resp = tradingHallSdk.getCapitalSideLoanAndRepaymentPlan(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void getEnterpriseExtensionInfo() throws Exception {
        GetEnterpriseExtensionInfoReq.Builder req = GetEnterpriseExtensionInfoReq.newBuilder();
        req.setEnuu(10042875);
        GetEnterpriseExtensionInfoResp resp = tradingHallSdk.getEnterpriseExtensionInfo(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
}
