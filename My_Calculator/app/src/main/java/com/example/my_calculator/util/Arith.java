package com.example.my_calculator.util;

import java.math.BigDecimal;

public class Arith {
    private static final int DEF_DIV_SCALE = 10;
    private Arith(){
        ;
    }
    public static String add(double v1, double v2){
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return String.valueOf(b1.add(b2));
    }

    public static String add(String v1, String v2){
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return String.valueOf(b1.add(b2));
    }

    public static String sub(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return String.valueOf(b1.subtract(b2));
    }

    public static String sub(String v1, String v2) {
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return String.valueOf(b1.subtract(b2));
    }

    public static String mul(double v1,double v2){
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return String.valueOf(b1.multiply(b2));
    }

    public static String mul(String v1,String v2){
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return String.valueOf(b1.multiply(b2));
    }

    public static String div(double v1,double v2){
        return div(v1, v2, DEF_DIV_SCALE);
    }

    public static String div(String v1, String v2){
        return div(v1,v2,DEF_DIV_SCALE);
    }

    public static String div(double v1,double v2,int scale){
        if (scale <0 ){
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return String.valueOf(b1.divide(b2,scale,BigDecimal.ROUND_HALF_UP));
    }

    public static String div(String v1,String v2,int scale){
        if(scale < 0){
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);

        BigDecimal result = null;
        try{
            result = b1.divide(b2);
        } catch (Exception e){
            result = b1.divide(b2,scale,BigDecimal.ROUND_HALF_UP);
        }
        return String.valueOf(result);
    }
    public static String round(double v, int scale){
        if (scale < 0){
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
            BigDecimal b = new BigDecimal(Double.toString(v));
            BigDecimal one = new BigDecimal("1");
            return String.valueOf(b.divide(one, scale,BigDecimal.ROUND_HALF_UP));
    }

    public static String round(String v, int String, int scale){
        if (scale < 0){
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
        BigDecimal b = new BigDecimal(v);
        BigDecimal one = new BigDecimal("1");
        b.divide(one,scale,BigDecimal.ROUND_HALF_UP);
        return  null;
    }
}
