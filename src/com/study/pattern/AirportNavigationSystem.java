package com.study.pattern;

/**
 * @author 
 *
 */
public interface AirportNavigationSystem {
	void registerFlight(Flight flight);
	void registerRunway(Runway runway);
	void setRunwayAvailability(Boolean status);
	Boolean isRunwayAvailable();

}
