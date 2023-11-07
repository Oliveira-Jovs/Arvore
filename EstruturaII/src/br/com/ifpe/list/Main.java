package br.com.ifpe.list;

public class Main {
	public static void main(String[] args) {

		ListaVetores<Integer> lista = new ListaVetores<>();

		try {
			lista.insert(0, 2); 
			lista.insert(1, 4); 
			lista.insert(2, 6); 
			lista.insert(2, 8); 
		
			 

			
			System.out.println(lista.toString());
			

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
