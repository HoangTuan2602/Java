package goi;

public class Product {
	private String ID;
	private String Name;
	
	public Product() {}

	public Product(String iD, String name) {
		super();
		ID = iD;
		Name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
