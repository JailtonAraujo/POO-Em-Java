package pos_mavem.POO.CRUDaluno.Controllers;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import pos_mavem.POO.CRUDaluno.DAO.GenericDAO;
import pos_mavem.POO.CRUDaluno.Interfaces.ICadastro;
import pos_mavem.POO.CRUDaluno.MODEL.Aluno;
import pos_mavem.POO.CRUDaluno.VIEW.AlunoVIEW;

public class AlunoController implements ICadastro {
	private final AlunoVIEW view;
	private final GenericDAO dao;
	private List<Aluno> ListaDeAlunos;

	public AlunoController(AlunoVIEW view) {
		this.view = view;
		this.dao = new GenericDAO<>();
	}

	@Override
	public void Cadastrar() {
		if(this.ObterModelo("cadastrar") == null) {
			JOptionPane.showMessageDialog(null, "ERRO!, OS CAMPOS NÃO FORAM DEVIDAMENTE PREENCHIDOS!");
		}
		else if(this.ObterModelo("cadastrar") != null) {
			this.dao.salvar(this.ObterModelo("cadastrar"));
			JOptionPane.showMessageDialog(null, "ALUNO CADASTRADO COM SUCESSO!");
			
		}

		this.LimparCampos();
		//this.CarregarTabela();

	}

	@Override
	public void CarregarTabela() {
		String nome = "jailton";
		String cpf = "4545";
		String serie = "5465";
		String escola = "44545";
		DefaultTableModel modelo = new DefaultTableModel(
				new Object[] {"NOME", "CPF" , "SERIE", "ESCOLA"},0 );
		
		Object linha[] = new Object[]{
                nome,
                cpf,
                serie,
                escola
            };
		
		modelo.addRow(linha);
		this.view.getTableAlunos().setModel(modelo);
		// TODO Auto-generated method stub

	}

	@Override
	public void SetarCampos() {
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
		this.view.getTextNomeDaEscola().setText("");

	}

	@Override
	public void Editar() {
		// TODO Auto-generated method stub

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

		if(comando.equals("cadastrar")) {
			id = "0";
		}
		
		Aluno aluno = new Aluno(Integer.parseInt(id), Nome, CPF, RG, DataNascimento, NomePai, NomeMae, DataMatricula, NomeEscola,
				SerieMatriculado);
		
		if(this.Validar(aluno)) {
			return aluno;
		}else {
			aluno = null;
			return aluno;
		}
		
		

	}

	

	public boolean Validar(Aluno aluno) {
		if(aluno.getNome() != null && aluno.getNome().length() > 0 && aluno.getCPF() != null && aluno.getCPF().length() > 0 && aluno.getRG() != null && aluno.getRG().length() > 0
				&& aluno.getDataNascimento() != null && aluno.getDataNascimento().length() > 0 && aluno.getNomeMae() != null && aluno.getNomeMae().length() > 0
				&& aluno.getNomePai() != null && aluno.getNomePai().length() > 0 && aluno.getDataMatricula() != null && aluno.getDataMatricula().length() > 0
				&& aluno.getNomeEscola() != null && aluno.getNomeEscola().length() > 0 && aluno.getSerieMatriculado() != null && aluno.getSerieMatriculado().length() > 0) {
				
			return true;
		}else {return false;}
		
	}

}
