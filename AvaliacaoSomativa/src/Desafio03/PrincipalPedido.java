package Desafio03;

public class PrincipalPedido {
	
		public static void main (String[] args) {
			
		Pedido envio1 = new Pedido (1, "Camiseta", 12);
		
		System.out.println("Identificação: " + envio1.getId());
		System.out.println("Produto: " + envio1.getProduto());
		System.out.println("Quantidade: " + envio1.getQuantidade());
		
		
		}
}
