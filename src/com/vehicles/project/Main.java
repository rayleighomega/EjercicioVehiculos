package com.vehicles.project;

import java.util.*;


public class Main {

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        //Input data
        Map<String, String> carInputs = new HashMap<>();

        System.out.println("Introduce los datos del vehiculo: ");
        System.out.print("Matricula: ");
        carInputs.put("Plate", in.nextLine());

        System.out.print("Marca: ");
        carInputs.put("Brand", in.nextLine());

        System.out.print("Color: ");
        carInputs.put("Color", in.nextLine());

        //Create a car
        Vehicle car = new Car(carInputs.get("Plate"), carInputs.get("Brand"), carInputs.get("Color"));

        //Add wheels
        List<Wheel> carFrontWheels = new ArrayList<>();
        System.out.println("Introduce marca y diámetro de las ruedas delanteras:");
        carFrontWheels.add(new Wheel(in.nextLine(), Double.parseDouble(in.nextLine())));
        carFrontWheels.add(new Wheel(in.nextLine(), Double.parseDouble(in.nextLine())));

        List<Wheel> carBackWheels = new ArrayList<>();
        System.out.println("Introduce marca y diámetro de las ruedas traseras:");
        carBackWheels.add(new Wheel(in.nextLine(), Double.parseDouble(in.nextLine())));
        carBackWheels.add(new Wheel(in.nextLine(), Double.parseDouble(in.nextLine())));

        try
        {
            ((Car) car).addWheels(carFrontWheels, carBackWheels);
        }
        catch (Exception e)
        {
            System.out.print("Error en los datos de las ruedas");
        }

        System.out.println(car.brand);
        System.out.println(car.plate);
        System.out.println(car.color);

        List<Wheel> carWheelsResult = car.Get();

        for (Wheel c : carWheelsResult)
        {
            System.out.println( c. );
        }

    }
}
