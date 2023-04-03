package com.yangzhuo.imperial.court.pojo;

public class Memorial {
    private Integer memorialsId;
    private String memorialsTitle;
    private String memorialsContent;

    // 奏折摘要数据库没有，这里是为了配和页面显示
    private String memorialsContentDigest;
    private Integer memorialsEmp;

    // 员工姓名数据库没有，这里是为了配合页面显示
    private String memorialsEmpName;
    private String memorialsCreateTime;
    private String feedbackTime;
    private String feedbackContent;
    private Integer memorialsStatus;

    public Memorial() {
    }

    public Memorial(Integer memorialsId, String memorialsTitle, String memorialsContent, String memorialsContentDigest, Integer memorialsEmp, String memorialsEmpName, String memorialsCreateTime, String feedbackTime, String feedbackContent, Integer memorialsStatus) {
        this.memorialsId = memorialsId;
        this.memorialsTitle = memorialsTitle;
        this.memorialsContent = memorialsContent;
        this.memorialsContentDigest = memorialsContentDigest;
        this.memorialsEmp = memorialsEmp;
        this.memorialsEmpName = memorialsEmpName;
        this.memorialsCreateTime = memorialsCreateTime;
        this.feedbackTime = feedbackTime;
        this.feedbackContent = feedbackContent;
        this.memorialsStatus = memorialsStatus;
    }

    /**
     * 获取
     * @return memorialsId
     */
    public Integer getMemorialsId() {
        return memorialsId;
    }

    /**
     * 设置
     * @param memorialsId
     */
    public void setMemorialsId(Integer memorialsId) {
        this.memorialsId = memorialsId;
    }

    /**
     * 获取
     * @return memorialsTitle
     */
    public String getMemorialsTitle() {
        return memorialsTitle;
    }

    /**
     * 设置
     * @param memorialsTitle
     */
    public void setMemorialsTitle(String memorialsTitle) {
        this.memorialsTitle = memorialsTitle;
    }

    /**
     * 获取
     * @return memorialsContent
     */
    public String getMemorialsContent() {
        return memorialsContent;
    }

    /**
     * 设置
     * @param memorialsContent
     */
    public void setMemorialsContent(String memorialsContent) {
        this.memorialsContent = memorialsContent;
    }

    /**
     * 获取
     * @return memorialsContentDigest
     */
    public String getMemorialsContentDigest() {
        return memorialsContentDigest;
    }

    /**
     * 设置
     * @param memorialsContentDigest
     */
    public void setMemorialsContentDigest(String memorialsContentDigest) {
        this.memorialsContentDigest = memorialsContentDigest;
    }

    /**
     * 获取
     * @return memorialsEmp
     */
    public Integer getMemorialsEmp() {
        return memorialsEmp;
    }

    /**
     * 设置
     * @param memorialsEmp
     */
    public void setMemorialsEmp(Integer memorialsEmp) {
        this.memorialsEmp = memorialsEmp;
    }

    /**
     * 获取
     * @return memorialsEmpName
     */
    public String getMemorialsEmpName() {
        return memorialsEmpName;
    }

    /**
     * 设置
     * @param memorialsEmpName
     */
    public void setMemorialsEmpName(String memorialsEmpName) {
        this.memorialsEmpName = memorialsEmpName;
    }

    /**
     * 获取
     * @return memorialsCreateTime
     */
    public String getMemorialsCreateTime() {
        return memorialsCreateTime;
    }

    /**
     * 设置
     * @param memorialsCreateTime
     */
    public void setMemorialsCreateTime(String memorialsCreateTime) {
        this.memorialsCreateTime = memorialsCreateTime;
    }

    /**
     * 获取
     * @return feedbackTime
     */
    public String getFeedbackTime() {
        return feedbackTime;
    }

    /**
     * 设置
     * @param feedbackTime
     */
    public void setFeedbackTime(String feedbackTime) {
        this.feedbackTime = feedbackTime;
    }

    /**
     * 获取
     * @return feedbackContent
     */
    public String getFeedbackContent() {
        return feedbackContent;
    }

    /**
     * 设置
     * @param feedbackContent
     */
    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent;
    }

    /**
     * 获取
     * @return memorialsStatus
     */
    public Integer getMemorialsStatus() {
        return memorialsStatus;
    }

    /**
     * 设置
     * @param memorialsStatus
     */
    public void setMemorialsStatus(Integer memorialsStatus) {
        this.memorialsStatus = memorialsStatus;
    }

    public String toString() {
        return "Memorial{memorialsId = " + memorialsId + ", memorialsTitle = " + memorialsTitle + ", memorialsContent = " + memorialsContent + ", memorialsContentDigest = " + memorialsContentDigest + ", memorialsEmp = " + memorialsEmp + ", memorialsEmpName = " + memorialsEmpName + ", memorialsCreateTime = " + memorialsCreateTime + ", feedbackTime = " + feedbackTime + ", feedbackContent = " + feedbackContent + ", memorialsStatus = " + memorialsStatus + "}";
    }
}
