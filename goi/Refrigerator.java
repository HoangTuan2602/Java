package goi;

public class Refrigerator extends Product {
	private String Company;
	private double Price;
	private double Amount;

	public Refrigerator() {
	}

	public Refrigerator(String ID, String Name, String company, double price, double amount) {
		super(ID, Name);
		Company = company;
		Price = price;
		Amount = amount;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

}
