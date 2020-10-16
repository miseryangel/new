package com;

public class The_PMT_Challenge {
    public static void main(String[] args) {
        int a = 5;
        String str;
        for (int i =1; i<=10; i++){
            str = String.format("%d*%d=%d\n",a,i,a*i);
            System.out.printf(str);
            str = String.format(a+"*"+i+"="+a*i);
            System.out.println(str);
        }
    }
}
