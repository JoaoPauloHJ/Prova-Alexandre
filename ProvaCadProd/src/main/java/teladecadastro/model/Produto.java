package teladecadastro.model;

public class Produto {

	private String Nome;
	private int Preco;
	private int Quantidade;
	private int Total;

	@Override
	public String toString() {
		return "Produto [Nome=" + Nome + ", Preco=" + Preco + ", Quantidade=" + Quantidade + ", Total=" + Total + "]";
	}

	public int getTotal() {
		return Total;
	}

	public void setTotal(int total) {
		Total = total;
	}

	public Produto(String nome, int preco2, int quantidade, int total) {
		super();
		Nome = nome;
		Preco = preco2;
		Quantidade = quantidade;
		Total = total;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getPreco() {
		return Preco;
	}

	public void setPreco(int preco) {
		Preco = preco;
	}

	public int getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}

}
