package ArrayBidi;

import ArrayUnidimen.Metodos;
import EntradasSalidas.Tools;

public class AlmacenarDatosTabla {
	private Object matriz[][];
	private byte i,j; //i filas, j columnas
	
	public AlmacenarDatosTabla(byte m, byte n) {
		matriz = new Object[m][n];
		//m para filas y n para columnas
		i=-1;
		j=-1;
	}
	
	public boolean MatrizVacia() {
		return (i==-1 && j==-1);
	}
	
	public boolean isEspacioMatriz() {
		return (i<matriz.length && j<matriz[0].length);
	}
	
	public void LeerFilas() {
		byte k=0,l=0;
		if(isEspacioMatriz()) {
			for( k = (byte)(i+1);k<matriz.length;k++) {
				for( l=(byte)(j+1);l<matriz[0].length;l++) {
					matriz[k][l]= Tools.leerInt("Introduce el valor: ");
				}
			}
			i=k;j=l;
		}
	}
	
	public String verMatriz() {
		String cad="";
		for(byte k=0;k<matriz.length;k++) {
			for(byte l=0;l<matriz[0].length;l++) {
				cad+=matriz[k][l]+"      ";
			}
			cad+="\n";
		}
		return cad;
	}
	
	public int SummaDiagonal() {
		int suma = 0;
		for(byte k=0;k<matriz.length;k++) {
			for(byte l=0;l<matriz[0].length;l++){
				if(k==l){suma += (int)matriz[k][l];}
			}
		}
		return suma;
	}
	
	public String enOctal() {
		String cad="Datos almacenados \n";
		for(byte k=0;k< matriz.length;k++) {
			
			for(byte l=0;l<matriz[0].length;l++) {
				cad+=" ("+Metodos.decimalOctal((int) matriz[k][l])+")		";
			}
		cad+="\n";

	}return cad;
  }
	public String MatrizConstante(int valor[][]) {
		String cad="";
		for(byte k=0;k<valor.length;k++) {
			for (byte l=0;l<valor[0].length;l++) {
				cad+=" "+valor[k][l]+" ";
			}
			cad+="\n";
		}
		return cad;
	}

	
	public String MatrizTrianguloSuperior() {
		String cad="\n";byte t=0,p=0;
		for(byte k=0;k<matriz.length;k++) {
			for (byte l=0;l<matriz[0].length;l++) {
				if (t>p)
					cad+="|  "+matriz[k][l]+"  |";
				else 
					cad+="        ";
				t++;
			}
			p++;
			t=0;
			cad+="\n";
		}
		return cad;
	}
	public String MatrizTrianguloInferior() {
		String cad="";byte t=0,p=0;
		for(byte k=0;k<matriz.length;k++) {
			for (byte l=0;l<matriz[0].length;l++) {
				if (t<p)
					cad+="|  "+matriz[k][l]+"  |";
				t++;
			}
			p++;
			t=0;
			cad+="\n";
		}
		return cad;
	}
	
	public String ordenaBurbujaMatrizA(int[][] datos) {
		byte k, f;
		String cad="";
		Object ux;
		for (k = 0; k < datos.length; k++) {
			for (f = 0; f < datos[k].length - 1; f++) {
				if ((int) datos[k][f] > (int) datos[k][f + 1]) {
					ux = datos[k][f];
					datos[k][f] = datos[k][f + 1];
					datos[k][f + 1] = (int) ux;
					cad+=" "+datos[k][f];
				}
			}
			cad+=" "+datos[k][f]+"\n";
		}
	return cad;
	}
	
	public String ordenaBurbujaMatrizB(int[][] datos) {
	    String cad = "";
	    Object ux;
	    for (int k = 0; k < datos.length; k++) {
	        for (int f = 0; f < datos[k].length - 1; f++) {
	            if (datos[k][f] > datos[k][f + 1]) {
	                ux = datos[k][f];
	                datos[k][f] = datos[k][f + 1];
	                datos[k][f + 1] = (int) ux;
	            }
	        }
	        for (int i = 0; i < datos[k].length; i++) {
	            cad += " " + datos[k][i];
	        }
	        cad += "\n";
	    }
	    return cad;
	}
	
	public String ordenaBurbujaMatrizC(int[][] datos) {
	    String cad = ""; // Cadena para almacenar la salida
	    Object ux; // Variable auxiliar para hacer el intercambio de elementos
	    for (int k = 0; k < datos.length; k++) { // Itera sobre las filas de la matriz
	        for (int f = 0; f < datos[k].length - 1; f++) { // Itera sobre los elementos de cada fila
	            if (datos[k][f] > datos[k][f + 1]) { // Si el elemento actual es mayor que el siguiente
	                ux = datos[k][f]; // Se guarda el elemento actual en la variable auxiliar
	                datos[k][f] = datos[k][f + 1]; // Se intercambia el elemento actual por el siguiente
	                datos[k][f + 1] = (int) ux; // Se asigna el valor de la variable auxiliar al siguiente elemento
	            }
	        }
	        for (int i = 0; i < datos[k].length; i++) { // Itera sobre los elementos de la fila para crear la cadena de salida
	            cad += " " + datos[k][i]; // Agrega el elemento actual a la cadena, separado por un espacio
	        }
	        cad += "\n"; // Agrega un salto de línea al final de cada fila
	    }
	    return cad; // Retorna la cadena de salida
	}


}
