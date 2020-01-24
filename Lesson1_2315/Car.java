
public class Car {
	private String Model;
	private Double Price;
	
	Car(String model, Double price){
		
		this.Price = price;
		this.Model = model;
		
	}
	
	
	public void setPrince(Double price) {
		this.Price = price;
	}
	
	public void setModel(String model) {
		this.Model = model;
		
	}
	
	public String getMode() {
		return this.Model;
	}
	
	public Double getPrice() {
		return this.Price;
	}
	
	public String toString() {
		return "Model = " + this.Model + " Price = " + this.Price;
		
	}
	
	
	
	
	
}