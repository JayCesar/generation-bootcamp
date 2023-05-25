package mySearches.Equals;

public class Pessoa {

	private String cpf;
	private String nome;
	
	public Pessoa(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public boolean equals(Object obj) {
		// Aqui acontece o Down Casting, ou seja, a classe Object 'desce' e 
		// eu transformo ela em pessoa
		Pessoa p = (Pessoa) obj;
		return (this.cpf == p.cpf) && (this.nome == p.nome);
	}
	
}
