package entities;

public class Product {
	public String name;
	public double price;
	public int quatity;
	
	public double totalValueInStock(){
		return price * quatity;
	}
	public void addProducts(int quatity){
		this.quatity += quatity;
	}
	public void removeProducts(int quatity){
		this.quatity -= quatity;
	}
	
	public String toString(){
		return name + ", " + "$ " + String.format("%.2f", price) + ", " + quatity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
	}

}
