package com.example.atitude6430.dependeciesv2;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Vehicle vehicle;
    VehicleComponent component;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        component = DaggerVehicleComponent.builder().build();

        vehicle = component.provideVehicle();
        vehicle.increaseSpeed(2);
        vehicle.stop();
        //vehicle = component.provideVehicle();
        Toast.makeText(this, String.valueOf(vehicle.getSpeed()), Toast.LENGTH_SHORT).show();
    }
}
