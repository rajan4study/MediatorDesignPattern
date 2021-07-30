package com.study.pattern;

/**
 * @author 
 *
 */
public class Airport {

	public static void main(String[] args) {
		ANSImpl ansi=new ANSImpl();
		Runway runway= new Runway(ansi);
		ansi.registerRunway(runway);
		
		Flight flight1=new Flight(ansi);
		Flight flight2=new Flight(ansi);
		ansi.registerFlight(flight1);
		runway.land();
		flight1.land();
		flight2.land();
		flight1.park();
		flight2.land();
		flight2.park();

	}

}
