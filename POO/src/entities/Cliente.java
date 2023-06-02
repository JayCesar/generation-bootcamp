package entities;

import java.time.LocalDate;

public class Cliente {
	private Integer id;
	private String name;
	private String email;
	private LocalDate birthDate;
	private String city;
	
	public Cliente(String name) {
		this.name = name;
	}

	public Cliente(Integer id, String name, String email, LocalDate birthDate, String city) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		this.city = city;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String visualizar() {
		return "Id: " + getId() + "\n" 
				+ "Nome: " + getName() + "\n" 
				+ "E-mail: " + getEmail() + "\n" 
				+ "Data de nascimento: " + getBirthDate() + "\n" 
				+ "Cidade: " + getCity();
	}
	
}
