package com.yangzhuo.imperial.court.pojo;

public class Emp {
    private Integer empId;
    private String empName;
    private String empPosition;
    private String loginAccount;
    private String loginPassword;

    public Emp() {
    }

    public Emp(Integer empId, String empName, String empPosition, String loginAccount, String loginPassword) {
        this.empId = empId;
        this.empName = empName;
        this.empPosition = empPosition;
        this.loginAccount = loginAccount;
        this.loginPassword = loginPassword;
    }

    /**
     * 获取
     * @return empId
     */
    public Integer getEmpId() {
        return empId;
    }

    /**
     * 设置
     * @param empId
     */
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    /**
     * 获取
     * @return empName
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * 设置
     * @param empName
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     * 获取
     * @return empPosition
     */
    public String getEmpPosition() {
        return empPosition;
    }

    /**
     * 设置
     * @param empPosition
     */
    public void setEmpPosition(String empPosition) {
        this.empPosition = empPosition;
    }

    /**
     * 获取
     * @return loginAccount
     */
    public String getLoginAccount() {
        return loginAccount;
    }

    /**
     * 设置
     * @param loginAccount
     */
    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    /**
     * 获取
     * @return loginPassword
     */
    public String getLoginPassword() {
        return loginPassword;
    }

    /**
     * 设置
     * @param loginPassword
     */
    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String toString() {
        return "emp{empId = " + empId + ", empName = " + empName + ", empPosition = " + empPosition + ", loginAccount = " + loginAccount + ", loginPassword = " + loginPassword + "}";
    }
}
