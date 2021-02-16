package entities;

public class Product {
	//encapsular
	private String name;
	private double price;
	private int quantity;
	
	//CONSTRUTOR PADRÃO
	public Product() {
		
	}
	
	//MÉTODO CONSTRUTOR
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	//SOBRECARGA
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	//MÉTODO SET PARA ALTERAR
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//MÉTODO GET É PARA PEGAR
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}
	public void addProducts(int quantity){
		//alta referência para um objeto, diferenciar variáveis iguais
		this.quantity += quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
		
	}
	
	public String toString() {
		return name + ", $ " 
				+ String.format("%.2f", price) //formatar a string para colocar em duas casas decimais
				+ " , " 
				+ quantity 
				+ " units, Total: $ " 
				+  String.format("%.2f", totalValueInStock());
	}
}
