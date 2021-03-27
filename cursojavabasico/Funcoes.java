package cursojavabasico;
/*
 * Funções 
 * 
 * versão 1.0
 * 
 * autor: Geovane Maia*/
public class Funcoes {

	public static void main(String[] args) {
		int result = soma(10,60);
		
		System.out.println(result);
		quadrado(7);
		String texto = mensagem();
		System.out.println(texto);
		olaMundo();
		
		int nota = 5;
		String resultado = nota >= 7 ? "Você foi aprovado":" Você foi Reprovado";
		System.out.println(resultado);
	}
	
	static int soma(int a, int b) {
		return a + b;
	}
	
	static void quadrado(int numero) {
		System.out.println(numero*numero);
	}
	
	static String mensagem() {
		return "Mensagem do sistema!";
		
	}
	static void olaMundo() {
		System.out.println("Olá Mundo !");
	}

}
