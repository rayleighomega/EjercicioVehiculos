package com.vehicles.project;

public class Wheel
{
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) {
		this.brand = brand;

		try
		{
			if (diameter >= 0.4 && diameter < 4)
			{
				this.diameter = diameter;
			}
			else
			{
				throw new Exception();
			}
		}
		catch (Exception e)
		{
			System.err.println("Diametro de la rueda incorrecto");
			System.out.println(" ");
			if (diameter < 0.4)
			{
				this.diameter = 0.4;
				System.err.println("No puede ser menor que 0.4, establecido al valor mínimo");
				System.out.println(" ");
			}
			else if (diameter > 4)
			{
				this.diameter = 4;
				System.err.println("No puede ser mayor que 4, establecido al valor máximo");
				System.out.println(" ");
			}

		}


	}

	public String getBrand()
	{
		return this.brand;
	}

	public Double getDiameter()
	{
		return this.diameter;
	}

}
