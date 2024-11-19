package Student_Bus.Student_Busm.entity;

import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable  // Marks this class as embeddable for use as a composite key
public class BusStopageId implements Serializable {

    private String stopName;  // The stop name
    private String routeName;  // The route name

    // Default constructor
    public BusStopageId() {}

    // Constructor to initialize the fields
    public BusStopageId(String stopName, String routeName) {
        this.stopName = stopName;
        this.routeName = routeName;
    }

    // Getters and setters
    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    // Override equals() and hashCode() for proper comparison and retrieval
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusStopageId that = (BusStopageId) o;
        return stopName.equals(that.stopName) && routeName.equals(that.routeName);
    }

    @Override
    public int hashCode() {
        return 31 * stopName.hashCode() + routeName.hashCode();
    }
}
