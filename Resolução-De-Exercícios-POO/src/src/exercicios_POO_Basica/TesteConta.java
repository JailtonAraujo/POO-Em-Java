package exercicios_POO_Basica;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

public class TesteConta {
	

	public static void main(String[] args) {
		
		LocalDate dataHoje = LocalDate.now();
		
		String [] datasepara = dataHoje.toString().split("-");
		
		Conta c1 = new Conta("Danilo");
		c1.setIdentificador(1);
		//c1.setNomeTitular("Danilo");
		c1.setSaldo(100);
		
		Data data = new Data();
		data.Dia = Integer.parseInt(datasepara[2]);
		data.Mes = Integer.parseInt(datasepara[1]);
		data.Ano = Integer.parseInt(datasepara[0]);
		
		c1.setData(data);
		
		System.out.println(c1.RecuperaDadosImpressao());
		Conta c2 = new Conta("Danilo");
		c2.setIdentificador(2);
		//c2.setNomeTitular("Danilo");
		c2.setSaldo(100);
		
		
		
		if(c1 == c2) {
			System.out.println("Iguais");
		}else {
			System.out.println("Diferente");
		}
		
		
		FabricaDeCarro fcar = FabricaDeCarro.getInstance();
		fcar.setId(2);
		fcar.setMarca("renalt");
		
		//System.out.println(fcar.toString());
		
		FabricaDeCarro fcar2 = FabricaDeCarro.getInstance();
		fcar2.setId(3);
		fcar2.setMarca("Chevrolet");
		
		System.out.println(fcar2.toString());
		System.out.println(fcar.toString());
	}
	
	/*ESSA COMPARA��O COM IF N�O � INDICADA POIS DESSA FORMA N�O ESTA COMPARANDO OS ATRIBUTOS DAS CLASSES C1 E C2 MAS SIM SEU ENDERE�O
	 * FISICO DE MEMORIA, OU SEJA ESSA COMPARA��O SEMPRE SER� DIFERENTE POIS DOIS OBJETOS INSTANCIADOS N�O OCUPAM O MESMO ENDERE�O NA MEMORIA*/
	
	
	
}
