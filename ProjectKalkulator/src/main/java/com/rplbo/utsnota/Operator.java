package com.rplbo.utsnota;

public class Operator {
    String operatorString, operatorSimbol;

    public Operator(String x) {
        double result;
        String help = x.toLowerCase();
        if (help.equals("tambah")){
            this.operatorSimbol = "+";
        } else if (help.equals("kurang")){
            this.operatorSimbol = "-";
        } else if (help.equals("bagi")){
            this.operatorSimbol = "/";
        } else if (help.equals("kali")){
            this.operatorSimbol = "*";
        } else if (help.equals("pangkat")){
            this.operatorSimbol = "^";
        }
    }

    public String getOperatorSimbol() {
        return operatorSimbol;
    }
}
