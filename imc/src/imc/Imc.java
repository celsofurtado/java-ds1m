package imc;

public class Imc {

	public static void main(String[] args) {
		
		// Variable creation
		float peso;
		float altura;
		float imc;
		
		// Inicialização das variáveis
		peso = 65f;
		altura = 1.68f;
		
		// Cálculo do IMC
		imc = peso / (altura * altura);
		
		// Exibição dos resultados
		System.out.println(imc);
		System.out.println(peso);
		System.out.print(altura);
		
	}
	
}
