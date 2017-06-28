package com.alexb.tools;

import java.util.List;

public class Fields{
	public String arrondissement;
	public String identifiant;
	public double x;
	public String numero_voie;
	public double y;
	public List<Double> geom_x_y;
	public Geom geom;
	public String horaires_ouverture;
	public int objectid;
	public String nom_voie;



	@Override
 	public String toString(){
		return 
			"Fields{" + 
			"arrondissement = '" + arrondissement + '\'' + 
			",identifiant = '" + identifiant + '\'' + 
			",x = '" + x + '\'' +
			",numero_voie = '" + numero_voie + '\'' +
			",y = '" + y + '\'' +
			",geom_x_y = '" + geom_x_y + '\'' +
			",geom = '" + geom + '\'' + 
			",horaires_ouverture = '" + horaires_ouverture + '\'' +
			",objectid = '" + objectid + '\'' + 
			",nom_voie = '" + nom_voie + '\'' +
			"}";
		}
}