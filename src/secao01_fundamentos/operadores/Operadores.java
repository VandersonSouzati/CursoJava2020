package secao01_fundamentos.operadores;

public class Operadores {
     public static void main(String[] args) {
    	 boolean condicao1 = true;
    	 boolean condicao2 = 3 > 7;
    	 
    	 System.out.println("TABELA VERDADE DO E (AND)");
    	 System.out.println(true && true);
    	 System.out.println(true && false);
    	 System.out.println(false && true);
    	 System.out.println(false && false);
    	 
    	 System.out.println("\nTABELA VERDADE DO OU (OR)");
    	 System.out.println(true || true);
    	 System.out.println(true || false);
    	 System.out.println(false || true);
    	 System.out.println(false || false);
    	 
    	 System.out.println("\nTABELA VERDADE DO OU EXCLUSIVO (XOR)");
    	 System.out.println(true ^ true);
    	 System.out.println(true ^ false);
    	 System.out.println(false ^ true);
    	 System.out.println(false ^ false);
    	 
    	 System.out.println("\nTABELA VERDADE DO E (AND)");
    	 System.out.println(!true);
    	 System.out.println(!false);
    	 
     }
}
