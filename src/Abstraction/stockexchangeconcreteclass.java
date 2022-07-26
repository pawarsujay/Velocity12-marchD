package Abstraction;

public class stockexchangeconcreteclass extends stockexchange
{
	void buyandsharebasedonspecificStockExchange()
	{
		System.out.println("implementing Bombay stock exchange");
	}
	public static void main(String[] args) 
	{
		stockexchangeconcreteclass obj= new stockexchangeconcreteclass();
		obj.sharesell();
		obj.buyshare();
		obj.buyandsharebasedonspecificStockExchange();
	}
}


	

