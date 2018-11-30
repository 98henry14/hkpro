package cn.qdama.siss.bean;

public class BaseCodeKey {
    private String typeNo;

    private String codeId;

    public BaseCodeKey() {
    }

    public BaseCodeKey(String typeNo, String codeId) {

        this.typeNo = typeNo;
        this.codeId = codeId;
    }

    public String getTypeNo() {
        return typeNo;
    }

    public void setTypeNo(String typeNo) {
        this.typeNo = typeNo == null ? null : typeNo.trim();
    }

    public String getCodeId() {
        return codeId;
    }

    public void setCodeId(String codeId) {
        this.codeId = codeId == null ? null : codeId.trim();
    }
}