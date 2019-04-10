package com.qihui.designpattern.prototype;

import java.util.ArrayList;

/**
 * @author chenqihui
 * @date 2019/4/10
 */
public class Book implements Cloneable{

    private String title;
    private ArrayList<String> images;
    private Auther auther;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }

    public Auther getAuther() {
        return auther;
    }

    public void setAuther(Auther auther) {
        this.auther = auther;
    }

    public void showBook() {
        System.out.println("=======start=======");
        System.out.println("标题：" + title);
        System.out.println("作者" + auther.getName());
        for (String img : images) {
            System.out.println("图片：" + img);
        }
        System.out.println("=======end=======");
    }

    //默认浅拷贝,浅拷贝拷贝引用
    @Override
    protected Book clone() throws CloneNotSupportedException {
        Book book = (Book) super.clone();
        //深拷贝
        book.images = (ArrayList<String>) this.images.clone();
        return (Book) super.clone();
    }
}
