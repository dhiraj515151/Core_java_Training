package com.example;

public  class Tv extends Electronics {
	
				int size;
	public Tv(double regularPrice, String manufacturer,int size)
	{
		super(regularPrice, manufacturer);
		this.size = size;
		
	}

	public double computeSalePrice()
	{
        return super.getRegularPrice() * 0.7;
    }

}
