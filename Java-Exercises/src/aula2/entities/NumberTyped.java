package aula2.entities;

public class NumberTyped implements OperatorService	{
	private Double n1;
	private Double n2;
	private char symbol;
	
	public NumberTyped(Double n1, Double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public Double getN1() {
		return n1;
	}

	public void setN1(Double n1) {
		this.n1 = n1;
	}

	public Double getN2() {
		return n2;
	}

	public void setN2(Double n2) {
		this.n2 = n2;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
	
	public char verifySymbol(int inputType) {
		switch(inputType) {
		case 1:
			return '+';
		case 2:
			return '-';
		case 3:
			return '*';
		case 4:
			return '/';
		default:
			return ' ';
 		}
	}

	@Override
	public Double OperatorService(int inputType) {
		switch(inputType) {
		case 1:
			return this.getN1() + this.getN2();
		case 2:
			return this.getN1() - this.getN2();
		case 3:
			return this.getN1() * this.getN2();
		case 4:
			return this.getN1() / this.getN2();
		default:
			return null;
 		}
	}

}
