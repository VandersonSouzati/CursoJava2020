package secao01_fundamentos.operadores;

public class OperadoresDesafio {
	public static void main(String[] args) {
		// Pegando dois trabalhos na semana
		// Trabalho na Terça(V ou F)
		// Trabalho na quinta(V ou F)
		// Os dois dando certo, comprar uma TV de 50 polegadas e levar familia tomar
		// soverte
		// Um trabalho dando certo a tv será de 32 polegadas e mantem o sorvete
		// Nenhum trabalho dando certo a familia fica em casa sem sorvete.
		// Ficando em casa sem tomar sorvete é mais saudavel sem ingerir doce,

		boolean trabalhoTerca = true;
		boolean trabalhoQuinta = true;

		boolean tomarSorvete = false;

		if (trabalhoTerca && trabalhoQuinta) {
			tomarSorvete = true;
			System.out.println("Comprou a tv de 50 polegadas e a familia foi tormar sorvete...");
		} else if (trabalhoTerca ^ trabalhoQuinta) {
			tomarSorvete = true;
			System.out.println("Comprou a tv de 32 polegadas e a familia foi tomar sorvete");
		} else {
			System.out.println("Fica em casa sem tomar sorvete ");
			if (!tomarSorvete) {
				System.out.println("Está mais saudável..");
			}
		}

		// Segunda forma de resolver
		System.out.println("\n\nSegunda forma de resolver\n");
		boolean comprouTV50 = trabalhoTerca && trabalhoQuinta;
		boolean comprouTV32 = trabalhoTerca ^ trabalhoQuinta;
		boolean comprouSorvete = trabalhoTerca || trabalhoQuinta;
		boolean maisSaudavel = !comprouSorvete;

		System.out.println("Comprou a TV de 50\"? " + comprouTV50);
		System.out.println("Comprou a TV de 32\"? " + comprouTV32);
		System.out.println("Comprou sorvete? " + comprouTV50);
		System.out.println("Mais saudável? " + comprouTV50);
	}
}
