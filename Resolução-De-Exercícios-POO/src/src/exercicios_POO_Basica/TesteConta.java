package exercicios_POO_Basica;

public class TesteConta {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.NomeTitular = "Danilo";
		c1.Saldo = 100;
		
		Conta c2 = new Conta();
		c2.NomeTitular = "Danilo";
		c2.Saldo = 100;
		
		if(c1 == c2) {
			System.out.println("Iguais");
		}else {
			System.out.println("Diferente");
		}
	}
	
	/*ESSA COMPARA��O COM IF N�O � INDICADA POIS DESSA FORMA N�O ESTA COMPARANDO OS ATRIBUTOS DAS CLASSES C1 E C2 MAS SIM SEU ENDERE�O
	 * FISICO DE MEMORIA, OU SEJA ESSA COMPARA��O SEMPRE SER� DIFERENTE POIS DOIS OBJETOS INSTANCIADOS N�O OCUPAM O MESMO ENDERE�O NA MEMORIA*/
	
	
	
}
