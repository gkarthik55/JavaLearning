package com.java.learning22.designpatterns.abstractfactorydesignpattern;

public class ComputerFactory 
{
	public static Computer createComputer(ComputerAbstractFactory caf)
	{
		return caf.createComputer();
	}
}