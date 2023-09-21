package com.ds.finals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie implements Comparable<Movie>{
	int id;
	String name;
	int rating;
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
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Movie(int id, String name, int rating) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
	}
	public String toString() {
		return id+" "+name+" "+rating+"\n";
	}
	public int compareTo(Movie m) {
		
		return this.id-m.id;
		
	}
	
	
}

class RatingCompare implements Comparator<Movie>{
	public int compare(Movie m1, Movie m2) {
		
		if(m1.rating<m2.rating) return -1;
		else if(m1.rating>m2.rating) return 1;
		else
		
		return 0;
	}
}

 

public class Comp {

	public static void main(String[] args) {
		ArrayList<Movie> list= new ArrayList<>();
		list.add(new Movie(1,"shzam",4));
		list.add(new Movie(2,"Vvendata",3));
		list.add(new Movie(3,"Redimsion",6));
		System.out.println(list);
		Collections.sort(list);
		
		System.out.println(list);
		
		Collections.sort(list, new RatingCompare());
		
		System.out.println(list);
		


	}
	
	

}
