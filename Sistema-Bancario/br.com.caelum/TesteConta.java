

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
	
	/*ESSA COMPARA��O COM IF N�O � INDICADA POIS DESSA FORMA N�O ESTA COMPARANDO OS ATRIBUTOS DAS CLASSES C1 E C2 MAS SIM SEU ENDERE�O
	 * FISICO DE MEMORIA, OU SEJA ESSA COMPARA��O SEMPRE SER� DIFERENTE POIS DOIS OBJETOS INSTANCIADOS N�O OCUPAM O MESMO ENDERE�O NA MEMORIA*/
	
	
	
}
