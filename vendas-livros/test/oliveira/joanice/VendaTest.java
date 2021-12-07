package oliveira.joanice;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VendaTest {
	
	//inicializa a variável que será usada nos testes antes dos testes propriamente 
	//dito
	private Venda venda;
	
	@Before
	public void setup() {
		 venda = new Venda();
	}
	
	@Test
	public void adicionarItemVenda() throws Exception{
		venda.adicionarItem("Um dia", 1.0, 25.0);
	}
	
	@Test
	public void valorTotalVendaLivro() throws Exception {
		venda.desconto(500);
		venda.valorTotal(50.0, 15.0);
	}
	
	
	
	
}
