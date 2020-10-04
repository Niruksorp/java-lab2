package com.lab2.PencilBox;

public class PencilBox {

    Chancery obj;

    public PencilBox (Chancery obj) {
        this.obj = obj;
    }

    public void setObj(Chancery obj) {
        this.obj = obj;
    }
    public void print () {
        System.out.println("Мы воспользовались: " + obj.toString() + " Поле инициализированно:" + obj.draw());
    }
}
