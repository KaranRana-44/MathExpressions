package com.company;

public class Main {

    public static void main(String[] args) {
	double r = Math.random(); //[0.0, 1.0)
	System.out.println(r);
	r= Math.random() * 10;
	System.out.println(r);
	int p = (int)(Math.random()*10);
	System.out.println(p);
	p = (int)(Math.random()*10)+ 1;
	System.out.println(p);
	p = (int)(Math.random()*10)+ 21;
	System.out.println(p);
    }
}
