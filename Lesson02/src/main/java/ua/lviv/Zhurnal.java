package ua.lviv;

public class Zhurnal {
	
	private int id;
	private String name;
	private double price;
	public Zhurnal(String name, double pruce) {
		super();
		this.name = name;
		this.price = pruce;
	}
	public Zhurnal(int id, String name, double pruce) {
		super();
		this.id = id;
		this.name = name;
		this.price = pruce;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Zhurnal [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
