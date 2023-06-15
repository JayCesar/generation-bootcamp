package aula2.entities;

public class Donor {
	private String name;
	private Integer age;
	private boolean donorStatus;
	
	public Donor(String name, Integer age, boolean donorStatus) {
		this.name = name;
		this.age = age;
		this.donorStatus = donorStatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public boolean getDonorStatus() {
		return donorStatus;
	}

	public void setDonorStatus(boolean donorStatus) {
		this.donorStatus = donorStatus;
	}
	
	public boolean verifyFirstTime(boolean input) {
		if (input) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
