package TestMetodos;

import java.util.Random;

import javax.swing.JOptionPane;

import ArrayBidi.AlmacenarDatosTabla;
import ArrayUnidimen.AlmacenarDatos;
import ArrayUnidimen.ArrayObjetos;
import EntradasSalidas.Tools;

public class TestAlmacenarDatos {
	public static void main(String []Args) {
		//menu2("Aleatorios,Agregar,Imprimir,Primo,Binario,Constantes,Ordena,Frecuencia,Salir");
		//menuArrayS("Agregar,Imprimir,Salir");
		menuArrayMatriz("MatrizDos");
	}
	
	public static void menu2(String menu) {
		String sel;
		int dato;
		AlmacenarDatos contenido = new AlmacenarDatos(Tools.leerInt("Valor maximo: "));
		do {
			sel=desplegable(menu);
			switch (sel) {
			case "Agregar":
					contenido.AñadirDatos(Tools.leerInt(Short.MIN_VALUE+"{Ingresa un entero corto} "+Short.MAX_VALUE));
					Tools.imprimeSalida("Datos almacenados: \n"+contenido.imprimeDatosArray());
				break;
			case "Primo":
					if(contenido.arrayVacio()) {Tools.salidaError("Array Vacio...agregar datos");} 
					Tools.imprimeSalida("Números primos:\n"+contenido.imprimePrimos());
				break;
			case "Binario":
					if(contenido.arrayVacio()) {Tools.salidaError("Array Vacio...agregar datos");}
					Tools.imprimeSalida("Equivalente en Binario de los Datos almacenados \n"+contenido.imprimeBinario());
				break;
			case "Aleatorios":;
					Random aleatorio = new Random();
					dato= aleatorio.nextInt(101);
					contenido.AñadirDatos(dato);
					Tools.imprimeSalida("Datos almacenados \n"+contenido.imprimeDatosArray());
				break;
			case "Constantes":
					int a[]= {35,-12,41,82,35,247,-71};
					Tools.imprimeSalida("Datos almacenados \n"+contenido.imprimeSuma(a));
				break;
			case "Frecuencia":
				if(contenido.arrayVacio()) {Tools.salidaError("Array Vacio...agregar datos");}
				Tools.imprimeSalida("Frecuancia de cada número+\n"+contenido.imprimeFrecuencia()+"\n");
				break;
			case "Ordena":
				if(contenido.arrayVacio()) {Tools.salidaError("Array Vacio...agregar datos");}
				else {contenido.ordenaBurbuja();
						Tools.imprimeSalida(contenido.imprimeDatosArray());
				}
				break;
			case "Imprimir":
					if(contenido.arrayVacio()) {Tools.salidaError("Array Vacio...insertar datos");} 
					Tools.imprimeSalida("Datos almacenados\n"+contenido.imprimeDatosArray()+"Números primos: \n"+
					contenido.imprimePrimos()+"Números en binarios: \n"+contenido.imprimeBinario());
				break;
			case "Salir":Tools.imprimeSalida("Saliendo...");;break;
			}//switch
		}while (!sel.equalsIgnoreCase("Salir"));
	}
	
