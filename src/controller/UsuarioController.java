package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import domain.Medico;
import domain.Usuario;
import enums.UsuarioEnum;
import modelo.dao.UsuarioDao;
import view.PnlCadUsuario;

public class UsuarioController {
	
	private Usuario usuario;
	private UsuarioDao usuarioDao;
	
	public void salvar(PnlCadUsuario pnl) {
		usuarioDao = new UsuarioDao();
		usuario = new Usuario();
		usuario.setNome(pnl.getNome().getText());
		usuario.setUsuario(pnl.getEmail().getText());
		usuario.setSenha(pnl.getSenha().getText());
		if(pnl.getTipo().getSelectedItem().toString() == "ATENDENDTE") {
			usuario.setTipo(UsuarioEnum.ATENDENTE);
			usuarioDao.Salvar(usuario);
			
		}else if(pnl.getTipo().getSelectedItem().toString() == "MÉDICO") {
			usuario.setTipo(UsuarioEnum.MEDICO);
			Medico medico = (Medico) usuario;
			medico.setCrm(pnl.getCrm().getText());
			medico.setEspecializacao(pnl.getEspecializacao().getText());
			usuarioDao.Salvar(medico);
		}
		else {
			usuario.setTipo(UsuarioEnum.ADMIN);
			usuarioDao.Salvar(usuario);
		}
		
	}
	
	public ArrayList<Usuario> consultar(){
		usuarioDao = new UsuarioDao();
		return usuarioDao.Consultar();
	}
	
	public Usuario buscarUsuario(String email) {
		usuarioDao = new UsuarioDao();
		return usuarioDao.buscaUsuario(email);	
	}
	
	public void atualizaUsuario(PnlCadUsuario pnl){
		usuarioDao = new UsuarioDao();
		usuario = new Usuario();
		usuario.setId(Integer.parseInt(pnl.getId().getText()));
		usuario.setNome(pnl.getNome().getText());
		usuario.setSenha(pnl.getSenha().getText());
		if(pnl.getTipo().getSelectedItem().toString() == "ATENDENDTE") {
			usuario.setTipo(UsuarioEnum.ATENDENTE);
			usuarioDao.Salvar(usuario);
			
		}else if(pnl.getTipo().getSelectedItem().toString() == "MÉDICO") {
			usuario.setTipo(UsuarioEnum.MEDICO);
			Medico medico = (Medico) usuario;
			medico.setCrm(pnl.getCrm().getText());
			medico.setEspecializacao(pnl.getEspecializacao().getText());
			usuarioDao.Salvar(medico);
		}
		else {
			usuario.setTipo(UsuarioEnum.ADMIN);
			usuarioDao.Salvar(usuario);
		}
		
	}
	
	public void excluirUsuario(PnlCadUsuario pnl) {
		usuarioDao = new UsuarioDao();
		int resposta = JOptionPane.showConfirmDialog(pnl, "Confirma a exclusão deste usuário?");
		
		if (resposta == JOptionPane.YES_OPTION) {
			usuarioDao.excluirUsuario(Integer.parseInt(pnl.getId().getText()));
		}
	}

}
