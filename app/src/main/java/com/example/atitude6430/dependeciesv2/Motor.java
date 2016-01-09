package com.example.atitude6430.dependeciesv2;

/**
 * Created by Atitude6430 on 2016-01-09.
 */
public class Motor {
    private int rpm;

    public Motor(){
        this.rpm = 0;
    }

    public int getRpm(){
        return rpm;
    }

    public void accelerate(int value){
        rpm = rpm + value;
    }

    public void brake(){
        rpm = 0;
    }
}
