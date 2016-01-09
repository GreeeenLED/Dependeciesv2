package com.example.atitude6430.dependeciesv2;

import javax.inject.Inject;

/**
 * Created by Atitude6430 on 2016-01-09.
 */
public class Vehicle {
    private Motor motor;

    @Inject
    public Vehicle(Motor motor){
        this.motor = motor;
    }

    public void increaseSpeed(int value){
        motor.accelerate(value);
    }

    public void stop(){
        motor.brake();
    }

    public int getSpeed(){
        return motor.getRpm();
    }
}
