package entities;

import java.time.LocalDate;

public class Produto {
	private String name;
	private String tipo;
	private LocalDate paymentDay;
	private Double price;
	private String brand;
	
	public Produto(String name, String tipo, LocalDate paymentDay, Double price, String brand) {
		this.name = name;
		this.tipo = tipo;
		this.paymentDay = paymentDay;
		this.price = price;
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public LocalDate getPaymentDay() {
		return paymentDay;
	}

	public void setPaymentDay(LocalDate paymentDay) {
		this.paymentDay = paymentDay;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String visualizar() {
		return "Nome: " + getName() + "\n" 
				+ "Tipo: " + getTipo() + "\n" 
				+ "Dia da compra: " + getPaymentDay() + "\n" 
				+ "Preço: " + getPrice() + "\n" 
				+ "Marca: " + getBrand();
	}
	
}
