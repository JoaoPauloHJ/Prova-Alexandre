package CadProd;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import teladecadastro.model.Produto;

public class TelaDeEntradaDeDados extends JPanel {

	private List<Produto> produtos = new ArrayList<>();

	public TelaDeEntradaDeDados() {

		// Simula uma Tabela
		// Com Duas colunas
		this.setLayout(new GridLayout(0, 2, 10, 10));

		JLabel NomeDoProduto = new JLabel("Nome do Produto");
		this.add(NomeDoProduto);

		final JTextField NomeDoProdutoField = new JTextField();
		this.add(NomeDoProdutoField);

		JLabel PrecoProduto = new JLabel("Preço do Produto");
		this.add(PrecoProduto);

		final JTextField PrecoProdutoField = new JTextField();
		this.add(PrecoProdutoField);

		JLabel QuantidadeDoProduto = new JLabel("Quantidade do Produto");
		this.add(QuantidadeDoProduto);

		final JTextField QuantidadeDoProdutoField = new JTextField();
		this.add(QuantidadeDoProdutoField);

		JButton btnAdicionar = new JButton("Adicionar Produto");
		this.add(btnAdicionar);
		btnAdicionar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Pega o que digitamos no campo o nome do produto
				String Nome = NomeDoProdutoField.getText();

				// Pega o que foi digitado e converte para inteiro
				int Preco = Integer.parseInt(PrecoProdutoField.getText());

				// Pega o que foi digitado e converte para inteiro
				int Quantidade = Integer.parseInt(QuantidadeDoProdutoField.getText());

				// System.out.println(Nome);
				// System.out.println("Preço: " + Preco);
				// System.out.println("Quantidade Do Produto: " + Quantidade);
				int Total = Preco * Quantidade;

				Produto produto = new Produto(Nome, Quantidade, Preco, Total);

				produtos.add(produto);

				System.out.println("Quantidade Cadastrada " + produtos.size());

				NomeDoProdutoField.setText("");
				PrecoProdutoField.setText("");
				QuantidadeDoProdutoField.setText("");

			}
		});

		JButton btnMostrarTodos = new JButton("Relatório");
		this.add(btnMostrarTodos);
		btnMostrarTodos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				for (int i = 0; i < produtos.size(); i++) {
					System.out.println(produtos.get(i));
				}

				Object[] titulos = { "Nome", "Quantidade", "Preço R$", "Total R$" };

				Object[][] Linhas = new Object[produtos.size()][4];

				for (int i = 0; i < produtos.size(); i++) {
					Object[] Linha = new Object[] { produtos.get(i).getNome(), produtos.get(i).getPreco(),
							produtos.get(i).getQuantidade(), produtos.get(i).getTotal() };
					Linhas[i] = Linha;
				}

				JTable table = new JTable(Linhas, titulos);

				JOptionPane.showMessageDialog(null, new JScrollPane(table));

			}

		});

	}

}
