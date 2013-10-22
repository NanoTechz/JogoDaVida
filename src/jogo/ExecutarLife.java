package jogo;

import javax.swing.JOptionPane;

public class ExecutarLife {

	public static void main(String[] args) {
		int tamanho = receberTamanho();
		int qtdSimulacoes;
		int aux[][] = new int[tamanho][tamanho];
		
		Life life = new Life(tamanho);

		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				aux[i][j] = receberValorCelula(i, j);
			}
		}
		
		qtdSimulacoes = receberInteiro("Digite a quantidade de simulações");
		
		life.inicializar(aux);
		life.simulaVida(qtdSimulacoes);
	}

	public static int receberInteiro(String mensagem) {
		try {
			return Integer.parseInt(JOptionPane
					.showInputDialog(mensagem));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Erro! Insira um valor válido.");
			return receberInteiro(mensagem);
		}
	}

	public static int receberTamanho() {
		return receberTamanho(5);
	}

	public static int receberTamanho(int erro) {
		try {
			return Integer.parseInt(JOptionPane
					.showInputDialog("Digite o tamanho do quadrado:"));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Erro na conversão, inicializando matriz padrão " + erro
							+ "x" + erro + ".");
			return erro;
		}
	}

	public static int receberValorCelula(int i, int j) {
		try {
			int temp = Integer.parseInt(JOptionPane.showInputDialog("P(" + i
					+ "," + j + ") Digite 0=morte ou 1=vida"));

			if ((temp >= 0) && (temp <= 1)) { // Valor válido
				return temp;
			} else {
				if (erro("Valor inserido != de 0 ou 1, deseja continuar?"))
					return receberValorCelula(i, j);
				else
					return 0;
			}
		} catch (Exception e) {
			if (erro("Erro na conversão, deseja continuar?"))
				return receberValorCelula(i, j);
			else
				return 0;
		}
	}

	public static boolean erro(String mensagem) {
		int opcao = JOptionPane.showConfirmDialog(null, mensagem);

		if (opcao == JOptionPane.OK_OPTION) {
			return true;
		} else {
			return false;
		}
	}

}
