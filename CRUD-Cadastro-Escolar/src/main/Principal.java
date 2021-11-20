package main;

import javax.swing.JOptionPane;

import Controllers.AlunoController;

public class Principal {

	public static void main(String[] args) {
		AlunoController alunoController = new AlunoController();

		alunoController.CadastrarAluno();

		int opc = Integer.valueOf(JOptionPane.showConfirmDialog(null, "Deseja Apagar Excluir alguma Disciplina?",
				"Atenção", JOptionPane.YES_NO_OPTION));

		if (opc == 0) {
			if (alunoController.ExcluirDisciplina()) {
				JOptionPane.showMessageDialog(null, "Disciplina Ecluida Com Sucesso!");
			}
		}
		
		JOptionPane.showMessageDialog(null, alunoController.Recuperacao());
	}

}
