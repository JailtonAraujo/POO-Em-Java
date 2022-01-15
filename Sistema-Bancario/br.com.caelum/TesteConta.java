

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
		
		while(true) {
			
			String login = JOptionPane.showInputDialog("Digite seu nome de usuario");
			String senha = JOptionPane.showInputDialog("Digite sua senha:");
			
			logado = conta.Entrar(login, senha);
			
			if(logado == true) {
				JOptionPane.showMessageDialog(null, "Bem vindo "+ login);
				break;
			}else {
				
				JOptionPane.showMessageDialog(null, "Informações de usuario incorretas!");
			}
		}
		
		
		if(logado == false) {
			JOptionPane.showMessageDialog(null, "Nenhuma conta encotrada");
		}else {
			
			JOptionPane.showMessageDialog(null, "Bem vido Cliente");
			
			int opc =  Integer.parseInt(JOptionPane.showInputDialog("Infora opereão que deseja reaizar:"));
			
			while(true) {
				
				switch (opc) {
				case 1:
					/*sacar()*/
					break;
				case 2:
					/*depositar()*/
					break;
				case 3:
					/*extrato()*/
					break;
				case 0:
					/*sair*/
					break;
				default:
					System.out.println("Nenhuma opção valida foi selecionada!");
				}
			}
		}
		
		
		
		
	}
	
	/*ESSA COMPARAÇÃO COM IF NÃO É INDICADA POIS DESSA FORMA NÃO ESTA COMPARANDO OS ATRIBUTOS DAS CLASSES C1 E C2 MAS SIM SEU ENDEREÇO
	 * FISICO DE MEMORIA, OU SEJA ESSA COMPARAÇÃO SEMPRE SERÁ DIFERENTE POIS DOIS OBJETOS INSTANCIADOS NÃO OCUPAM O MESMO ENDEREÇO NA MEMORIA*/
	
	
	
}
