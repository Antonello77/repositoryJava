package PennExc;

public class Pen {

    String colore;
    String marca;
    String tipo;
    
    
    
    
    
    
	public Pen(String colore, String marca, String tipo) {
	
		this.colore = colore;
		this.marca = marca;
		this.tipo = tipo;
	}
	

	public String getColore() {
		return colore;
	}
	
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "Pen: colore = " + colore
				+ ", marca = " + marca 
				+ ", tipo = " + tipo ;
	}
    
    

	public  void StampaPenna(Pen pen) {
		
		System.out.println(pen.toString());
		
	}
	
	
	

}
