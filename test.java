public class Airport {
    private List<Plane> planes;

    public Airport() {
        this.planes = new ArrayList<>();
    }

    public void addPlane(Plane plane) {
        this.planes.add(plane);
    }

    public Plane getPlaneByFlightNumberAndDestination(String flightNumber, String destination) throws Exception {
        for (Plane plane : this.planes) {
            if (plane.getFlightNumber().equals(flightNumber) && plane.getDestination().equals(destination)) {
                return plane;
            }
        }
        throw new Exception("Plane not found");
    }

    public List<Plane> getPlanesByDestination(String destination) throws Exception {
        List<Plane> result = new ArrayList<>();
        for (Plane plane : this.planes) {
            if (plane.getDestination().equals(destination)) {
                result.add(plane);
            }
        }
        if (result.isEmpty()) {
            throw new Exception("Planes not found");
        }
        return result;
    }
}