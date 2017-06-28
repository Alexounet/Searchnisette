package com.alexb.tools;

import java.util.List;

public class Geom{
	public List<Double> coordinates;
	public String type;



	@Override
 	public String toString(){
		return 
			"Geom{" + 
			"coordinates = '" + coordinates + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}