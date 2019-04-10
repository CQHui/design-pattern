package com.qihui.designpattern.prototype;

/**
 * @author chenqihui
 * @date 2019/4/10
 */
public class Auther {
    private String name;
    private String mobile;

    public Auther(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
