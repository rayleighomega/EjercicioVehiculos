package com.vehicles.project;

import java.util.*;


public class Main {

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        /*#######################################################
            Create a car
        #######################################################*/
        Map<String, String> carInputs = new HashMap<>();

        System.out.println("Introduce los datos del vehiculo: ");
        System.out.print("Matricula: ");
        carInputs.put("Plate", in.nextLine());

        System.out.print("Marca: ");
        carInputs.put("Brand", in.nextLine());

        System.out.print("Color: ");
        carInputs.put("Color", in.nextLine());

        Vehicle car = new Car(carInputs.get("Plate"), carInputs.get("Brand"), carInputs.get("Color"));

        /*#######################################################
            Add wheels
        #######################################################*/
        List<Wheel> carFrontWheels = new ArrayList<>();
        List<Wheel> carBackWheels = new ArrayList<>();
        Map<String, String> mapWheelsBrands = new HashMap<>();
        Map<String, Double> mapWheelsDiameters = new HashMap<>();

        //Front Wheels
        System.out.print("Marca ruedas delanteras: ");
        mapWheelsBrands.put("FrontWheelBrand", in.nextLine());
        System.out.print("Diámetro ruedas delanteras: ");
        mapWheelsDiameters.put("FrontWheelDiameter", Double.parseDouble(in.nextLine()));

        carFrontWheels.add(new Wheel(mapWheelsBrands.get("FrontWheelBrand"), mapWheelsDiameters.get("FrontWheelDiameter")));
        carFrontWheels.add(new Wheel(mapWheelsBrands.get("FrontWheelBrand"), mapWheelsDiameters.get("FrontWheelDiameter")));

        //Front Wheels
        System.out.print("Marca ruedas traseras: ");
        mapWheelsBrands.put("BackWheelBrand", in.nextLine());
        System.out.print("Diámetro ruedas traseras: ");
        mapWheelsDiameters.put("BackWheelDiameter", Double.parseDouble(in.nextLine()));

        carBackWheels.add(new Wheel(mapWheelsBrands.get("BackWheelBrand"), mapWheelsDiameters.get("BackWheelDiameter")));
        carBackWheels.add(new Wheel(mapWheelsBrands.get("BackWheelBrand"), mapWheelsDiameters.get("BackWheelDiameter")));

        try
        {
            ((Car) car).addWheels(carFrontWheels, carBackWheels);
        }
        catch (Exception e)
        {
            System.out.println("Error en los datos de las ruedas");
        }

        /*#######################################################
            Results
        #######################################################*/
        System.out.println(car.brand);
        System.out.println(car.plate);
        System.out.println(car.color);

        List<Wheel> carWheelsResult = car.wheels;

        for (Wheel c : carWheelsResult)
        {
            System.out.println( c.getBrand() );
            System.out.println( c.getDiameter() );
        }

    }
}
