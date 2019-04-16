package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

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

	public boolean CheckPlate(String plate)
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

}
