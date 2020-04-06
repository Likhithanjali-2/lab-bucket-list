package service;

import java.util.ArrayList;
import java.util.List;

import model.TouristPlace;

public class ListOperations {
	List<String> myList = new ArrayList<String>();
	
	public List add(TouristPlace places) {
		System.out.println("adding ...");
		myList.add(places.getName());
		myList.add(places.getDestination());
		myList.add(places.getRank());
		return myList;	
	}
	public List remove(TouristPlace places) {
		System.out.println("removing...");
		return null;
	}
	public Object sortByDestination(List places) {
		System.out.println("sort by dest ...");
		return places;
	}
	public Object sortByRank(List places) {
		System.out.println("sort by rank");
		return places;
		
	}
	public Object reset(List places) {
		System.out.println("reset ...");
		return places;
	}
}