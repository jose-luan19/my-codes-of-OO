public class produto {
	String nome;
	double preco;
	//CONSTANTE DA CLASSE
	final static double desconto = 0.15;
	
	produto(String nomeInicial){
		nome = nomeInicial;
	}
	
	double precoComDesconto(){
		return preco * (1-desconto);
	}
}
