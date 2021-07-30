package com.study.pattern;

/**
 * @author 
 *
 */
public class Flight implements Command{
	private ANSImpl mediator;
	public Flight(ANSImpl mediator) {
		this.mediator= mediator;
	}

	@Override
	public void land() {
		if(mediator.isRunwayAvailable()) {
			System.out.println("Landing intiated");
			mediator.setRunwayAvailability(false);
		}else {
			System.out.println("waiting for runway");
		}
		
	}
	public void park() {
		System.out.println("Parking completed");
		mediator.setRunwayAvailability(true);
	}
}
