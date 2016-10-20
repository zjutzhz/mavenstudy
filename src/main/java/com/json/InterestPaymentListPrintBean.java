package com.json;

import java.util.ArrayList;

/**
 * Created by zheng on 10/21/16.
 */
public class InterestPaymentListPrintBean {
    public InterestPaymentListPrintBean() {
        AccumlateList = new ArrayList<AccumlateBean>();
    }

    private String date = "";
    private String sumOfInterest = "";
    private String sumOfAdjuest = "";
    private ArrayList<AccumlateBean> AccumlateList;

    public AccumlateBean newAccumlateBeanInstance() {
        return new AccumlateBean();
    }

    public class AccumlateBean {
        private String dateRange = " -- ";
        private String accumlate = "0.00";
        private String rate = "0.0000";
        private String interest = "0.00";

        public String getDateRange() {
            return dateRange;
        }

        public void setDateRange(String dateRange) {
            this.dateRange = dateRange;
        }

        public String getAccumlate() {
            return accumlate;
        }

        public void setAccumlate(String accumlate) {
            this.accumlate = accumlate;
        }

        public String getRate() {
            return rate;
        }

        public void setRate(String rate) {
            this.rate = rate;
        }

        public String getInterest() {
            return interest;
        }

        public void setInterest(String interest) {
            this.interest = interest;
        }
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSumOfInterest() {
        return sumOfInterest;
    }

    public void setSumOfInterest(String sumOfInterest) {
        this.sumOfInterest = sumOfInterest;
    }

    public String getSumOfAdjuest() {
        return sumOfAdjuest;
    }

    public void setSumOfAdjuest(String sumOfAdjuest) {
        this.sumOfAdjuest = sumOfAdjuest;
    }

    public ArrayList<AccumlateBean> getAccumlateList() {
        return AccumlateList;
    }

    public void setAccumlateList(ArrayList<AccumlateBean> accumlateList) {
        AccumlateList = accumlateList;
    }
}
