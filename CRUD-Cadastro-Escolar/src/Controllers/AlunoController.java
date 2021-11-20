package Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

import Class.Aluno;
import Class.Disciplina;
import Interfaces.InterfaceAluno;

public class AlunoController implements InterfaceAluno {

	// List <Aluno> alunos = new ArrayList <Aluno> ();
	List<Disciplina> Disciplinas;
	float notas;
	Random rand = new Random();

	@Override
	public Aluno CadastrarAluno() {
		int id = rand.nextInt(121234);
		String nome = JOptionPane.showInputDialog(null, "Digite o Nome");
		String cPF = JOptionPane.showInputDialog(null, "Digite o CPF");
		String rG = JOptionPane.showInputDialog(null, "Digite o RG");
		String dataNascimento = JOptionPane.showInputDialog(null, "Digite a Data De Nascimento");
		String nomePai = JOptionPane.showInputDialog(null, "Digite o Nome Do Pai");
		String nomeMae = JOptionPane.showInputDialog(null, "Digite o Nome Da Mãe");
		String dataMatricula = JOptionPane.showInputDialog(null, "Digite Data Da Matricula");
		String nomeEscola = JOptionPane.showInputDialog(null, "Digite o Nome Da Escola");
		String serieMatriculado = JOptionPane.showInputDialog(null, "Digite a Serie Que Esta Matriculado");

		int op = JOptionPane.showConfirmDialog(null, "DESEJA CADASTRAR AS DISCIPLINAS DO ALUNO?", "ATENÇÃO!",
				JOptionPane.YES_NO_OPTION);

		if (op == 0) {
			this.CadastrarDisciplina();
		}

		return new Aluno(id, nome, cPF, rG, dataNascimento, nomePai, nomeMae, dataMatricula, nomeEscola,
				serieMatriculado, Disciplinas);

		// TODO Auto-generated method stub

	}

	@Override
	public void CadastrarDisciplina() {
		boolean sair = false;
		int cont = 1;
		this.Disciplinas = new ArrayList<Disciplina>();
		while (sair == false) {
			String NomeDaDisciplina = JOptionPane.showInputDialog(null,
					"Digite o Nome Da " + (this.Disciplinas.size() + 1) + " Disciplina");
			float Nota = Float.parseFloat(JOptionPane.showInputDialog(null,
					"Digite a Nota Da " + (this.Disciplinas.size() + 1) + " Discplina"));

			Disciplina disciplina = new Disciplina(NomeDaDisciplina, Nota);

			this.Disciplinas.add(disciplina);
			notas = notas + disciplina.getNota();

			int opc = JOptionPane.showConfirmDialog(null, "Diseja Cadastrar Outra Disciplina?", "Atenção",
					JOptionPane.YES_NO_OPTION);

			if (opc == 1) {
				sair = true;
			}
		}

		// TODO Auto-generated method stub
	}

	@Override
	public boolean ExcluirDisciplina() {
		int DisciplinaExcluir = Integer
				.parseInt(JOptionPane.showInputDialog(null, "Informe a Disciplina Que Deseja Exlcuir"));

		this.Disciplinas.remove(DisciplinaExcluir - 1);
		return true;
		// TODO Auto-generated method stub

	}

	@Override
	public String Recuperacao() {
		if (notas / (this.Disciplinas.size()) >= 5.0) {
			if (notas / (this.Disciplinas.size()) >= 7.0) {
				return "Aluno Aprovado";
			} else {
				return "Aluno Em Recuperação";
			}
		} else {
			return "Aluno Reprovado";
		}

		// TODO Auto-generated method stub
	}

}
