/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Ninja
 */
public abstract class GameCharacter{
    
    Attack attackType;
    private String characterType;
    private String weaponInHand;

    public GameCharacter() {
        
    }

    public String getCharacterType() {
        return characterType;
    }

    public void setCharacterType(String characterType) {
        //Validation Required
        this.characterType = characterType;
    }

    public String getWeaponInHand() {
        return weaponInHand;
    }

    public void setWeaponInHand(String weaponInHand) {
        //Validation Required
        this.weaponInHand = weaponInHand;
        performAttack();
    }

  
    public void performAttack(){
        attackType.userAttacks();
    }
  
    
}
