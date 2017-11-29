package service;

import model.Empresa;

import java.util.ArrayList;

import dao.EmpresaDAO;


public class EmpresaService {
	EmpresaDAO dao = new EmpresaDAO();
	
	public int criar(Empresa empresa) {
		return dao.criarEmpresa(empresa);
	}
	
	public void atualizar(Empresa empresa){
		dao.atualizarEmpresa(empresa);
	}
	
	public void excluir(int id){
		dao.excluirEmpresa(id);
	}
	
	public Empresa carregar(int id){
		return dao.carregarTudo(id);
	}
	
	public ArrayList<Empresa> select(){
		return dao.carregaTodosItens();
	}
 
}
