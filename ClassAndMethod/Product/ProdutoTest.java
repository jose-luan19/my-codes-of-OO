public class ProdutoTest {
	public static void main(String[] args) {
		produto p1 = new produto("Notebook");
		System.out.println(p1.nome);
		p1.nome = "relogio";
		System.out.println(p1.nome);

		p1.preco = 3240.20;
				
		var p2 = new produto("Caneta Preta");
		p2.nome = "Caneta";
		p2.preco = 2.0;
		
		var precoFinal = p1.precoComDesconto();
		var precoFinal2 = p2.precoComDesconto();
		System.out.println(p2.nome);

		System.out.printf("%.2f\n",precoFinal);
		System.out.printf("%.2f",precoFinal2);
		System.out.println(produto.desconto);
	}

}
