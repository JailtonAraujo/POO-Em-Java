package main;

import javax.swing.JOptionPane;

import Controllers.AlunoController;

public class Principal {

	public static void main(String[] args) {
		AlunoController alunoController = new AlunoController();

		/*
		alunoController.CadastrarAluno();
		
		alunoController.ExcluirDisciplina();
		
		alunoController.CalcularMedia();
		*/

		
		int opc = 8;
		
		
		while(opc != 0) {
		
			opc =  Integer.valueOf(JOptionPane.showInputDialog("Escola uma das opções abaixo:\n\n"
					+ "(1) Cadastrar\n"
					+ "(2) Calcular media\n"
					+ "(3) Excluir aluno\n"
					+ "(4) Buscar aluno\n"
					+ "(5) Listar Alunos\n"
					+ "(0) Para sair do programa\n"));
			
		switch(opc) {
			case 1:
				alunoController.CadastrarAluno();
				break;
			case 2:
				alunoController.CalcularMedia();
				break;
			case 3:
				alunoController.ExcluirAluno();
				break;
			case 4:
				alunoController.BuscarAluno();
				break;
			case 5:
				alunoController.ListarAluno();
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Aplicação finalizada!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção invalida!");
				break;
		}
		
		}
	}

}
