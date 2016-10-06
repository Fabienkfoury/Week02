package com.example.fabien.myvehicle;

/**
 * Created by Fabien on 06/10/2016.
 */

public class Vehicle {
    private String make;
    private int year;
    private String message;
    public static int counter=0;

    // The reason we need more than one constructor is that the user may not provide all the info we need.
    // In case this happens, we'll use the default values stored in our class.

    // the default constructor
    public Vehicle() {
        this.make="volvo";
        this.year=2012;
        this.message="This is a default message";

    }

    //This constructor takes to parameters.
    public Vehicle(String make,int year) {
        this.make = make;
        this.year=year;
        this.message="Your car is a " + make + "built int" +year;
        count();
    }

    public Vehicle(String make) {
        this();
        this.make = make;
        message="you didn't type in year value";
        count();
    }

    public String getMessage() {
        return message;
    }

     // C'est une méthode , le @ is called an annotations.
    //When Java compiler sees it, it double-checks that the subclass is overriding a method with the same signature in the superclass.
    // By overriding I meant a method with the same signature. If this is not the case, the compiler will complain.
    // There're quite a number of annotations in Java, but this Override is what you see the most in Android.
     @Override
    public String toString() {
        return super.toString();
    }

    private void count(){
        counter++;
    }
}

