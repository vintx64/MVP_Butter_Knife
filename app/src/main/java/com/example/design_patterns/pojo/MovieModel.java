package com.example.design_patterns.pojo;

public class MovieModel {
    protected String name;
    protected String ay7aga;
    protected int id;

    public MovieModel(String name, String ay7aga, int id) {
        this.name = name;
        this.ay7aga = ay7aga;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAy7aga() {
        return ay7aga;
    }

    public void setAy7aga(String ay7aga) {
        this.ay7aga = ay7aga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
