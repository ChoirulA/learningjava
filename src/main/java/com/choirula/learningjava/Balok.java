package com.choirula.learningjava;

public class Balok {
    private int panjang=12,tinggi=5,lebar=5;

    public Balok(int panjang, int tinggi, int lebar){
        this.panjang = panjang;
        this.tinggi = tinggi;
        this.lebar = lebar;
    }

    public int volume(int p, int l, int t){
        return p*l*t;
    }

    public int getPanjang(){
        return panjang;
    }

    public void setPanjang(int panjang){
        this.panjang = panjang;
    }
}
