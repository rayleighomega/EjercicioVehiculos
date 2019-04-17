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
		System.out.print("Marca rueda delanteras: ");
		mapWheelsBrands.put("FrontWheelBrand", in.nextLine());
		System.out.print("Diámetro rueda delanteras: ");
		mapWheelsDiameters.put("FrontWheelDiameter", Double.parseDouble(in.nextLine()));

		vehicleFrontWheels.add(new Wheel(mapWheelsBrands.get("FrontWheelBrand"), mapWheelsDiameters.get("FrontWheelDiameter")));
		vehicleFrontWheels.add(new Wheel(mapWheelsBrands.get("FrontWheelBrand"), mapWheelsDiameters.get("FrontWheelDiameter")));

		//Back Wheels
		System.out.print("Marca rueda trasera izquierda: ");
		mapWheelsBrands.put("BackLeftWheelBrand", in.nextLine());
		System.out.print("Diámetro rueda trasera izquierda: ");
		mapWheelsDiameters.put("BackWheelDiameter", Double.parseDouble(in.nextLine()));

		System.out.print("Marca ruedas traseras: ");
		mapWheelsBrands.put("BackWheelBrand", in.nextLine());
		System.out.print("Diámetro ruedas traseras: ");
		mapWheelsDiameters.put("BackWheelDiameter", Double.parseDouble(in.nextLine()));

		vehicleBackWheels.add(new Wheel(mapWheelsBrands.get("BackWheelBrand"), mapWheelsDiameters.get("BackWheelDiameter")));
		vehicleBackWheels.add(new Wheel(mapWheelsBrands.get("BackWheelBrand"), mapWheelsDiameters.get("BackWheelDiameter")));

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
