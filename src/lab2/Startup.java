/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Ninja
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game g = new Game();
        g.setGameName("The Quest.");
        g.setGameName("1.0.0.1a");
        g.setTimePlayed(0);
        
        GameCharacter player = new Ranger();
        player.setCharacterType("Ranger");
        player.setWeaponInHand("Bow");
        
        GameWorld gw = new GameWorld();
        gw.setSeedValue("fser89sdesdf09");
        gw.setStartLocationX(100);
        gw.setStartLocationY(340);
        gw.setStartLocationZ(543);
    }
}
