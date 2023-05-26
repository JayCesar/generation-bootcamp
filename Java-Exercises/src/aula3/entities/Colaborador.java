package aula3.entities;

import java.util.List;

//link to exercise: https://docs.google.com/document/d/1MtGrmQGe84qvJrvHT4Avu1K_ij209xAc/edit?usp=sharing&ouid=112690016069965069438&rtpof=true&sd=true

public class Colaborador {
	private Integer age;
	private Integer sex;
	private Integer category;
	
	public Colaborador() {}

	public Colaborador(Integer age, Integer sex, Integer category) {
		this.age = age;
		this.sex = sex;
		this.category = category;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getCategory() {
		return category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}
	
	public Integer totalBackEndDev(List<Colaborador> Colaboradores) {
		int backEndDevs = 0;
		for (Colaborador c : Colaboradores) {
			if (c.getCategory().equals(1)) {
				backEndDevs++;
			}
		}
		return backEndDevs;
	}
	
	public Integer totalWomenFrontDevs(List<Colaborador> Colaboradores) {
		int womenFrontDevs = 0;
		for (Colaborador c : Colaboradores) {
			if (c.getSex().equals(2) && c.getCategory().equals(2)) {
				womenFrontDevs++;
			}
		}
		return womenFrontDevs;
	}
	
	public Integer totalMobileMenOver40(List<Colaborador> Colaboradores) {
		int mobileMenOver40 = 0;
		for (Colaborador c : Colaboradores) {
			if (c.getSex().equals(1) && c.getAge() > 40) {
				mobileMenOver40++;
			}
		}
		return mobileMenOver40;
	}
	
	public Integer totalMobileWomenOver30(List<Colaborador> Colaboradores) {
		int mobileWomenOver30 = 0;
		for (Colaborador c : Colaboradores) {
			if (c.getSex().equals(2) && c.getAge() > 30) {
				mobileWomenOver30++;
			}
		}
		return mobileWomenOver30;
	}
	
}
