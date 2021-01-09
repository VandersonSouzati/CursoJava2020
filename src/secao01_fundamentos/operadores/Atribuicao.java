package secao01_fundamentos.operadores;

public class Atribuicao {
	public static void main(String[] args) {
        
		int a = 3;
		int b = a;
		int c = a + b;
		a++;
		b--;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		System.out.println(++a == b--);
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}
