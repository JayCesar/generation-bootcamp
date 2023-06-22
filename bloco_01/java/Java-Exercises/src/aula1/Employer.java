package aula1;

public class Employer {
	private float grossIncome;
	private float additionalNight;
	private float extraHours;
	private float discount;
	
	public Employer(float grossIncome, float additionalNight, float extraHours, float discount) {
		this.grossIncome = grossIncome;
		this.additionalNight = additionalNight;
		this.extraHours = extraHours;
		this.discount = discount;
	}

	public float getGrossIncome() {
		return grossIncome;
	}

	public void setGrossIncome(float grossIncome) {
		this.grossIncome = grossIncome;
	}

	public float getAdditionalNight() {
		return additionalNight;
	}

	public void setAdditionalNight(float additionalNight) {
		this.additionalNight = additionalNight;
	}

	public float getExtraHours() {
		return extraHours;
	}

	public void setExtraHours(float extraHours) {
		this.extraHours = extraHours;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	public float netIncome() {
		return grossIncome + additionalNight + (extraHours * 5) - discount;
	}
	
	
	
}
