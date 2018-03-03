package car;

public class Car {

	private String brand;
	private boolean isNew;
	private int milleage;
	private double price;
	
	Car(){
		System.out.print("Inicjacja z nowego konstuktora\n");
	}
	
	Car(String brand){
		this();
		this.brand=brand;
	}
	
	Car(String brand, boolean isNew, int milleage, double price){
		this(brand);
		this.isNew = isNew;
		this.milleage = milleage;
		this.price = price;
	}
	
	void printCar(){
		System.out.print("Marka: " + brand);
		System.out.print(" Nowy: " + isNew);
		System.out.print(" Przebieg: " + milleage);
		System.out.print(" Cena: " + price);
	}
	
	public String getBrand(){
		return brand;
	}
	
	public boolean isNew(){
		return isNew;
	}
	
	public void setNew(boolean isNew){
		this.isNew = isNew;
	}
	
	public int getMilleage(){
		return milleage;
	}
	
	public void setMilleage(int milleage){
		this.milleage = milleage;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setprice(double price){
		this.price = price ;
	}
}
