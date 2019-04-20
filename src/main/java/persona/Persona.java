package persona;

import java.util.ArrayList;



import excepciones.UsuarioSinPrendasException;

import ropa.Prenda;
import ropero.Ropero;

public class Persona {
ArrayList<Prenda> prendas = new ArrayList<Prenda>();
Ropero ropero ;

public ArrayList<Prenda> SolicitarSugerencia(Ropero ropero) throws UsuarioSinPrendasException {
	
	return ropero.sugerir(prendas);
}

public void agregarPrenda(Prenda prenda){
	prendas.add(prenda);
}
public void removerPrenda(Prenda prenda){
	prendas.remove(prenda);
}

public ArrayList<Prenda> getPrendas() {
	return prendas;
}

public void setPrendas(ArrayList<Prenda> prendas) {
	this.prendas = prendas;
}


}
