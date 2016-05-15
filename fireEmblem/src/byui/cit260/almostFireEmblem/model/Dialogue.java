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
public class Dialogue implements Serializable{
    
    // class instance variables
    private String talk;
    private String response;

    // Constructor
    public Dialogue() {
    }
    
    
    
//  Getter and Setter
    public String getTalk() {
        return talk;
    }

    public void setTalk(String talk) {
        this.talk = talk;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
    
    //  equals and hashCode

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.talk);
        hash = 23 * hash + Objects.hashCode(this.response);
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
        final Dialogue other = (Dialogue) obj;
        if (!Objects.equals(this.talk, other.talk)) {
            return false;
        }
        if (!Objects.equals(this.response, other.response)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dialogue{" + "talk=" + talk + ", response=" + response + '}';
    }
    
    
    
}
