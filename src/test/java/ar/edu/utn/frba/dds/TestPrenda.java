package ar.edu.utn.frba.dds;

import org.junit.Assert;
import org.junit.Test;

import clima.Clima;
import excepciones.PrendasInsuficientesException;
import excepciones.UsuarioSinPrendasException;
import persona.Persona;
import ropa.tipo.*;
import ropero.Ropero;

public class TestPrenda {
Persona martin = new Persona();
Clima clima = new Clima(12.0);
Ropero ropero = new Ropero();



	
	@Test
	public void SugerenciaValida() throws Exception {
		Torso campera = new Torso(0.0,18.0,"M","42");
		Pie ojota = new Pie(22.0,45.0,"M","44");
		Pie zapatilla = new Pie(0.0,30.0,"M","44");
		Pierna jean = new Pierna(0.0,26.0,"M","48");
		ropero.setClima(clima);
		martin.agregarPrenda(campera);
		martin.agregarPrenda(ojota);
		martin.agregarPrenda(zapatilla);
		martin.agregarPrenda(jean);
	
	martin.SolicitarSugerencia(ropero); 

  Assert.assertTrue(ropero.sugerenciaValida());
	 
	}
	@Test(expected = PrendasInsuficientesException.class)
	public void SugerenciaInvalida() throws Exception {
		Torso campera = new Torso(0.0,18.0,"M","42");
		Pie ojota = new Pie(22.0,45.0,"M","44");
		Pierna jean = new Pierna(0.0,26.0,"M","48");
		ropero.setClima(clima);
		martin.agregarPrenda(campera);
		martin.agregarPrenda(ojota);
		martin.agregarPrenda(jean);
	martin.SolicitarSugerencia(ropero); 

  Assert.assertTrue(ropero.sugerenciaValida());
	 
	}
	
    @Test(expected = UsuarioSinPrendasException.class)
	public void RoperoVacio() throws Exception  {
    	ropero.setClima(clima);
    	martin.SolicitarSugerencia(ropero); 

    	  Assert.assertTrue(ropero.sugerenciaValida());
    		 
	}
    


}
