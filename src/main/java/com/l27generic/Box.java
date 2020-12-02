package com.l27generic;

public class Box<E> {

    E e;

    public void setE(E e) {
        this.e = e;
    }

    public void getE() {
        System.out.println(this.e.toString());
    }
}
