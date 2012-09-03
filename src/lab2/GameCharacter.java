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
    
    Attack attack;
    private String characterName;
    private int age;

    
    public GameCharacter(){
        
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void performAttack() {
        attack.userAttacks();
    }
  
    
}
