package pos_mavem.POO.CRUDaluno.Interfaces;

import pos_mavem.POO.CRUDaluno.MODEL.Aluno;

public interface ICadastro <E>{
	public void Cadastrar();
	
	public void CarregarTabela();
	
	public void SetarCampos();
	
	public void LimparCampos();
	
	public void Editar();
	
}

