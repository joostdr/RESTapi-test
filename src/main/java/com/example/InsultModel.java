package com.example;

public class InsultModel {

    private final String insult;
    private final String name;

    public InsultModel(String insult, String name){
        this.insult = insult;
        this.name = name;
    }

    public String getInsult(){
        return insult;
    }

    public String getName(){
        return name;
    }

}