	public static String desplegable(String menu) {
		String valores []=menu.split(",");
		String res= (String)JOptionPane.showInputDialog(null,"M E N U","Selecciona opcion:",
				JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return (res);
	}
	
	public static void menuN(String mmenu) {
		String sel;
		int dat;
		AlmacenarDatos dato = new AlmacenarDatos(Tools.leerInt("Valor maximo de espacios en el areglo: "));
		do {
			sel= desplegable(mmenu);
			switch(sel) {
			case "Taxi":
				dato.Taxista();
				break;
			case "Cadena":
				dato.CadenasTexto(Tools.leerInt("Entero: "));
				break;
			case "AleatoriosDos":
				dato.datosAleatorios(Tools.leerInt("Entero: "));
				break;
			case "Altura":
				dato.PersonasAltura(Tools.leerInt("Entero: "));
				break;
			case "Agregar":
				dato.AñadirDatos(Tools.leerInt(Short.MIN_VALUE+"{Ingresa un entero corto} "+Short.MAX_VALUE));
				Tools.imprimeSalida("Datos almacenados: \n"+dato.imprimeDatosArray());
			case "Aleatorios":;
				Random ale = new Random();
				dat= ale.nextInt(101);
				dato.AñadirDatos(dat);
				Tools.imprimeSalida("Datos almacenados \n"+dato.imprimeDatosArray());
			break;
			}
		}while(!sel.equalsIgnoreCase("Salir"));
	}

	public static void menuArrayMatriz(String menu) {
		String sel="",cad="";
		AlmacenarDatosTabla mat = new AlmacenarDatosTabla((byte)4,(byte)4);
		do {
			sel=desplegable(menu);
			switch (sel) {
			case "Agregar":
				if(!mat.isEspacioMatriz() || !mat.MatrizVacia()){
					Tools.salidaError("Matriz llena");}
				else{
					mat.LeerFilas();
					Tools.imprimeSalida("Datos almacenados: \n"+mat.verMatriz());}
				break;
				
			case "SumaDiagonal":
				if(mat.MatrizVacia()) {
					Tools.salidaError("Array Vacio...insertar datos");}
				else {
					Tools.imprimeSalida("Datos almacenados: "+mat.SummaDiagonal());}
				break;
				
			case "PaOctal":
				if(mat.MatrizVacia()) {
					Tools.salidaError("Array Vacio...insertar datos");}
				else {
					Tools.imprimeSalida("Datos almacenados: "+mat.enOctal());}
				break;
				
			case "Aleatorios":
					Random aleatorio = new Random();
					int dato= aleatorio.nextInt(21);
					Tools.imprimeSalida("Datos almacenados: \n");
				break;
				
			case "TrianguloSuperior":
				if(mat.MatrizVacia()){
					Tools.salidaError("Array Vacio...insertar datos");}
				else{
					Tools.imprimeSalida("Datos almacenados: "+mat.MatrizTrianguloSuperior());}
				break;
				
			case "TrianguloInferior":
				if(mat.MatrizVacia()) {
					Tools.salidaError("Array Vacio...insertar datos");}
				else {
					Tools.imprimeSalida("Datos almacenados: "+mat.MatrizTrianguloInferior());}
				break;
				
			case "MatrizDos":
					int matriz2[][]= {{18,-3,14},{35,4,20},{4,-16,70},{24,3,10}};
					Tools.imprimeSalida("Matriz constante \n"+mat.MatrizConstante(matriz2)+
										"\n Datos ordenados \n"+mat.ordenaBurbujaMatrizB(matriz2));
				break;
				
			case "Imprimir":
				if(mat.MatrizVacia()){
					Tools.salidaError("Array Vacio...insertar datos");} 
				else {
					Tools.imprimeSalida("Datos almacenados: \n"+mat.verMatriz());}
				break;
				
			case "Salir":
					Tools.imprimeSalida("Saliendo...");;
				break;
			}//switch
		}while (!sel.equalsIgnoreCase("Salir"));
	}
	
	public static void menuArrayS(String menu) {
		String sel="",cad="";
		ArrayObjetos objeto = new ArrayObjetos((byte) 5);
		do {
			sel=desplegable(menu);
			switch (sel) {
			
			case "Agregar":
				objeto.AñadirDatos();
				objeto.imprimeDatosArray();
				Tools.imprimeSalida(objeto.imprimeDatosArray());
				break;
			case "Imprimir":
				if(objeto.ArrayVacio()){
					Tools.salidaError("Array Vacio...insertar datos");} 
				else {
					Tools.imprimeSalida("Datos almacenados: \n"+objeto.imprimeDatosArray());}
				break;
				
			case "Salir":
					Tools.imprimeSalida("Saliendo...");;
				break;
			}//switch
		}while (!sel.equalsIgnoreCase("Salir"));
	}
}