package org.prog.homework;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    public final static List<Plane> planes = new ArrayList<>();
    
    //if no plane found - throw exception
    public Plane getPlaneByFlightIdAndDestination(String flightNumber, String destination) {
        for (Plane plane : planes) {
            if (plane.getFlightId().equals(flightNumber) && plane.getDestination().equals(destination)) {
                return plane;
            }
        }
        try {
            throw new Exception("No plane found with flight id: " + flightNumber + " and destination: " + destination);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    //if no plane found - throw exception
    public List<Plane> planeByDestination(String destination) throws Exception{
        List<Plane> result = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane.getDestination().equals(destination)) {
                result.add(plane);
            }
        }
        if (result.isEmpty()) {
            throw new Exception("No planes found");
        }
        return null;
    }
}
