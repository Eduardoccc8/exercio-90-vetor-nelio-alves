package entities;

public class Product {
	
	private String nome;
	private double prince;
	
	
	public Product(String nome, double prince) {	
		this.nome = nome;
		this.prince = prince;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPrince() {
		return prince;
	}


	public void setPrince(double prince) {
		this.prince = prince;
	}
	
	
	
	
	
	
	

}
