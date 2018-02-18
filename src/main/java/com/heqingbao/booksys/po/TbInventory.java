package com.heqingbao.booksys.po;

import java.util.Date;

public class TbInventory {
    private Integer id;

    private String inventNo;

    private String operator;

    private Date insertTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInventNo() {
        return inventNo;
    }

    public void setInventNo(String inventNo) {
        this.inventNo = inventNo == null ? null : inventNo.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
}