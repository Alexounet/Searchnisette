package com.alexb.tools;

import java.util.List;

public class Geometry{
	public List<Double> coordinates;
	public String type;


	@Override
 	public String toString(){
		return 
			"Geometry{" + 
			"coordinates = '" + coordinates + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}