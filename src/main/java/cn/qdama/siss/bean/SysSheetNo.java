package cn.qdama.siss.bean;

import java.util.Date;

public class SysSheetNo extends SysSheetNoKey {
    private Long sheetValue;

    private Short tempValue;

    private Date lastTime;

    private String other1;

    public Long getSheetValue() {
        return sheetValue;
    }

    public void setSheetValue(Long sheetValue) {
        this.sheetValue = sheetValue;
    }

    public Short getTempValue() {
        return tempValue;
    }

    public void setTempValue(Short tempValue) {
        this.tempValue = tempValue;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public String getOther1() {
        return other1;
    }

    public void setOther1(String other1) {
        this.other1 = other1 == null ? null : other1.trim();
    }
}