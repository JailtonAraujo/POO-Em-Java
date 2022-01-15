
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

import javax.swing.JOptionPane;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaPupanca;
import br.com.caelum.contas.modelo.Data;

public class TesteConta {

	public static void main(String[] args) {

		boolean logado = false;

		ContaPupanca conta = new ContaPupanca();

		while (true) {

			String login = JOptionPane.showInputDialog("Digite seu nome de usuario");
			String senha = JOptionPane.showInputDialog("Digite sua senha:");

			logado = conta.Entrar(login, senha);

			if (!logado == true) {

				JOptionPane.showMessageDialog(null, "Informa��es de usuario incorretas!");

			} else {

				JOptionPane.showMessageDialog(null, "Bem vindo " + login);

				int opc = 9;

				while (opc != 0) {
					opc = Integer.parseInt(JOptionPane.showInputDialog("Informe a opere�o que deseja reaizar:\n"
							+ "(1) Sacar\n" + "(2) Depositar\n" + "(3) Saldo\n" + "(4) Calcular Rendimento\n" +"(0) Sair\n"));

					switch (opc) {
					case 1:
						conta.Sacar(
								Double.parseDouble(JOptionPane.showInputDialog("Informe a Quantia Que Deseja Sacar!")));
						break;
					case 2:
						conta.Depositar(Double
								.parseDouble(JOptionPane.showInputDialog("Informe o vaor que deseja depositar:")));
						break;
					case 3:
						JOptionPane.showMessageDialog(null, conta.getSaldo());
						break;
					case 4:
						JOptionPane.showMessageDialog(null, conta.CalculaRendimento());
						break;
					case 0:
						break;
					default:
						JOptionPane.showMessageDialog(null, "Op��o Invalida!");
					}
				}
			}

			if (logado == true) {
				JOptionPane.showMessageDialog(null, "Sistema encerrado!");
				break;
			}
		}

	}

	/*
	 * ESSA COMPARA��O COM IF N�O � INDICADA POIS DESSA FORMA N�O ESTA COMPARANDO OS
	 * ATRIBUTOS DAS CLASSES C1 E C2 MAS SIM SEU ENDERE�O FISICO DE MEMORIA, OU SEJA
	 * ESSA COMPARA��O SEMPRE SER� DIFERENTE POIS DOIS OBJETOS INSTANCIADOS N�O
	 * OCUPAM O MESMO ENDERE�O NA MEMORIA
	 */

}
