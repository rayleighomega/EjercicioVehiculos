package com.vehicles.project;

import java.util.*;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);
	}

	public void wheelsDefinition() throws Exception
	{

		Scanner in = new Scanner(System.in);

		/*#######################################################
            Add wheels
        #######################################################*/
		List<Wheel> vehicleFrontWheels = new ArrayList<>();
		List<Wheel> vehicleBackWheels = new ArrayList<>();
		Map<String, String> mapWheelsBrands = new HashMap<>();
		Map<String, Double> mapWheelsDiameters = new HashMap<>();

		//Front Wheel, verbose. A new method to catch the inputs is recommended
		System.out.print("Marca rueda delantera: ");
		mapWheelsBrands.put("FrontWheelBrand", in.nextLine());
		System.out.print("Diámetro rueda delantera: ");
		mapWheelsDiameters.put("FrontWheelDiameter", Double.parseDouble(in.nextLine()));

		vehicleFrontWheels.add(new Wheel(mapWheelsBrands.get("FrontWheelBrand"), mapWheelsDiameters.get("FrontWheelDiameter")));

		//Back Wheel
		System.out.print("Marca rueda trasera: ");
		mapWheelsBrands.put("BackWheelBrand", in.nextLine());
		System.out.print("Diámetro rueda izquierda: ");
		mapWheelsDiameters.put("BackWheelDiameter", Double.parseDouble(in.nextLine()));

		vehicleBackWheels.add(new Wheel(mapWheelsBrands.get("BackWheelBrand"), mapWheelsDiameters.get("BackWheelDiameter")));

		if (vehicleFrontWheels.size() == 1 && vehicleBackWheels.size() == 1)
		{
			this.addWheels(vehicleFrontWheels, vehicleBackWheels);
		}
		else
		{
			throw new Exception();
		}

	}
}
