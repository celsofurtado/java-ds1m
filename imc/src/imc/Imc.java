package imc;

public class Imc {

	public static void main(String[] args) {
		
		// Variable creation
		float peso;
		float altura;
		float imc;
		
		// Inicializa��o das vari�veis
		peso = 65f;
		altura = 1.68f;
		
		// C�lculo do IMC
		imc = peso / (altura * altura);
		
		// Exibi��o dos resultados
		System.out.println(imc);
		System.out.println(peso);
		System.out.print(altura);
		
	}
	
}
