package secao01_fundamentos;


public class TiposPrimitivos {
	public static void main(String[] args) {

		System.out.println("O java tem 8 Tipos Primitivos: ");
	    System.out.println("Sendo 6 númericos, 1 caractere e 1 boolean");
	    System.out.println("byte, short, int, long, float, double, char, boolean");
	  
	    
	    byte  idade     = 127;
	    short totalDias = 32767;
	    int   horas     = 3_200_90_000;
	     
	     
	    //Literal de números inteiro em Java, por padrão é int
	    long  minutos   = 3_800_90_000L;
	    
	    //Literal de ponto flutuante por padrão é double
	    // O F no final do literal, serve para converter e avisar ao compilador que é um float
	    float  vendasDiarias = 1_256_250.20F;
	    double vendasMensais = vendasDiarias*30;
	    
	    boolean funciona = true;
	 // pode ser usado um cpodigo da tabela unicode "\\u095"
	    char    status   = 'A'; 
	    
	    
	    System.out.println("byte: "    + idade);
	    System.out.println("short: "   + totalDias);
	    System.out.println("int: "     + horas);
	    System.out.println("long: "    + minutos);
	    System.out.println("float: "   + vendasDiarias);
	    System.out.println("double: "  + vendasMensais);
	    System.out.println("boolean: " + funciona);
	    System.out.println("char: "    + status);
	    
	}
}
