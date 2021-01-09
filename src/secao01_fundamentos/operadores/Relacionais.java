package secao01_fundamentos.operadores;

public class Relacionais {
    public static void main(String[] args) {
    	System.out.println("Operadores RELACIONAIS ==, !=, >, >=, <, <=");
    	
    	int a = 97;
    	int b ='a';
    	System.out.println(a == b);
    	System.out.println(3 != 4);
    	System.out.println(3 > 4);
    	System.out.println(30 >= 50);
    	System.out.println(20 < 30);
    	System.out.println(12 <= 12);
    	   
    	double nota = 8.3;
    	boolean bomComportamento = true;
    	boolean passouMedia = nota >= 7;
    	boolean temDesconto = bomComportamento && passouMedia;
    	System.out.println("Tem desconto ? "+temDesconto);
    }
}
