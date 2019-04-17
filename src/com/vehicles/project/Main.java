package com.vehicles.project;

import java.util.*;


public class Main {

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        /*#######################################################
            Create a car
        #######################################################*/
        Map<String, String> vehicleInputs = new HashMap<>();

        System.out.println("Introduce los datos del vehiculo: ");
        System.out.print("Matricula: ");
        vehicleInputs.put("Plate", in.nextLine());

        System.out.print("Marca: ");
        vehicleInputs.put("Brand", in.nextLine());

        System.out.print("Color: ");
        vehicleInputs.put("Color", in.nextLine());

        System.out.println("Introduce tipo del vehiculo:");
        System.out.println("1. Coche");
        System.out.println("2. Bicicleta");

        //Get vehicle type from user
        int vehicleType = Integer.parseInt(in.next());

        Vehicle v; //must be declared outside of the switch statement

        switch (vehicleType)
        {
            case 1: v = new Car(vehicleInputs.get("Plate"), vehicleInputs.get("Brand"), vehicleInputs.get("Color"));    break;
            case 2: v = new Bike(vehicleInputs.get("Plate"), vehicleInputs.get("Brand"), vehicleInputs.get("Color"));   break;
            default: v = new Car(vehicleInputs.get("Plate"), vehicleInputs.get("Brand"), vehicleInputs.get("Color"));
        }

        //Add wheels to the current vehicle
        try
        {
            v.wheelsDefinition();
        }
        catch (Exception e)
        {
            System.out.println("Error en los datos de las ruedas");
        }

        /*#######################################################
            Results
        #######################################################*/
        System.out.println(v.brand);
        System.out.println(v.plate);
        System.out.println(v.color);

        List<Wheel> carWheelsResult = v.wheels;

        for (Wheel c : carWheelsResult)
        {
            System.out.println( c.getBrand() );
            System.out.println( c.getDiameter() );
        }

    }
}
