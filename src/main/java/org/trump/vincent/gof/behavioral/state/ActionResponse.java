package org.trump.vincent.gof.behavioral.state;

/**
 * Description:
 * User: vincent
 * Date: 2018/11/26
 **/
public class ActionResponse {

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    private Integer code; // Action的处理结果

    private String error; // Action处理失败的信息
}
