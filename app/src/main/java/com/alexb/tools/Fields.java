package com.alexb.tools;

import java.util.List;

public class Fields{
	private String arrondissement;
	private String identifiant;
	private double X;
	private String numeroVoie;
	private double Y;
	private List<Double> geomXY;
	private Geom geom;
	private String horairesOuverture;
	private int objectid;
	private String nomVoie;

	public void setArrondissement(String arrondissement){
		this.arrondissement = arrondissement;
	}

	public String getArrondissement(){
		return arrondissement;
	}

	public void setIdentifiant(String identifiant){
		this.identifiant = identifiant;
	}

	public String getIdentifiant(){
		return identifiant;
	}

	public void setX(double X){
		this.X = X;
	}

	public double getX(){
		return X;
	}

	public void setNumeroVoie(String numeroVoie){
		this.numeroVoie = numeroVoie;
	}

	public String getNumeroVoie(){
		return numeroVoie;
	}

	public void setY(double Y){
		this.Y = Y;
	}

	public double getY(){
		return Y;
	}

	public void setGeomXY(List<Double> geomXY){
		this.geomXY = geomXY;
	}

	public List<Double> getGeomXY(){
		return geomXY;
	}

	public void setGeom(Geom geom){
		this.geom = geom;
	}

	public Geom getGeom(){
		return geom;
	}

	public void setHorairesOuverture(String horairesOuverture){
		this.horairesOuverture = horairesOuverture;
	}

	public String getHorairesOuverture(){
		return horairesOuverture;
	}

	public void setObjectid(int objectid){
		this.objectid = objectid;
	}

	public int getObjectid(){
		return objectid;
	}

	public void setNomVoie(String nomVoie){
		this.nomVoie = nomVoie;
	}

	public String getNomVoie(){
		return nomVoie;
	}

	@Override
 	public String toString(){
		return 
			"Fields{" + 
			"arrondissement = '" + arrondissement + '\'' + 
			",identifiant = '" + identifiant + '\'' + 
			",x = '" + X + '\'' + 
			",numero_voie = '" + numeroVoie + '\'' + 
			",y = '" + Y + '\'' + 
			",geom_x_y = '" + geomXY + '\'' + 
			",geom = '" + geom + '\'' + 
			",horaires_ouverture = '" + horairesOuverture + '\'' + 
			",objectid = '" + objectid + '\'' + 
			",nom_voie = '" + nomVoie + '\'' + 
			"}";
		}
}