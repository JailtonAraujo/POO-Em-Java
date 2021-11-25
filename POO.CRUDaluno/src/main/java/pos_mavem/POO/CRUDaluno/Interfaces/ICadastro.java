package pos_mavem.POO.CRUDaluno.Interfaces;

import java.util.HashMap;

import pos_mavem.POO.CRUDaluno.MODEL.Aluno;

public interface ICadastro <E>{
	public void Cadastrar();
	
	public void CarregarTabela();
	
	public void SetarCampos();
	
	public void LimparCampos();
	
	public void Delete();
	
	public void Atualizar();
	
	public HashMap Pesquisar();
	
}

