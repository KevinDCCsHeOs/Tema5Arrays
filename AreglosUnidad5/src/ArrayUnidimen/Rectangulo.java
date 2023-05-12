package ArrayUnidimen;

import EntradasSalidas.Tools;

public class Rectangulo {
	//Atributos
	private double base;
	private double altura;
	private double area;
	private double perimetro;
	
	//Constructor vacio
	public Rectangulo() {}
	
	//Constructor parametrizado
	public Rectangulo(double base,double altura) {
		this.base=base;
		this.altura=altura;
		this.area=calcularArea();
		this.perimetro=calcularPerimetro();
	}
	
	//Getters y Setters
	public double getBase() {
		return base;
	}
	public double  getAltura() {
		return altura;
	}
	
	public double getArea() {
		return area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setBase(float base) {
		this.base = base;
		this.area = calcularArea();
		this.perimetro=calcularPerimetro();
	}
	public void setAltura(float altura) {
		this.altura = altura;
		this.area = calcularArea();
		this.perimetro=calcularPerimetro();
	}
	
	//toString
	@Override
	public String toString() {
	    return "Rectangulo:\n" +
	           "Base: " + base + "\n" +
	           "Altura: " + altura + "\n" +
	           "Área: " + area + "\n" +
	           "Perímetro: " + perimetro + "\n";
	}

	
	//Metodos
	public double calcularPerimetro() {
		return  (2*(base+altura));
	}

	public double calcularArea() {
		return base*altura;
	}
	
	//public static String  areaCubierta(Rectangulo rec1,Rectangulo rec2, Rectangulo salon) {
		//float cubierta=rec1.calcularArea()+rec2.calcularArea();
		//float sobrante= salon.calcularArea()-cubierta;
		//return "La parte cubierta es: "+cubierta+" (metros cuadrados)"+"\n La parte sobrante es:"+sobrante+"(metros cuadrados)";
	//}
	
	
	//public static void main(String []args) {
		
		//Rectangulo salon = new Rectangulo((float) 7,(float)6.5);
		//Rectangulo alfombra1= new Rectangulo((float) 3.8, (float)4.6);
		//Rectangulo alfombra2= new  Rectangulo((float) 4.5, (float)2.3);
		
		//Tools.imprimeSalida(areaCubierta(alfombra1,alfombra2,salon));
	//}
}
