package com.lab2.PencilBox;

public class Pencil implements Chancery{
    
    private String slateColor;

    public Pencil() {
    }

    public void setSlateColor(String slateColor) {
        this.slateColor = slateColor;
    }

    @Override
    public String draw() {
        return slateColor;
    }
}
