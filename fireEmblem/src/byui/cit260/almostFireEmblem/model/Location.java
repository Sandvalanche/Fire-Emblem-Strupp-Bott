/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.almostFireEmblem.model;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jacob
 */
public class Location implements Serializable {
    
    private double rowLocation;
    private double colLocation;
    private String person;

    public double getRowLocation() {
        return rowLocation;
    }

    public void setRowLocation(double rowLocation) {
        this.rowLocation = rowLocation;
    }

    public double getColLocation() {
        return colLocation;
    }

    public void setColLocation(double colLocation) {
        this.colLocation = colLocation;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public Location() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.rowLocation) ^ (Double.doubleToLongBits(this.rowLocation) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.colLocation) ^ (Double.doubleToLongBits(this.colLocation) >>> 32));
        hash = 19 * hash + Objects.hashCode(this.person);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.rowLocation) != Double.doubleToLongBits(other.rowLocation)) {
            return false;
        }
        if (Double.doubleToLongBits(this.colLocation) != Double.doubleToLongBits(other.colLocation)) {
            return false;
        }
        if (!Objects.equals(this.person, other.person)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "rowLocation=" + rowLocation + ", colLocation=" + colLocation + ", person=" + person + '}';
    }
    
    
    
}
