package EntradasSalidas;

import javax.swing.JOptionPane;

import EntradasSalidas.Tools;

public class Menus {
	//String menu1 = "Agregar, Imprimir, Salir";
	//TipoMenu.menu1(menu1);
	public static void menu1(String menu) {
		int sel;
		do {
			sel = Tools.leerInt(menu+"Seleccion Opción");
			switch(sel) {
			case 1: break;
			case 2: break;
			case 3: Tools.imprimeSalida("Fin del programa");break;
			default: Tools.salidaError("Opción no definicda, intenta de nuevo");
			}//switch
		}while(sel!=3);
	}
	
	//Menu con botones
	
	//String menu2 = "Agregar,Imprimir, Salir";
	//TipoMenu.menu2(menu2); Para invocar el método 
	
	public static void menu2(String menu) {
		String sel;
		do {
			sel=desplegable(menu);
			switch (sel) {
			case "Agregar":;break;
			case "Imprimir":;break;
			case "Salir":;break;
			}//switch
		}while (!sel.equalsIgnoreCase("Salir"));
	}
	
	public static String desplegable(String menu) {
		String valores []=menu.split(",");
		String res= (String)JOptionPane.showInputDialog(null,"M E N U","Selecciona opcion:",
				JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return (res);
	}
	
	
	//TipoMenu.menu3(String menu)
	//String menu2 = "Agregar, Imprimir, Salir";
	
	public static void menu3(String menu) {
		String sel="";
		do {
			sel = boton(menu);
			switch (sel) {
			case "Agregar":;break;
			case "Imprimir":;break;
			case "Salir":;break;
			}//switch 
			
		}while (!sel.equalsIgnoreCase("Salir"));
	}
	
	public static String boton(String menu) {
		String valores [] =menu.split(",");
		int n;
		n= JOptionPane.showOptionDialog(null,"Selecciona dando click ", "M E N U",
				JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]);
		return (valores [n]);
	}
}