package com.example;

public class Main_Tester {

	
		public static void main(String[] args) {
	        
	        
	        ProductInterface[] pi = new Product[5];
	       
	        pi[0] = new Tv(3400, "Samsung", 20);
	        pi[1] = new Tv(3800, "Sony", 67);
	        pi[2] = new MP3Player(450, "jesm", "green");
	        pi[3] = new Book(34, "Dirty", 1574);
	        pi[4] = new Book(15, "Three methods", 2004);
	        
	        double totalRegularPrice = 0;
	        double totalSalePrice = 0;
	        
	        for (int i=0; i<pi.length; i++){
	            totalRegularPrice += pi[i].getRegularPrice();
	            //total = total + pi[i]
	            totalSalePrice += pi[i].computeSalePrice();
	            
	            System.out.println("Item number " + i +
	                    ": Type = " + pi[i].getClass().getName() +
	                    ", Regular price = " + pi[i].getRegularPrice() +
	                    ", Sale price = " + pi[i].computeSalePrice());
	        }
	        System.out.println("totalRegularPrice = " + totalRegularPrice);
	        System.out.println("totalSalePrice = " + totalSalePrice);
	    }
	    
	
		 
	}


