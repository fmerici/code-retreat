package code_retreat;

public class Ticket {
	
	private String person = "COFFEE_ADDICT";
	private String movie = "For a Fistful of Dollars";
	private String coffee ="Latte";
	private String popCorn = "Pop Corn with butter";
	
	private Boolean whenDinner;
	
	public String getPerson() {
		return person;
	}
	
	public String getMovie() {
		return movie;
	}
	public String getCoffee() {
		return coffee;
	}
	public String getPopCorn() {
		return popCorn;
	}
	public void setWhenDinner(Boolean eatingDinner) {
		whenDinner = eatingDinner;
	}
	public Boolean getWhenDinner() {
		return whenDinner;
	}

}
