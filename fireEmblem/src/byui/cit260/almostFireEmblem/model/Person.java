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
public class Person implements Serializable {
    
    // class instance variables, let's do this quan!
    private String name;
    private String description;
    private int strength;
    private int speed;
    private int defense;
    private int hp;
    private int turn;
    private String location;  // I'm not sure if this should be a int or something else...
    private String items;
    private String weapon;
    
    // default constructor

    public Person() {
    }
    
    // end constructor
    
    // start getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    
    public int getDefense() {
        return defense;
    }
    
    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
        
        // end getters and setters
        
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + this.strength;
        hash = 53 * hash + this.defense;
        hash = 53 * hash + this.speed;
        hash = 53 * hash + this.hp;
        hash = 53 * hash + this.turn;
        hash = 53 * hash + Objects.hashCode(this.location);
        hash = 53 * hash + Objects.hashCode(this.items);
        hash = 53 * hash + Objects.hashCode(this.weapon);
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
        final Person other = (Person) obj;
        if (this.strength != other.strength) {
            return false;
        }
        if (this.defense != other.defense) {
            return false;
        }
        if (this.speed != other.speed) {
            return false;
        }
        if (this.hp != other.hp) {
            return false;
        }
        if (this.turn != other.turn) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.items, other.items)) {
            return false;
        }
        if (!Objects.equals(this.weapon, other.weapon)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", description=" + description + ", strength=" + strength +", defense=" +  defense + ", speed=" + speed + ", hp=" + hp + ", turn=" + turn + ", location=" + location + ", items=" + items + ", weapon=" + weapon + '}';
    }
    
    
}
