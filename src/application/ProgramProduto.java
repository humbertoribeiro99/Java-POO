package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramProduto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter produtc data");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quatity in stock: ");
		product.quatity = sc.nextInt();

		System.out.println("Produtc data: "+product.toString());
		
		System.out.println("Enter the number of produtc to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Update data: "+product.toString());
		
		System.out.println("Enter the number of produtc to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("Update data: "+product.toString());
		
		
		sc.close();
	}

}
