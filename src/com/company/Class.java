package com.company;

import java.util.Arrays;

public class Class {
    private int nomer;
    private String soz;
    private int[] san;

    Class(int nomer, String soz, int[] san) {
        this.nomer = nomer;
        this.soz = soz;
        this.san = san;

    }


    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public String getSoz() {
        return soz;
    }

    public void setSoz(String soz) {
        this.soz = soz;
    }

    public String getSan() {
        return Arrays.toString(san);

    }

    public void setSan(int[] san) {
        this.san = san;
    }
}