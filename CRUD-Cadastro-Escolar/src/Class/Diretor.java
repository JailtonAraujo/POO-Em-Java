package Class;

public class Diretor extends Pessoa{
	private String RegistroEducacao;
	private String TempoDirecao;
	private String Titulacao;
	
	public Diretor() {}

	
	public Diretor(int id, String nome, String cPF, String rG, String dataNascimento, String nomePai, String nomeMae, String registroEducacao, String tempoDirecao, String titulacao) {
		super(id, nome, cPF, rG, dataNascimento, nomePai, nomeMae); //*Construtor da class mãe*//
		this.RegistroEducacao = registroEducacao;
		this.TempoDirecao = tempoDirecao;
		this.Titulacao = titulacao;
	}

	
	
	
}
