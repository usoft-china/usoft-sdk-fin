package com.usoft.sdk.fin.client;

import com.usoft.fin.external.open.api.protobuf.*;
import com.usoft.sdk.fin.utils.HttpUtil;
import com.usoft.sdk.fin.utils.ProtoBufUtil;

import java.util.Map;


/**
 * @author: linjh
 * @date: 2019-12-30 17:00
 **/
public class TradingHallSdk extends BaseSdk {
    public TradingHallSdk(String baseUrl, String secretId, String secretKey) {
        super(baseUrl, secretId, secretKey);
    }

    public TradingHallSdk(String baseUrl, String secretId, String secretKey, int timeout) {
        super(baseUrl, secretId, secretKey, timeout);
    }

    /**
     * [获取融资方列表]
     * @author: linjh
     * @date: 2019/12/30
     **/
    public GetFinanceSidesResp getFinanceSides(GetFinanceSidesReq.Builder req) throws Exception {
        String url = baseUrl + "/api/open/factoring/financeSides";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        GetFinanceSidesResp.Builder resp = ProtoBufUtil.toProtoBuf(GetFinanceSidesResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * [根据验订单ID通过b2b获取订单详情]
     * @author: linjh
     * @date: 2019/12/31
     **/
    public GetOrderByOrderIdResp getOrderByOrderId(GetOrderByOrderIdReq.Builder req) throws Exception {
        String url = baseUrl + "/api/open/factoring/getOrderByOrderId";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        GetOrderByOrderIdResp.Builder resp = ProtoBufUtil.toProtoBuf(GetOrderByOrderIdResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * [根据验收单主表ID通过b2b获取验收单详情]
     * @author: linjh
     * @date: 2019/12/31
     **/
    public GetAcceptOrderByAcceptIdResp getAcceptOrderByAcceptId(GetAcceptOrderByAcceptIdReq.Builder req) throws Exception {
        String url = baseUrl + "/api/open/factoring/getAcceptOrderByAcceptId";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        GetAcceptOrderByAcceptIdResp.Builder resp = ProtoBufUtil.toProtoBuf(GetAcceptOrderByAcceptIdResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * [通过enuu获取融资方信息]
     * @author: linjh
     * @date: 2019/12/31
     **/
    public GetBaseInfoResp getBaseInfo(GetBaseInfoReq.Builder req) throws Exception {
        String url = baseUrl + "/api/open/factoring/baseInfo";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        GetBaseInfoResp.Builder resp = ProtoBufUtil.toProtoBuf(GetBaseInfoResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * [获取放款信息记录、还款计划记录公共方法]
     * @author: linjh
     * @date: 2020/1/7
     **/
    public GetCapitalSideLoanAndRepaymentPlanResp getCapitalSideLoanAndRepaymentPlan(GetCapitalSideLoanAndRepaymentPlanReq.Builder req) throws Exception {
        String url = baseUrl + "/api/open/factoring/getCapitalSideLoanAndRepaymentPlan";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        GetCapitalSideLoanAndRepaymentPlanResp.Builder resp = ProtoBufUtil.toProtoBuf(GetCapitalSideLoanAndRepaymentPlanResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * [保理大厅详情获取企业扩展信息]
     * @author: linjh
     * @date: 2020/1/7
     **/
    public GetEnterpriseExtensionInfoResp getEnterpriseExtensionInfo(GetEnterpriseExtensionInfoReq.Builder req) throws Exception {
        String url = baseUrl + "/api/open/factring/getEnterpriseExtensionInfo";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        GetEnterpriseExtensionInfoResp.Builder resp = ProtoBufUtil.toProtoBuf(GetEnterpriseExtensionInfoResp.newBuilder(), respJson);
        return resp.build();
    }
}
