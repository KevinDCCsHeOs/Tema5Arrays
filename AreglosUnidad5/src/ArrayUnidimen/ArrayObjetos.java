package ArrayUnidimen;

import EntradasSalidas.Tools;

public class ArrayObjetos {
	
	private Rectangulo datos[];
	private byte i;
	
	public ArrayObjetos() {}
	public ArrayObjetos(byte tam) {
		datos = new Rectangulo[tam];
		i=-1;
	}
	
	public boolean ArrayVacio() {
		return i==-1;
	}
	
	public boolean hayEspacio() {
		return i<datos.length-1;
	}
	
	public Rectangulo crearObjeto() {
		Rectangulo rec = new Rectangulo();
		rec.setAltura(Tools.leerFloat("Altura del rectangulo: "));
		rec.setBase(Tools.leerFloat("Base del rectangulo: "));
		return rec;
	}
	
	public void AñadirDatos() {
		if (hayEspacio()) {
			i++;
			datos[i]= crearObjeto();
		} else {
			Tools.salidaError("Array lleno");
		}
	}
	
	public String imprimeDatosArray() {
		int j;String cad="";
		for(j=0;j<=i;j++) {
			cad += j+"\n"+datos[j].toString()+"\n";
		}
		return cad;
	}
}
