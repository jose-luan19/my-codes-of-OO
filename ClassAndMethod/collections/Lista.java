import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		ArrayList<usuario> lista = new ArrayList<>();
		
		usuario u1 = new usuario("Luan");
		
		lista.add(u1);
		lista.add(new usuario("Ana"));
		lista.add(new usuario("Lizandra"));
		lista.add(new usuario("Marcos"));
		
		for (usuario u : lista) {
			System.out.println(u.nome);
		}
		
		System.out.println(lista.get(2));//System.out.println(lista.get(2).nome);
		
		System.out.println(lista.remove(1));//retorna o objeto a ser removido
		System.out.println(lista.remove(new usuario("Marcos")));//retorna true or false
		
		System.out.println("Tem? "+ lista.contains(new usuario("Lizandra")));
		
		for (usuario usuario : lista) {
			System.out.println(usuario);
		}
		
	}
}
