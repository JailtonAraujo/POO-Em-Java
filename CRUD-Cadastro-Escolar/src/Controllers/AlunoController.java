package Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

import Class.Aluno;
import Class.Disciplina;
import Interfaces.InterfaceAluno;

public class AlunoController implements InterfaceAluno {

	List<Aluno> alunos;
	List<Disciplina> Disciplinas;
	float notas;
	Random rand = new Random();

	@Override
	public void CadastrarAluno() {
		this.alunos = new ArrayList<Aluno>();
		int condicao = 0;

		while (condicao == 0) {

			int id = rand.nextInt(121234);
			String nome = JOptionPane.showInputDialog(null, "Digite o Nome");
			String cPF = JOptionPane.showInputDialog(null, "Digite o CPF");
			String rG = JOptionPane.showInputDialog(null, "Digite o RG");
			String dataNascimento = JOptionPane.showInputDialog(null, "Digite a Data De Nascimento");
			String nomePai = JOptionPane.showInputDialog(null, "Digite o Nome Do Pai");
			String nomeMae = JOptionPane.showInputDialog(null, "Digite o Nome Da M�e");
			String dataMatricula = JOptionPane.showInputDialog(null, "Digite Data Da Matricula");
			String nomeEscola = JOptionPane.showInputDialog(null, "Digite o Nome Da Escola");
			String serieMatriculado = JOptionPane.showInputDialog(null, "Digite a Serie Que Esta Matriculado");

			int op = JOptionPane.showConfirmDialog(null, "DESEJA CADASTRAR AS DISCIPLINAS DO ALUNO?", "ATEN��O!",
					JOptionPane.YES_NO_OPTION);

			if (op == 0) {
				this.CadastrarDisciplina();
			}

			Aluno aluno = new Aluno(id, nome, cPF, rG, dataNascimento, nomePai, nomeMae, dataMatricula, nomeEscola,
					serieMatriculado, Disciplinas);
			// dao.CadastrarAluno(aluno);

			this.alunos.add(aluno);

			condicao = JOptionPane.showConfirmDialog(null, "Cadastrar Novamente?");

			// TODO Auto-generated method stub
		}
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

			int opc = JOptionPane.showConfirmDialog(null, "Diseja Cadastrar Outra Disciplina?", "Aten��o",
					JOptionPane.YES_NO_OPTION);

			if (opc == 1) {
				sair = true;
			}
		}

		// TODO Auto-generated method stub
	}

	@Override
	public void ExcluirDisciplina() {
		int opc = Integer.valueOf(JOptionPane.showConfirmDialog(null, "Deseja Apagar Excluir alguma Disciplina?",
				"Aten��o", JOptionPane.YES_NO_OPTION));

		if (opc == 0) {

			int condicao = 0;
			while (condicao == 0) {

				int DisciplinaExcluir = Integer
						.parseInt(JOptionPane.showInputDialog(null, "Informe a Disciplina Que Deseja Exlcuir"));

				notas = notas - this.Disciplinas.get(DisciplinaExcluir - 1).getNota();
				this.Disciplinas.remove(DisciplinaExcluir - 1);

				condicao = JOptionPane.showConfirmDialog(null, "Continuar Removendo?");
				// TODO Auto-generated method stub
			}
		}
	}

	@Override
	public String Recuperacao(float media) {
		if (media >= 5.0) {
			if (media >= 7.0) {
				return "Aprovado";
			} else {
				return "Recupera��o";
			}
		} else {
			return "Reprovado";
		}

		// TODO Auto-generated method stub
	}

	public void CalcularMedia() {

		String nome = JOptionPane.showInputDialog(null, "Informe o nome do aluno que deseja calcular a media:");
		float madia = 0;
		boolean achou = false;

		for (Aluno aluno : this.alunos) {

			if (achou = aluno.getNome().equalsIgnoreCase(nome)) {

				for (Disciplina disciplina : aluno.getDisciplinas()) {
					madia = (madia + disciplina.getNota());

				}
				madia = madia / aluno.getDisciplinas().size();
				break;
			}

		}
		if (achou == true) {
			JOptionPane.showMessageDialog(null, "A MEDIA DO ALUNO " + nome + " � " + madia + "");
			JOptionPane.showMessageDialog(null, "Aluno " + nome + " Esta " + this.Recuperacao(madia) + "!");
		} else {
			JOptionPane.showMessageDialog(null, "Aluno N�o Encontrado!");
		}

	}

	@Override
	public void BuscarAluno() {

		if (this.alunos == null) {
			JOptionPane.showMessageDialog(null, "Voc� ainda n�o cadastrou nenhum aluno!");
		} else {

			String NomeAluno = JOptionPane.showInputDialog("informe o no so aluno que deseja buscar:");
			boolean achou = false;

			for (Aluno aluno : this.alunos) {
				if (aluno.getNome().equals(NomeAluno)) {
					JOptionPane.showMessageDialog(null, aluno);
					achou = true;
				}
			}

			if (achou == false) {
				JOptionPane.showMessageDialog(null, "Aluno n�o encontrado!");
			}
		}

		// TODO Auto-generated method stub

	}

	@Override
	public void ExcluirAluno() {

		if (this.alunos == null) {
			JOptionPane.showMessageDialog(null, "Voc� ainda n�o cadastrou nenhum aluno!");
		} else {

			String AlunoExluir = JOptionPane.showInputDialog("Informe o nome do aluno que deseja excluir:");
			boolean achou = false;

			for (Aluno aluno : this.alunos) {
				if (aluno.getNome().equals(AlunoExluir)) {
					this.alunos.remove(aluno);
					JOptionPane.showMessageDialog(null, "Aluno " + AlunoExluir + " Excluir com Sucesso");
					achou = true;
				}
			}

			if (achou == false) {
				JOptionPane.showMessageDialog(null, "Aluno n�o encontrado!");
			}
			// TODO Auto-generated method stub

		}
	}

	@Override
	public void ListarAluno() {
		String aluns = null;

		if (this.alunos == null) {

			JOptionPane.showMessageDialog(null, "Voc� ainda n�o cadastrou nenhum aluno!");
		} else {
			for (Aluno aluno : this.alunos) {

				aluns = aluns + aluno.getNome() + "\n";

			}
			JOptionPane.showMessageDialog(null, aluns);
		}

		// TODO Auto-generated method stub

	}

}
