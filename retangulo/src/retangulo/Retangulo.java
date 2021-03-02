package retangulo;

public class Retangulo {

	public static void main(String[] args) {
		
		double base;
		double altura;
		double area;
		double perimetro;
		
		base = 8;
		altura = 5;
		
		area = base * altura;
		
		perimetro = 2 * (base + altura);
		
		System.out.print("Área: " + area + " metros");
		System.out.print("Perímetro: " + perimetro + " metros");
		
	}

}
