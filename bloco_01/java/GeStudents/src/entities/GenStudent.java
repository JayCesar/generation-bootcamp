package entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class GenStudent implements Comparable<GenStudent>{
	private String email;
	private String name;
	private LocalDate birthDate;
	private String songLink;
	private String sign;
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public GenStudent() {}

	public GenStudent(String email, String name, LocalDate birthDate, String songLink, String sign) {
		this.email = email;
		this.name = name;
		this.birthDate = birthDate;
		this.songLink = songLink;
		this.sign = sign;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getSongLink() {
		return songLink;
	}

	public void setSongLink(String songLink) {
		this.songLink = songLink;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	
	// Calcula idade
	public long calculateAge(LocalDate currentDate) {
		return Period.between(birthDate, currentDate).getYears();
	}
	
	// gStudent.getBirthDate().getMonth() == currentDate.getMonth() && gStudent.getBirthDate().getDayOfMonth() == currentDate.getDayOfMonth()) {
	@Override
	public int compareTo(GenStudent otherStudent) {
		return birthDate.compareTo(otherStudent.getBirthDate());
	}
	
	
}
