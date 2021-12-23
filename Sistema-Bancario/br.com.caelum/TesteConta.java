

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.Data;

public class TesteConta {
	

	public static void main(String[] args) {
		
		LocalDate dataHoje = LocalDate.now();
		
		String [] datasepara = dataHoje.toString().split("-");
		
		
		
		
	}
	
	/*ESSA COMPARAÇÃO COM IF NÃO É INDICADA POIS DESSA FORMA NÃO ESTA COMPARANDO OS ATRIBUTOS DAS CLASSES C1 E C2 MAS SIM SEU ENDEREÇO
	 * FISICO DE MEMORIA, OU SEJA ESSA COMPARAÇÃO SEMPRE SERÁ DIFERENTE POIS DOIS OBJETOS INSTANCIADOS NÃO OCUPAM O MESMO ENDEREÇO NA MEMORIA*/
	
	
	
}
