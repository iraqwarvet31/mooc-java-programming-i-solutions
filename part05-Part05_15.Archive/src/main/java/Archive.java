/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justadev
 */
public class Archive {
    private String identifier;
    private String name;
    
    public Archive (String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Archive)) {
            return false;
        }
        
        Archive compareArchive = (Archive) compared;
        
        if (this.identifier.equals(compareArchive.identifier)) {
          return true;
        }
        return false;
    }
    
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
