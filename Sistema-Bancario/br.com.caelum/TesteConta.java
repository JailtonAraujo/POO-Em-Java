

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

import javax.swing.JOptionPane;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.Data;

public class TesteConta {
	

	public static void main(String[] args) {
		
		boolean logado = false;
		
		
		while(true) {
			
			
			if(logado == true) {
				break;
			}else {
				/*entrar()*/
			}
		}
		
		
		if(logado == false) {
			JOptionPane.showMessageDialog(null, "Nenhuma conta encotrada");
		}else {
			
			JOptionPane.showMessageDialog(null, "Bem vido Cliente");
			
			int opc =  Integer.parseInt(JOptionPane.showInputDialog("Infora opere�o que deseja reaizar:"));
			
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
					System.out.println("Nenhuma op��o valida foi selecionada!");
				}
			}
		}
		
		
		
		
	}
	
	/*ESSA COMPARA��O COM IF N�O � INDICADA POIS DESSA FORMA N�O ESTA COMPARANDO OS ATRIBUTOS DAS CLASSES C1 E C2 MAS SIM SEU ENDERE�O
	 * FISICO DE MEMORIA, OU SEJA ESSA COMPARA��O SEMPRE SER� DIFERENTE POIS DOIS OBJETOS INSTANCIADOS N�O OCUPAM O MESMO ENDERE�O NA MEMORIA*/
	
	
	
}
