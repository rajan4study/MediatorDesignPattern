package com.study.pattern;

/**
 * @author 
 *
 */
public class ANSImpl implements AirportNavigationSystem {
	
	protected Flight flight;
	protected Runway runway;
	public Boolean status;

	@Override
	public void registerFlight(Flight flight) {
		this.flight=flight;

	}

	@Override
	public void registerRunway(Runway runway) {
		this.runway=runway;

	}

	@Override
	public void setRunwayAvailability(Boolean status) {
		this.status=status;

	}

	@Override
	public Boolean isRunwayAvailable() {
		return status;
	}

}
