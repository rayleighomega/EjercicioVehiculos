package com.vehicles.project;

import java.util.*;

public class Car extends Vehicle {

	public Car(String plate, String brand, String color) {
		super(plate, brand, color);
	}

	public void wheelsDefinition()  throws Exception
	{

		Scanner in = new Scanner(System.in);

		/*#######################################################
            Add wheels
        #######################################################*/
		List<Wheel> vehicleFrontWheels = new ArrayList<>();
		List<Wheel> vehicleBackWheels = new ArrayList<>();
		Map<String, String> mapWheelsBrands = new HashMap<>();
		Map<String, Double> mapWheelsDiameters = new HashMap<>();


		//Front Wheels, verbose. A new method to catch the inputs is recommended
		System.out.print("Marca rueda delantera izquierda: ");
		mapWheelsBrands.put("FrontLeftWheelBrand", in.nextLine());
		System.out.print("Diámetro rueda delantera izquierda: ");
		mapWheelsDiameters.put("FrontLeftWheelDiameter", Double.parseDouble(in.nextLine()));

		System.out.print("Marca rueda delantera derecha: ");
		mapWheelsBrands.put("FrontRightWheelBrand", in.nextLine());
		System.out.print("Diámetro rueda delantera derecha: ");
		mapWheelsDiameters.put("FrontRightWheelDiameter", Double.parseDouble(in.nextLine()));

		vehicleFrontWheels.add(new Wheel(mapWheelsBrands.get("FrontLeftWheelBrand"), mapWheelsDiameters.get("FrontLeftWheelDiameter")));
		vehicleFrontWheels.add(new Wheel(mapWheelsBrands.get("FrontRightWheelBrand"), mapWheelsDiameters.get("FrontRightWheelDiameter")));

		//Back Wheels
		System.out.print("Marca rueda trasera izquierda: ");
		mapWheelsBrands.put("BackLeftWheelBrand", in.nextLine());
		System.out.print("Diámetro rueda trasera izquierda: ");
		mapWheelsDiameters.put("BackLeftWheelDiameter", Double.parseDouble(in.nextLine()));

		System.out.print("Marca rueda trasera derecha: ");
		mapWheelsBrands.put("BackRightWheelBrand", in.nextLine());
		System.out.print("Diámetro rueda trasera derecha: ");
		mapWheelsDiameters.put("BackRightWheelDiameter", Double.parseDouble(in.nextLine()));

		vehicleBackWheels.add(new Wheel(mapWheelsBrands.get("BackLeftWheelBrand"), mapWheelsDiameters.get("BackLeftWheelDiameter")));
		vehicleBackWheels.add(new Wheel(mapWheelsBrands.get("BackRightWheelBrand"), mapWheelsDiameters.get("BackRightWheelDiameter")));

		if (vehicleFrontWheels.size() == 2 && vehicleBackWheels.size() == 2)
		{
			this.addWheels(vehicleFrontWheels, vehicleBackWheels);
		}
		else
		{
			throw new Exception();
		}


	}
}
