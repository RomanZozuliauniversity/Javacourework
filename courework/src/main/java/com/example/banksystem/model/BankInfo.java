package com.example.banksystem.model;

public class BankInfo {

    private Integer id;
    private Integer bankId;

    private Integer minSum;
    private Integer maxSum;

    private Integer minTerm;
    private Integer maxTerm;

    private Float percent;

    public BankInfo(Integer id, Integer bankId, Integer minSum, Integer maxSum, Integer minTerm, Integer maxTerm, Float percent) {
        this(bankId, minSum, maxSum, minTerm, maxTerm, percent);
        this.id = id;
    }

    public BankInfo(Integer bankId, Integer minSum, Integer maxSum, Integer minTerm, Integer maxTerm, Float percent) {
        this.bankId = bankId;
        this.minSum = minSum;
        this.maxSum = maxSum;
        this.minTerm = minTerm;
        this.maxTerm = maxTerm;
        this.percent = percent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public Integer getMinSum() {
        return minSum;
    }

    public void setMinSum(Integer minSum) {
        this.minSum = minSum;
    }

    public Integer getMaxSum() {
        return maxSum;
    }

    public void setMaxSum(Integer maxSum) {
        this.maxSum = maxSum;
    }

    public Integer getMinTerm() {
        return minTerm;
    }

    public void setMinTerm(Integer minTerm) {
        this.minTerm = minTerm;
    }

    public Integer getMaxTerm() {
        return maxTerm;
    }

    public void setMaxTerm(Integer maxTerm) {
        this.maxTerm = maxTerm;
    }

    public Float getPercent() {
        return percent;
    }

    public void setPercent(Float percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "BankInfo{" +
                "id=" + id +
                ", bankId=" + bankId +
                ", minSum=" + minSum +
                ", maxSum=" + maxSum +
                ", minTerm=" + minTerm +
                ", maxTerm=" + maxTerm +
                ", percent=" + percent +
                '}';
    }
}
