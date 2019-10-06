package com.bo.entity;

/**
 * @author mq_xu
 * @ClassName Book
 * @Description 图书实体类
 * @Date 2019/9/23
 * @Version 1.0
 **/
public class Book {
    private Integer id;
    private String name;
    private String cover;
    private String author;
    private String detail;
    public Book(Integer id, String name, String cover, String author, String detail) {
        this.id = id;
        this.name = name;
        this.cover = cover;
        this.author = author;
        this.detail = detail;
    }

    public Book() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cover='" + cover + '\'' +
                ", detail='" +detail+'\'' +
                '}';
    }
}
