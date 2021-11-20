package main;

import javax.swing.JOptionPane;

import Controllers.AlunoController;

public class Principal {

	public static void main(String[] args) {
		AlunoController alunoController = new AlunoController();

		alunoController.CadastrarAluno();

		alunoController.ExcluirDisciplina();
		
		JOptionPane.showMessageDialog(null, alunoController.Recuperacao());
	}

}
