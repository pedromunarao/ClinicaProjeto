package domain;

import java.util.Objects;

public class Usuario {
	private String nome;
    private String usuario;
    private String senha;
    
	public Usuario() {
		super();
	}

	public Usuario(String nome, String usuario, String senha) {
		super();
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", usuario=" + usuario + ", senha=" + senha + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, senha, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(senha, other.senha)
				&& Objects.equals(usuario, other.usuario);
	}
	
	
    
    
}
