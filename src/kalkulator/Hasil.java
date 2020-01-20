package kalkulator;

import  java.lang.*;

public class Hasil {
    private int jawab;
    private String pesanError;

    public Hasil(int jawab, String pesanError){
        this.jawab = jawab;
        this.pesanError = pesanError;
    }

    public int getJawab(){
        return this.jawab;
    }

    public String getPesanError(){
        return this.pesanError;
    }
}
