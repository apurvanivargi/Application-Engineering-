/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Apurva
 */
public class FlightSchedule {
    
    private ArrayList <Flight> flightCollection;
    
    
     public FlightSchedule()
    {
        flightCollection = new ArrayList<Flight>();
        //airliner = new Airliner();
    }

    public ArrayList<Flight> getFlightCollection() {
        return flightCollection;
    }

    public void setFlightCollection(ArrayList<Flight> flightCollection) {
        this.flightCollection = flightCollection;
    }

    public Flight addflightschedule()
    {
        Flight f = new Flight();
        flightCollection.add(f);
        return f;
    }
}
