package controller;

import domain.Medico;
import domain.Usuario;
import enums.UsuarioEnum;
import modelo.dao.UsuarioDao;
import view.PnlCadUsuario;

public class UsuarioController {
	
	private Usuario usuario;
	private UsuarioDao usuarioDao;
	
	public void Salvar(PnlCadUsuario pnl) {
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

}
