package com.alexb.tools;

public class Response{
	private String recordid;
	private String datasetid;
	private Geometry geometry;
	private Fields fields;
	private String recordTimestamp;

	public void setRecordid(String recordid){
		this.recordid = recordid;
	}

	public String getRecordid(){
		return recordid;
	}

	public void setDatasetid(String datasetid){
		this.datasetid = datasetid;
	}

	public String getDatasetid(){
		return datasetid;
	}

	public void setGeometry(Geometry geometry){
		this.geometry = geometry;
	}

	public Geometry getGeometry(){
		return geometry;
	}

	public void setFields(Fields fields){
		this.fields = fields;
	}

	public Fields getFields(){
		return fields;
	}

	public void setRecordTimestamp(String recordTimestamp){
		this.recordTimestamp = recordTimestamp;
	}

	public String getRecordTimestamp(){
		return recordTimestamp;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"recordid = '" + recordid + '\'' + 
			",datasetid = '" + datasetid + '\'' + 
			",geometry = '" + geometry + '\'' + 
			",fields = '" + fields + '\'' + 
			",record_timestamp = '" + recordTimestamp + '\'' + 
			"}";
		}
}
