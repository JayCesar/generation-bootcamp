package aula2.entities;

public class Employer {
	private String nameEmpoyer;
	private Integer code;
	private Double income;
	private String jobTittle;
	private Double netIncome;
	
	public Employer() {}

	public Employer(String nameEmpoyer, Integer code, Double income) {
		this.nameEmpoyer = nameEmpoyer;
		this.code = code;
		this.income = income;
		this.jobTittle = verifyCode(code);
	}

	public String getNameEmpoyer() {
		return nameEmpoyer;
	}

	public void setNameEmpoyer(String nameEmpoyer) {
		this.nameEmpoyer = nameEmpoyer;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}
	
	public String getJobTittle() {
		return jobTittle;
	}

	public void setJobTittle(String jobTittle) {
		this.jobTittle = jobTittle;
	}

	// calculate percentual
	public Double netIncome() {
		if(code == 1) {
			return this.getIncome() + ((10.0 / 100) * this.getIncome());
		}else if(code == 2) {
			return this.getIncome() + ((7.0 / 100) * this.getIncome());
		}else if(code == 3) {
			return this.getIncome() + ((9.0 / 100) * this.getIncome());
		}else if(code == 4) {
			return this.getIncome() + ((6.0 / 100) * this.getIncome());
		}else if(code == 5) {
			return this.getIncome() + ((5.0 / 100) * this.getIncome());
		}else if(code == 6) {
			return this.getIncome() + ((8.0 / 100) * this.getIncome());
		}else {
			return null;
		}
	}
	
	// verify jobTitle
	public String verifyCode(int code) {
		if(code == 1) {
			return "Gerente";
		}else if(code == 2) {
			return "Vendedor";
		}else if(code == 3) {
			return "Supervisor";
		}else if(code == 4) {
			return "Motorista";
		}else if(code == 5) {
			return "Estoquista";
		}else if(code == 6) {
			return "Técnico de TI";
		}
		else {
			return null;
		}
	}
	
}
