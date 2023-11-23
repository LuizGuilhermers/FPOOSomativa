package Desafio05;

public class Principal {
	
	public static void main(String[] args) {
		 
		Livro venda1 = new Livro ("Quarto do despejo", "Ana Carolina de Jesus", 250);
		
		System.out.println("Nome: " + venda1.getNome());
		System.out.println("Autor: " + venda1.getAutor());
		System.out.println("Páginas: " + venda1.getPaginas());
		
	}

}

