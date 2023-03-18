package com.example.a4pr_mobile;

public class Item {
    private String text;
    private int image;

    public String getText() { return this.text; }
    public int getImage() { return this.image; }
    public void setText(String text) { this.text = text; }
    public void setImage(int id) { this.image = id; }

    public Item(String text, int image) {
        this.text = text;
        this.image = image;
    }
}
