package com.vehicles.project;

import java.util.*;


public class Main {

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        /*#######################################################
            Input Data
        #######################################################*/
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

        /*#######################################################
            Add wheels
        #######################################################*/
        List<Wheel> carFrontWheels = new ArrayList<>();
        List<Wheel> carBackWheels = new ArrayList<>();
        Map<String, String> mapWheelsBrands = new HashMap<>();
        Map<String, Double> mapWheelsDiameters = new HashMap<>();

        //Front Wheels
        System.out.print("Marca rueda delantera izquierda: ");
        mapWheelsBrands.put("FrontLeftWheelBrand", in.nextLine());
        System.out.print("Diámetro rueda delantera izquierda: ");
        mapWheelsDiameters.put("FrontLeftWheelDiameter", Double.parseDouble(in.nextLine()));

        System.out.print("Marca rueda delantera derecha: ");
        mapWheelsBrands.put("FrontRightWheelBrand", in.nextLine());
        System.out.print("Diámetro rueda delantera derecha: ");
        mapWheelsDiameters.put("FrontRightWheelDiameter", Double.parseDouble(in.nextLine()));

        carFrontWheels.add(new Wheel(mapWheelsBrands.get("FrontLeftWheelBrand"), mapWheelsDiameters.get("FrontLeftWheelDiameter")));
        carFrontWheels.add(new Wheel(mapWheelsBrands.get("FrontRightWheelBrand"), mapWheelsDiameters.get("FrontRightWheelDiameter")));

        //Front Wheels
        System.out.print("Marca rueda trasera izquierda: ");
        mapWheelsBrands.put("BackLeftWheelBrand", in.nextLine());
        System.out.print("Diámetro rueda trasera izquierda: ");
        mapWheelsDiameters.put("BackLeftWheelDiameter", Double.parseDouble(in.nextLine()));

        System.out.print("Marca rueda trasera derecha: ");
        mapWheelsBrands.put("BackRightWheelBrand", in.nextLine());
        System.out.print("Diámetro rueda trasera derecha: ");
        mapWheelsDiameters.put("BackRightWheelDiameter", Double.parseDouble(in.nextLine()));

        carBackWheels.add(new Wheel(mapWheelsBrands.get("BackLeftWheelBrand"), mapWheelsDiameters.get("BackLeftWheelDiameter")));
        carBackWheels.add(new Wheel(mapWheelsBrands.get("BackRightWheelBrand"), mapWheelsDiameters.get("BackRightWheelDiameter")));

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
