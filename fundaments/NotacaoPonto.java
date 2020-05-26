import java.util.Scanner;

public class NotacaoPonto {
	
	public static void main(String[] args) {
  
		String s = "Bienvindo Luan";
		//SUBISTITUI UMA PARTE POR OUTRO 
		s = s.replace("Luan", "Lizandra");
		//TRANSFORMA A STRING TODA EM MAISCULA
		s = s.toUpperCase();
		s = s.concat("!!!");
		//ELEMENTO X DO ARRAY
		System.out.println(s.charAt(0));
		// VERIFICA SE O ARRAY SE INICIA COM N true or false
		System.out.println(s.startsWith("B"));
		// VERIFICA SE O ARRAY SE INICIA COM N true or false
		System.out.println(s.startsWith("bi"));
		// TRANSFORMA STRING EM MINUSCULO E VERIFICA SE O ARRAY SE INICIA COM N true or false
		System.out.println(s.toLowerCase().startsWith("bi"));
		// VERIFICA SE O ARRAY SE TERMINA COM N true or false
		System.out.println(s.endsWith("!"));
		//TAMNHO DO ARRAY
		System.out.println(s.length());
		//COMPARAR ARRAY
		System.out.println(s.equals("bienvindo lizandra!!!"));
		// COMPARAR ARRAY SEM SE IMPORTAR COM TIPOS DE LETRAS
		System.out.println(s.equalsIgnoreCase("bienvindo lizandra!!!"));
		
		
		
		// VERIFICA SE UM ARRAy ESTÁ CONTIDO EM OUTRO ARRAY
		System.out.println("toda vida".contains("vida"));
		// INDICA O INDICE QUE O ELEMENTO ESTÁ
		System.out.println("sempre acontece".indexOf("e"));
		// FAZ COM QUE IMPRIMA O ARRAY A PARTIR DO INDICE INDICADO, ATÉ CERTO INDICE INDICADO
		System.out.println("sempre acontece".substring(7, 12));
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe alguma coisa: ");
		String issue = entrada.nextLine();
		System.out.println(issue);
		System.out.print("Informe algum número: ");
		int num = entrada.nextInt();
		System.out.println(num);
		entrada.close();
		

	}
	
}
