package com.json;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;

/**
 * Created by zheng on 10/21/16.
 */
public class MakeJsonForHtml {
    public static void main(String[] args) {
        InterestPaymentListPrintBean intPayListBean = new InterestPaymentListPrintBean();
        intPayListBean.setDate("2017-10-01");
        intPayListBean.setSumOfAdjuest("1.01");
        intPayListBean.setSumOfInterest("4.5");

        ArrayList<InterestPaymentListPrintBean.AccumlateBean> accumlateBeanList = intPayListBean.getAccumlateList();
        for (int i = 0; i < 3; i++) {
            InterestPaymentListPrintBean.AccumlateBean accumlateBean = intPayListBean.newAccumlateBeanInstance();
            accumlateBean.setAccumlate(Double.toString(Double.parseDouble("1.0") + i));
            accumlateBeanList.add(accumlateBean);
        }
        String jsonStrng = JSON.toJSONString(intPayListBean);
        System.out.println(jsonStrng);

    }

}
