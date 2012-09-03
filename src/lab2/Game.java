/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Ninja
 */
public class Game {
    private String gameName;
    private String version;
    private int timePlayed;

    public Game(String gameName, String version, int timePlayed) {
        this.gameName = gameName;
        this.version = version;
        this.timePlayed = timePlayed;
    }
    


    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        //Validation Required
        this.gameName = gameName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        //Validation Required
        this.version = version;
    }

    public int getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(int timePlayed) {
        //Validation Required
        this.timePlayed = timePlayed;
    }
    
    
}
