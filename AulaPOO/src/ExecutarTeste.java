import java.math.BigDecimal;

public class ExecutarTeste {

	public static void main(String[] args) {

		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("Modulo OO");
		produto1.setValor(BigDecimal.valueOf(100));

		Produto produto2 = new Produto();
		produto2.setId(2L);
		produto2.setNome("Modulo NODEJS");
		produto2.setValor(BigDecimal.valueOf(300));

		Produto produto3 = new Produto();
		produto3.setId(3L);
		produto3.setNome("Modulo JPA");
		produto3.setValor(BigDecimal.valueOf(400));
		
		Produto produto4 = new Produto();
		produto4.setId(4L);
		produto4.setNome("Modulo HYPER");
		produto4.setValor(BigDecimal.valueOf(600));

		Venda venda = new Venda();
		venda.setDescricao("Venda Curso Java");
		venda.setEnderecoEntrega("Endereço de Entrega");
		venda.setId(10L);
		venda.setNomeCliente("Éder da Silva");
		//venda.setValorTotal(BigDecimal.valueOf(197.00));

		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);
		venda.getListaProdutos().add(produto3);
		venda.getListaProdutos().add(produto4);

		System.out.println("Descrição de Venda :" + venda.getDescricao() + " e Valor Total = " 
		+ venda.calculaVenda());
	}
}
