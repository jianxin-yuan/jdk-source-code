package com.yuan.test.map;

import java.util.StringJoiner;

/**
 * @author jianxin.yuan
 * @date 2021/2/16 下午5:14
 */
public class Detail {
    private String code;
    private String msg;
    private String remarks;

    public Detail(String code, String msg, String remarks) {
        this.code = code;
        this.msg = msg;
        this.remarks = remarks;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Detail.class.getSimpleName() + "[", "]")
                .add("code='" + code + "'")
                .add("msg='" + msg + "'")
                .add("remarks='" + remarks + "'")
                .toString();
    }
}
