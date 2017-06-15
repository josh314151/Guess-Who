package com.example.josh.guesswho;

/**
 * Created by Josh on 2017-06-13.
 */

public class Inquiry {
    private int lookup;
    private String question;

    public Inquiry() {
        this.lookup = 0;
        this.question = "";
    }

    public Inquiry(int lookup, String question) {
        this.lookup = lookup;
        this.question = question;
    }

    public void setLookup(int i) {
        this.lookup = i;
    }

    public void setQuestion(String s) {
        this.question = s;
    }

    public int getLookup() {
        return lookup;
    }

    public String getQuestion() {
        return question;
    }
}
