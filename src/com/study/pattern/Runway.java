package com.study.pattern;

/**
 * @author 
 *
 */
public class Runway implements Command{
	private ANSImpl mediator;
	public Runway(ANSImpl mediator) {
		this.mediator= mediator;
	}

	@Override
	public void land() {
		System.out.println("Runway is available");
		mediator.setRunwayAvailability(true);
		
	}

}
