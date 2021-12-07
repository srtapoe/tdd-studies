package oliveira.joanice;

public class Venda {

	public void adicionarItem(String descricao, double quantidade, double preco) {
		
	}

	public double valorTotal(double quantidade, double preco) {
		return preco * quantidade;

}
	
	public double desconto(double valorTotal) {
		if(valorTotal <= 300) {
			return valorTotal - (0.03 * valorTotal);
		}else if(valorTotal > 300 || valorTotal <= 800) {
			return valorTotal - (0.05 * valorTotal);
		}else {
			return valorTotal - (0.08 * valorTotal);
		}
		
	}
}
