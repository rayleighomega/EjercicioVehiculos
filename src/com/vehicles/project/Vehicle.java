package com.vehicles.project;

import java.util.*;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<>();

	public Vehicle(String plate, String brand, String color)
	{
		try
		{
			if (CheckPlate(plate))
			{
				this.plate = plate;
			}
			else
			{
				throw new Exception();
			}
		}
		catch (Exception e)
		{
			System.out.println("Error en el formato de la matricula");
			this.plate = "";
		}

		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}

	private boolean CheckPlate(String plate)
	{
		int charCounter = 0;
		int digitCounter = 0;

		boolean plateOk;

		char[] charArray = plate.toCharArray();

		for (char c : charArray)
		{
			if(!Character.isDigit(c))
			{
				charCounter++;
			}
			else
			{
				digitCounter++;
			}
		}

		if (digitCounter == 4 && charCounter >=2 && charCounter < 4 )
		{
			 plateOk = true;
		}
		else
		{
			plateOk = false;
		}

		return plateOk;
	}


	public abstract void wheelsDefinition() throws Exception;


	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels)
	{
		for (Wheel w : frontWheels)
		{
			this.wheels.add(w);
		}

		for (Wheel w : backWheels)
		{
			this.wheels.add(w);
		}

	}

}
