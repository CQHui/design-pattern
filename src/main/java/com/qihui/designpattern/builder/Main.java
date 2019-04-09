package com.qihui.designpattern.builder;

/**
 * @author chenqihui
 * @date 2019/4/9
 */
public class Main {
    public static void main(String[] args) {
        User user = User.newUser()
                .name("qihui")
                .password("123")
                .mobile("135")
                .email("@gmail.com")
                .sex("男")
                .build();

        System.out.println(user.getName());
    }
}
