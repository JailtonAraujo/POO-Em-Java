package pos_mavem.POO.CRUDaluno.Controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import pos_mavem.POO.CRUDaluno.DAO.GenericDAO;
import pos_mavem.POO.CRUDaluno.Interfaces.ICadastro;
import pos_mavem.POO.CRUDaluno.MODEL.Aluno;
import pos_mavem.POO.CRUDaluno.MODEL.Contato;
import pos_mavem.POO.CRUDaluno.VIEW.AlunoVIEW;


public class AlunoController implements ICadastro {
	private final AlunoVIEW view;
	private final GenericDAO<Aluno> dao;
	private List<Aluno> ListaDeAlunos;

	public AlunoController(AlunoVIEW view) {
		this.view = view;
		this.dao = new GenericDAO<Aluno>();
	}

	@Override
	public void Cadastrar() {
		if (this.ObterModelo("cadastrar") == null) {
			JOptionPane.showMessageDialog(null, "ERRO!, OS CAMPOS NÃO FORAM DEVIDAMENTE PREENCHIDOS!");
		} else if (this.ObterModelo("cadastrar") != null) {
			this.dao.salvar(this.ObterModelo("cadastrar"));
			JOptionPane.showMessageDialog(null, "ALUNO CADASTRADO COM SUCESSO!");

		}

		this.LimparCampos();
		this.CarregarTabela();

	}

	@Override
	public void Delete() {
		int index = this.view.getTableAlunos().getSelectedRow();

		this.SetarCampos();
		int opc = JOptionPane.showConfirmDialog(view, "TEM CERTEZA QUE DESEJA DELETAR O ALUNO SELECIONADO?", "ATENÇÃO!",
				JOptionPane.YES_NO_OPTION);

		if (opc == 0) {
			dao.Excluir(this.ListaDeAlunos.get(index));
		}

		this.LimparCampos();
		this.CarregarTabela();

		// TODO Auto-generated method stub

	}

	@Override
	public void Atualizar() {
		Aluno aluno = this.ObterModelo("atualizar");

		if (Validar(aluno)) {
			this.dao.Atualizar(aluno);
			JOptionPane.showMessageDialog(view, "DADOS ATUALIZADOS COM SUCESSO!");
		} else {

		}

		this.LimparCampos();
		this.CarregarTabela();

	}

	@Override
	public void CarregarTabela() {
		this.ListaDeAlunos = this.dao.Listar(Aluno.class);

		DefaultTableModel modelo = new DefaultTableModel(new Object[] { "NOME", "CPF", "SERIE", "ESCOLA" }, 0);

		for (Aluno aluno : this.ListaDeAlunos) {
			Object[] linha = new Object[] { aluno.getNome(), aluno.getCPF(), aluno.getSerieMatriculado(),
					aluno.getNomeEscola() };
			modelo.addRow(linha);
		}
		this.view.getTableAlunos().setModel(modelo);
		// TODO Auto-generated method stub

	}

	@Override
	public void SetarCampos() {
		int index = this.view.getTableAlunos().getSelectedRow();

		Aluno aluno = this.ListaDeAlunos.get(index);

		this.view.getTextID().setText(String.valueOf(aluno.getID()));
		this.view.getTextNome().setText(aluno.getNome());
		this.view.getTextCPF().setText(aluno.getCPF());
		this.view.getTextRg().setText(aluno.getRG());
		this.view.getTextDataNascimento().setText(aluno.getDataNascimento());
		this.view.getTextNomeDaMae().setText(aluno.getNomeMae());
		this.view.getTextNomeDoPai().setText(aluno.getNomePai());
		this.view.getTextDataMatricula().setText(aluno.getDataMatricula());
		this.view.getTextNomeDaEscola().setText(aluno.getNomeEscola());
		this.view.getTextSerieMatriculado().setText(aluno.getSerieMatriculado());

		// TODO Auto-generated method stub

	}

	@Override
	public void LimparCampos() {
		this.view.getTextID().setText("");
		this.view.getTextNome().setText("");
		this.view.getTextCPF().setText("");
		this.view.getTextRg().setText("");
		this.view.getTextDataNascimento().setText("");
		this.view.getTextNomeDaMae().setText("");
		this.view.getTextNomeDoPai().setText("");
		this.view.getTextDataMatricula().setText("");
		this.view.getTextNomeDaEscola().setText("");
		this.view.getTextSerieMatriculado().setText("");

	}

	public Aluno ObterModelo(String comando) {
		String id = this.view.getTextID().getText();
		String Nome = this.view.getTextNome().getText();
		String CPF = this.view.getTextCPF().getText();
		String RG = this.view.getTextRg().getText();
		String DataNascimento = this.view.getTextDataNascimento().getText();
		String NomeMae = this.view.getTextNomeDaMae().getText();
		String NomePai = this.view.getTextNomeDoPai().getText();
		String DataMatricula = this.view.getTextDataMatricula().getText();
		String NomeEscola = this.view.getTextNomeDaEscola().getText();
		String SerieMatriculado = this.view.getTextSerieMatriculado().getText();
		
		String telefone = this.view.getTextTelefone().getText();
		String email = this.view.getTextEmail().getText();
		
		

		if (comando.equals("cadastrar")) {
			id = "0";
		}
		
		Aluno aluno = new Aluno(Integer.parseInt(id), Nome, CPF, RG, DataNascimento, NomePai, NomeMae, DataMatricula,
				NomeEscola, SerieMatriculado);
		
		Contato contato = new Contato(telefone, email);
	
		


		if (this.Validar(aluno)) {
			return aluno;
		} else {
			aluno = null;
			return aluno;
		}

	}

	public boolean Validar(Aluno aluno) {
		if (aluno.getNome() != null && aluno.getNome().length() > 0 && aluno.getCPF() != null
				&& aluno.getCPF().length() > 0 && aluno.getRG() != null && aluno.getRG().length() > 0
				&& aluno.getDataNascimento() != null && aluno.getDataNascimento().length() > 0
				&& aluno.getNomeMae() != null && aluno.getNomeMae().length() > 0 && aluno.getNomePai() != null
				&& aluno.getNomePai().length() > 0 && aluno.getDataMatricula() != null
				&& aluno.getDataMatricula().length() > 0 && aluno.getNomeEscola() != null
				&& aluno.getNomeEscola().length() > 0 && aluno.getSerieMatriculado() != null
				&& aluno.getSerieMatriculado().length() > 0) {

			return true;
		} else {
			return false;
		}

	}

	@Override
	public void ListarPorPesquisar() {
		
		String search = this.view.getTextSearch().getText();
		this.ListaDeAlunos = this.dao.Pesquisa(Aluno.class, search);
		
		DefaultTableModel modelo = new DefaultTableModel(new Object[] { "NOME", "CPF", "SERIE", "ESCOLA" }, 0);

		for (Aluno aluno : this.ListaDeAlunos) {
			Object[] linha = new Object[] { aluno.getNome(), aluno.getCPF(), aluno.getSerieMatriculado(),
					aluno.getNomeEscola() };
			modelo.addRow(linha);
		}
		this.view.getTableAlunos().setModel(modelo);
		
		
		// TODO Auto-generated method stub
	}

}
