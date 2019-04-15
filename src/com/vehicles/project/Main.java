package com.vehicles.project;

import java.util.*;

public class Main {

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        //Input data
        String[] inputList = new String[3];

        Map<String, String> carInputs = new HashMap<>();

        System.out.println("Introduce los datos del vehiculo: ");
        System.out.print("Matricula: ");
        carInputs.put("Plate", in.nextLine());

        System.out.print("Marca: ");
        carInputs.put("Brand", in.nextLine());

        System.out.print("Color: ");
        carInputs.put("Color", in.nextLine());

	    //Create vehicles
        Vehicle car = new Car(carInputs.get("Plate"), carInputs.get("Brand"), carInputs.get("Color"));

        System.out.println(car.brand);
        System.out.println(car.plate);
        System.out.println(car.color);

    }
}
