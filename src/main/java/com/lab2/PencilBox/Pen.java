package com.lab2.PencilBox;

public class Pen implements Chancery {
    public String kernel;

    public Pen(String kernel) {
        this.kernel = kernel;
    }

    public Pen() {
        this.kernel = "Red";
    }

    @Override
    public String draw() {
        return kernel;
    }
}
