/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Ninja
 */
public class GameWorld {
    private String seedValue;
    private int startLocationX;
    private int startLocationY;
    private int startLocationZ;

    public GameWorld(String seedValue, int startLocationX, int startLocationY, int startLocationZ) {
        this.seedValue = seedValue;
        this.startLocationX = startLocationX;
        this.startLocationY = startLocationY;
        this.startLocationZ = startLocationZ;
    }

    public GameWorld() {
    }
    
    
    public String getSeedValue() {
        return seedValue;
    }

    public void setSeedValue(String seedValue) {
        //Validation Required
        this.seedValue = seedValue;
    }

    public int getStartLocationX() {
        return startLocationX;
    }

    public void setStartLocationX(int startLocationX) {
        //Validation Required
        this.startLocationX = startLocationX;
    }

    public int getStartLocationY() {
        return startLocationY;
    }

    public void setStartLocationY(int startLocationY) {
        //Validation Required
        this.startLocationY = startLocationY;
    }

    public int getStartLocationZ() {
        return startLocationZ;
    }

    public void setStartLocationZ(int startLocationZ) {
        //Validation Required
        this.startLocationZ = startLocationZ;
    }
    
    
}
