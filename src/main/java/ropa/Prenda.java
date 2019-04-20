package ropa;


public class Prenda {

    private double tempMin;
    private double tempMax;
    private String genero;
    private String talle;

    
    public Prenda(double _tempMin,double _tempMax,String _genero,String _talle ) {
    	tempMin = _tempMin;
    	tempMax = _tempMax;
    	genero = _genero;
    	talle = _talle;
    }

 
    
    
	public double getTempMin() {
		return tempMin;
	}
	public void setTempMin(double tempMin) {
		this.tempMin = tempMin;
	}
	public double getTempMax() {
		return tempMax;
	}
	public void setTempMax(double tempMax) {
		this.tempMax = tempMax;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getTalle() {
		return talle;
	}
	public void setTalle(String talle) {
		this.talle = talle;
	}
    
    

}
