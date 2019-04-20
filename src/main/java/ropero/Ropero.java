package ropero;

import java.util.ArrayList;

import clima.Clima;
import excepciones.PrendasInsuficientesException;
import excepciones.UsuarioSinPrendasException;
import ropa.Prenda;


import ropa.tipo.*;
public class Ropero {
	public ArrayList<Prenda> recomendacion = new ArrayList<Prenda>();
	public Clima clima;


public ArrayList<Prenda> sugerir(ArrayList<Prenda> prendas) throws UsuarioSinPrendasException{
		
	if (prendas.size()==0) {
		throw new UsuarioSinPrendasException();
	}
	for(Prenda prenda:prendas) {
		if (prenda.getTempMax() >= clima.getTempActual() && prenda.getTempMin() <= clima.getTempActual()) {
			recomendacion.add(prenda);}
		
	}
	return recomendacion; 
	
}
public Clima getClima() {
	return clima;
}
public void setClima(Clima clima) {
	this.clima = clima;
}
public boolean  sugerenciaValida()  throws  PrendasInsuficientesException{
	if ((this.cantPrendaTorso()>=1)&& (this.cantPrendaPierna()>=1) && (this.cantPrendaPie()>=1))
		return true;
	else 
		throw new PrendasInsuficientesException() ;
	
   
	
}


public ArrayList<Prenda> getRecomendacion() {
	return recomendacion;
}
public void setRecomendacion(ArrayList<Prenda> recomendacion) {
	this.recomendacion = recomendacion;
}
public long cantPrendaTorso() {
return	recomendacion.stream().filter(prenda -> prenda.getClass().equals(Torso.class)).count();
}
public long cantPrendaPierna() {
	return	recomendacion.stream().filter(prenda -> prenda.getClass().equals(Pierna.class)).count();

}
public long cantPrendaPie() {
	return	recomendacion.stream().filter(prenda -> prenda.getClass().equals(Pie.class)).count();

}


}
