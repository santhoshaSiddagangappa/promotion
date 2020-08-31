package com.santu.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Promotion {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<Product>();
		System.out.print("total number of order");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i =0; i < n; i++){
			System.out.println("enter the type of product:A,B,C or D");
			String type = scanner.next();
			Product product = new Product(type);
			products.add(product);
		}
		scanner.close();
		int totalPrice = getTotalPrice(products);
		System.out.println("Total Price: " +totalPrice);
	}

	@SuppressWarnings("unused")
	private static int getTotalPrice(List<Product> products) {
		int counterofA = 0;
        int priceofA = 50;
        int counterofB = 0;
        int priceofB = 30;
        int counterofC = 0;
        int priceofC = 20;
        int counterofD = 0;
        int priceofD = 15;
        for (Product product : products) {
			if(product.id.equalsIgnoreCase("A")){
				counterofA += 1;
			}
			if(product.id.equalsIgnoreCase("B")){
				counterofB += 1;
			}
			if(product.id.equalsIgnoreCase("C")){
				counterofC += 1;
			}
			if(product.id.equalsIgnoreCase("D")){
				counterofD += 1;
			}
		}
        int totalPriceofA = (counterofA / 3) * 130 + (counterofA % 3 * priceofA);
        int totalPriceofB = (counterofB / 2) * 45 + (counterofB % 2 * priceofB);
        int totalPriceofC = (counterofC * priceofC);
        int totalPriceofD = (counterofD * priceofD);
        return totalPriceofA + totalPriceofB + totalPriceofC + totalPriceofD;
	}

}
