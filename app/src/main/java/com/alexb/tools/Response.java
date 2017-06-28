package com.alexb.tools;

public class Response{
	public String recordid;
	public String datasetid;
	public Geometry geometry;
	public Fields fields;
	public String record_timestamp;



	@Override
 	public String toString(){
		return 
			"Response{" + 
			"recordid = '" + recordid + '\'' + 
			",datasetid = '" + datasetid + '\'' + 
			",geometry = '" + geometry + '\'' + 
			",fields = '" + fields + '\'' + 
			",record_timestamp = '" + record_timestamp + '\'' +
			"}";
		}
}
