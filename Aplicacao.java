package campo_minado;

import campo_minado.modelo.Tabuleiro;
import campo_minado.visao.TabuleiroConsole;

public class Aplicacao {
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);		
	}
}
