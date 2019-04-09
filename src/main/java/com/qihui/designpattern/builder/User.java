package com.qihui.designpattern.builder;

/**
 * @author chenqihui
 * @date 2019/4/9
 */
public class User {
    private String name;
    private String password;
    private String mobile;
    private String email;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private User(Builder builder) {
        this.name = builder.name;
        this.password = builder.password;
        this.mobile = builder.mobile;
        this.email = builder.email;
        this.sex = builder.sex;
    }


    public static Builder newUser() {
        return new Builder();
    }


    public static final class Builder {
        private String name;
        private String password;
        private String mobile;
        private String email;
        private String sex;

        private Builder() {
        }

        public User build() {
            return new User(this);
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder sex(String sex) {
            this.sex = sex;
            return this;
        }
    }
}
