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
 * @author Carson
 */
public class Weapon implements Serializable{
    
    // Class instance variables
    private String name;
    private String type;
    private int damage;

    public Weapon() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.type);
        hash = 83 * hash + this.damage;
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
        final Weapon other = (Weapon) obj;
        if (this.damage != other.damage) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if(!Objects.equals(this.name, other.name)) {
            return false;
        }
            
        return true;
    }

    @Override
    public String toString() {
        return "Weapon{ " + "name=" + name + ", type=" + type + ", damage=" + damage + '}';
    }
    
    
    
}
