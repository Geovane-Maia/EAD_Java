package cursojavabasico;

public class EstruturasDecisao {

	public static void main(String[] args) {

		/*
		 * String texto = 10 == 7? " Dez � igual que sete! " : "Dez � diferente que sete!";
		 * 
		 * System.out.println(texto);
		
		int idade = 17;
		if(idade >= 18) {
			System.out.println("J� pode tirar sua CNH !");
		}
		
		if(idade >= 18) {
			System.out.println("J� pode tirar sua CNH !");
		}else {
			System.out.println("N�o tem idade para dirigir !");
		}

		String semaforo = "amarelo";

		if (semaforo == "verde") {

			System.out.println("Siga em frente");

		} else if (semaforo == "amarelo") {

			System.out.println("Mantenha a aten��o");

		} else if (semaforo == "vermelho") {

			System.out.println("Pare !!!");

		} else {

			System.out.println("Chame a autoridade de tr�nsito!");
		}
		 */
		
		char opcao = 'b';
		
		switch(opcao) {
		
		case 'a': System.out.println("Cadastrar Produto"); break;
		
		case 'b': System.out.println("Visualizar Detalhes"); break;
		
		case 'c': System.out.println("Editar Produto"); break;
		
		case 'd': System.out.println("Deletar Produto"); break;
		
		default : ;
		}
		
	}
	
	

}
