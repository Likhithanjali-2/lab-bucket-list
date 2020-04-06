package model;

public class TouristPlace {
	private String name, destination, rank;
	public TouristPlace(String name,String destination,String rank){
		this.name = name;
		this.destination = destination;
		this.rank = rank;
	}
	public String getName(){
		return this.name;
	}
	public String getDestination(){
		return this.destination;
	}
	public String getRank(){
		return this.rank;
	}
}