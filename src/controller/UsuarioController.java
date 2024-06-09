package controller;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import com.mysql.cj.x.protobuf.MysqlxNotice.Frame;

import domain.Medico;
import domain.Usuario;
import enums.UsuarioEnum;
import exceptions.UsuarioNaoEncontradoException;
import modelo.dao.UsuarioDao;
import view.FrmCadPaciente;
import view.FrmCadUsuario;
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
		if(pnl.getTipo().getSelectedItem().toString().equals("ATENDENDTE")) {
			usuario.setTipo(UsuarioEnum.ATENDENTE);
			usuarioDao.Salvar(usuario);
			
		}else if(pnl.getTipo().getSelectedItem().toString().equals("MÉDICO")) {
			Medico medico = new Medico();
			medico.setNome(pnl.getNome().getText());
			medico.setUsuario(pnl.getEmail().getText());
			medico.setSenha(pnl.getSenha().getText());
			medico.setTipo(UsuarioEnum.MEDICO);
			medico.setCrm(pnl.getCrm().getText());
			medico.setEspecializacao(pnl.getEspecializacao().getText());
			usuarioDao.Salvar(medico);
		}
		else {
			usuario.setTipo(UsuarioEnum.ADMIN);
			usuarioDao.Salvar(usuario);
		}
		
		JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(pnl);
        if (frame instanceof FrmCadUsuario) {
            ((FrmCadUsuario) frame).closeAndOpenSuccess();
        }
		
	}
	
	public ArrayList<Usuario> consultar(){
		usuarioDao = new UsuarioDao();
		return usuarioDao.consultar();
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
		usuario.setUsuario(pnl.getEmail().getText());
		usuario.setSenha(pnl.getSenha().getText());
		if(pnl.getTipo().getSelectedItem().toString().equals("ATENDENDTE")) {
			usuario.setTipo(UsuarioEnum.ATENDENTE);
			usuarioDao.atualizaUsuario(usuario);
			
		}else if(pnl.getTipo().getSelectedItem().toString().equals("MÉDICO")) {
			Medico medico = new Medico();
			usuario.setId(Integer.parseInt(pnl.getId().getText()));
			medico.setNome(pnl.getNome().getText());
			medico.setUsuario(pnl.getEmail().getText());
			medico.setSenha(pnl.getSenha().getText());
			medico.setTipo(UsuarioEnum.MEDICO);
			medico.setCrm(pnl.getCrm().getText());
			medico.setEspecializacao(pnl.getEspecializacao().getText());
			usuarioDao.atualizaUsuario(medico);
		}
		else {
			usuario.setTipo(UsuarioEnum.ADMIN);
			usuarioDao.atualizaUsuario(usuario);
		}
		
		JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(pnl);
        if (frame instanceof FrmCadUsuario) {
            ((FrmCadUsuario) frame).closeAndOpenSuccess();
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
