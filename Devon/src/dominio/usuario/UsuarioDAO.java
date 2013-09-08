package dominio.usuario;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;
import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector.Matcher;

public class UsuarioDAO{
	
	private String nome;
	private String sobreNome;
	private String apelido;
	private String cargo;
	private String login;
	private char[] senha;
	
	public UsuarioDAO()  {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public boolean setNome(String nome) throws Exception {
		if( this.verificaNome(nome) ){
			this.nome = nome;
			return true;
		}else{
			return false;
		}
	}

	
    private boolean verificaNome(String nome){
    	if(nome == ""){  
            return false;  
        }else{  
            return true;  
        }
	}
	
	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public char[] getSenha() {
		return senha;
	}

	public void setSenha(char[] senha) {
		this.senha = senha;
	}

	public static void salvar(String nome)
	{
		System.out.println("UsuarioDAO - Nome: " + nome);
	}

	
}
