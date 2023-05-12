package ArrayUnidimen;

import EntradasSalidas.Tools;


public class AlmacenarDatos {
	private Object datos[];
	private byte i;
	
	public AlmacenarDatos(int max) {
		datos = new Object[max];
		i=-1; //indica que el arreglo está vacio
	}
	
	public boolean arrayVacio() {
		return (i == -1);
	}
	
	public boolean isEspacio() {
		return (i<datos.length-1);
	}
	
	public void AñadirDatos(Object valor) {
		if (isEspacio()) {
			i++;
			datos[i]=valor;
		} else {
			Tools.salidaError("Array lleno");
		}
	}
	public String imprimeDatosArray() {
		int j;String cad="";
		for(j=0;j<=i;j++) {
			cad += j+"["+datos[j]+"]\n";
		}
		return cad;
	}
	
	public String imprimePrimos() {
		String cad = "";
		for(byte j=0;j<=i;j++) {
			if (Metodos.isPrime((int)datos[j])) cad +=j+" ["+datos[j]+"]\n";
		}
		return cad;
	}
	
	public String imprimeBinario() {
		String cad="";
		for(byte j=0;j<=i;j++) {
			cad+="["+j+"] "+datos[j]+" "+Metodos.intToBinary((int) datos[j])+"\n";
		}//((short) datos[j])+"\n";
		return cad;
	}
	
	public String imprimeFrecuencia() {
		String cad="";
		for(byte j=0;j<=i;j++) {
			cad+=" ["+j+"] "+datos[j]+Metodos.imprimeFrecuencia((int)datos[j])+"\n";
		}
		return cad;
	}
	
	public String imprimeSuma(int valor[]) {
		String cad="";
		for(byte j=0;j<=valor.length-1;j++) {
			cad+=" ["+ j+"] "+valor[j]+" Numero invertido "+Metodos.sumaDigitos( valor[j])+"\n";
		}
		return cad;
	}
	
	public void ordenaBurbuja() {
		byte k,f;
		Object aux;
		for(k=0;k<i;k++) 
			for(f=(byte)(k+1);f<=i;f++) {
				if((int)datos[k]>(int)datos[f]) {
					aux = datos[k];
					datos[k]=datos[f];
					datos[f]=aux;
				}
			}
	}
	
	public String imprimePares() {
		String cad="";
		for(byte j=0;j<=i;j++) {
			if (Metodos.NumeroPar((int)datos[j])) {
				cad += " ["+j+"] "+datos[j]+"\n";
			}
				
			//cad+=" ["+j+"] "+datos[j]+Metodos.NumeroPar( datos[j]+"\n");
		}
		return cad;
	}
	
	public String imprimeImpares() {
		String cad = "";
		for(byte j=0;j<=i;j++) {
			
		}
		return cad;
	}
	
	//pdv
	
	public void datosAleatorios(int num) {
		int dat;byte par=0,impar=0,ceros=0;
		for (byte f=0;f<num;f++) {
			dat=(byte)(1+Math.random()*100);
			AñadirDatos(dat);
		}
		for(byte j=0;j<num;j++) {
			if(Metodos.Cero((int)datos[j]))
				ceros+=1;
			else if(Metodos.NumeroPar((int)datos[j]))
				par+=1;
			else if (Metodos.NumeroImpar((int)datos[j]))
				impar+=1;
		}
		Tools.imprimeSalida(imprimeDatosArray()+"\n Numero de pares:"+par+
				"\n Numero de impares:"+impar+"\n Numero de ceros:"+ceros);
	}
	public void PersonasAltura(int n) {
		float x,sumAltura=0,media;byte alSup=0,alMen=0;
		if (Metodos.ValidaPosEnt(n)) Tools.salidaError("Solo se permiten enteros positivos");
		else {
			for (byte j=0;j<n;j++) {
				x=Tools.leerFloat("Introduce la altura en centimetros de la persona "+j);
				AñadirDatos(x);
			}
			for (byte k=0;k<n;k++) {
				sumAltura+=(float)datos[k];
			}
			media=sumAltura/n;
			for (byte l=0;l<n;l++) {
				if ((float)datos[l]>media) alSup++;
				else alMen++;
			}
			Tools.imprimeSalida("Los datos capturados son:\n"+imprimeDatosArray()+"\nAltura Media: "+media+
					"\nPersonas mayores a la altura media:"+alSup+"\nPersonas menores a la altura media:"+alMen);
		}
	}
	public void CadenasTexto(int n) {
		String x,cad="";
		for (byte j=0;j<n;j++) {
			x=Tools.leerString("Introduce la cadena "+j);
			AñadirDatos(x);
		}
		for (byte k=0;k<n;k++) {
			cad+=Metodos.CadenaAlRevez((String)datos[k])+"\n";
		}	
		Tools.imprimeSalida("Datos capturados:\n"+imprimeDatosArray()+"\n\nCadenas invertidas y tamaño de las mismas:\n"+cad);
	}
	public void Taxista() {
		int x,sum=0,carr = 0,dia,diaEsp = 0;
		for (byte j=0;j<30;j++) {
			x=Tools.leerInt("Introduce el numero de carreras del dia "+j);
			AñadirDatos(x);
			sum+=Metodos.PrecioDeCarreras((int)datos[j]);
			carr+=(int)datos[j];
		}
		dia=(int)datos[0];
		for (byte k=1;k<30;k++) {
			if(dia<(int)datos[k]) {
				dia=(int)datos[k];
				diaEsp=k;
			}
		}
		Tools.imprimeSalida("Datos capturados:\n"+imprimeDatosArray()+
				"\nEl dia que mas carreras hizo: "+
				diaEsp+"\nDinero ganado en todo el mes: "+sum
				+"\nPromedio de carreras hechas por dia: "+(carr/30));
	}
}
