package com.company;

public class Main {

    public static void main(String[] args) {
	    //the Math class is the heaviest used class in java
        //its like a type of code that we tap into
            //specifics
            //double p =      Math.    abs          (double           a)
        //---return type-----class----name-------what it takes----sample/dummy
        double p = Math.abs(-17);
        System.out.println(p);

        //method signatures are important to understand
        //void methods don't return... they just DO things

        /*name - method signature
        sqrt - square root
        double sqrt(double e)
        ceil (rounds up)
        max (takes two numbers and return the larger one)
        min (same but smaller)
        PI (returns pi)
        random (returns random number in a set of parameters)... **** returns a number from zero to one without returning one ****
        */
        double rd = (int)(Math.random()*101);
        System.out.println(rd);
    }
}
