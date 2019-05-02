package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// chave, valor, variável
		Map<String, String> cookies = new TreeMap<>();

		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		//cookies.put("phone", "99711123"); //vai sobrescrever o de cima
		

		// cookies.remove("email");
		// A Função key set retorna a chave do meu map

		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
			
		}
		
		System.out.print("\nTelefone: " + cookies.get("phone"));
		System.out.println("\nTamanho do cookie: " + cookies.size());
	
	}

}
