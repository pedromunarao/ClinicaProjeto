package domain;

import java.util.Objects;

import enums.UsuarioEnum;


public class Usuario {
	private Integer id;
	private String nome;
    private String usuario;
    private String senha;
    private UsuarioEnum tipo;
    
    
	public Usuario() {
		super();
	}

	public Usuario(String nome, String usuario, String senha, UsuarioEnum tipo) {
		super();
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
		this.tipo = tipo;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
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

	public UsuarioEnum getTipo() {
		return tipo;
	}
	
	public void setTipo(UsuarioEnum tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", usuario=" + usuario + ", senha=" + senha + "tipo=" + tipo.descricao + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, senha, usuario, tipo);
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
				&& Objects.equals(usuario, other.usuario) && tipo==other.tipo ;
	}
	
	
    
    
}
