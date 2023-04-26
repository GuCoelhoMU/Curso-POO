package exercicio;

public class Usuario extends Pessoa{
	private String login;
	private int totAssistido;
	
	
	public Usuario(String nome, int idade, String login) {
		super(nome, idade);
		this.login = login;
		this.totAssistido = 0;
	}

	public void viuMaisUm() {
		this.setTotAssistido(this.getTotAssistido()+1);
	}

	@Override
	protected void ganharExp() {
		// TODO Auto-generated method stub
		if(this.getTotAssistido() == 2) {
			this.setExperiencia(this.getExperiencia()+1);
		}
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}

	@Override
	public String toString() {
		return "Usuario [login=" + login + ", totAssistido=" + totAssistido + "]";
	}

	
}
