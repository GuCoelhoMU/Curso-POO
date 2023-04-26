package exercicio;

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected int experiencia;
	
protected abstract void ganharExp();

public Pessoa(String nome, int idade) {
	super();
	this.nome = nome;
	this.idade = idade;
	this.experiencia = 0;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public int getExperiencia() {
	return experiencia;
}

public void setExperiencia(int experiencia) {
	this.experiencia = experiencia;
}

}
