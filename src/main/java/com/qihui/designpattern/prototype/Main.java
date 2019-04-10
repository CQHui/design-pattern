package com.qihui.designpattern.prototype;

import java.util.ArrayList;

/**
 * @author chenqihui
 * @date 2019/4/10
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Auther qihui = new Auther("qihui", "135");
        Book book1 = new Book();
        ArrayList<String> imgs = new ArrayList<>();
        imgs.add("图片1");
        book1.setTitle("书籍1");
        book1.setAuther(qihui);
        book1.setImages(imgs);
        book1.showBook();
        Book book2 = book1.clone();
        book2.setTitle("书籍2");
        ArrayList<String> images = book2.getImages();
        images.add("图片2");
        book2.setImages(images);
        qihui.setName("xiaoming");
        book2.showBook();
        book1.showBook();
    }
}
