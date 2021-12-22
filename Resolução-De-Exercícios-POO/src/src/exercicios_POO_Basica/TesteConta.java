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
	
	/*ESSA COMPARAÇÃO COM IF NÃO É INDICADA POIS DESSA FORMA NÃO ESTA COMPARANDO OS ATRIBUTOS DAS CLASSES C1 E C2 MAS SIM SEU ENDEREÇO
	 * FISICO DE MEMORIA, OU SEJA ESSA COMPARAÇÃO SEMPRE SERÁ DIFERENTE POIS DOIS OBJETOS INSTANCIADOS NÃO OCUPAM O MESMO ENDEREÇO NA MEMORIA*/
	
	
	
}
