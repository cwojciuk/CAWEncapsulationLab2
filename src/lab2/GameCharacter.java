/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Ninja
 */
public class GameCharacter implements Attack{
    
    Attack attacktype = new BowAttack();
    private String characterName;
    private int age;

    public GameCharacter(String characterName, int age) {
        this.characterName = characterName;
        this.age = age;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        //Validation Required
        this.characterName = characterName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //Validation Required
        this.age = age;
    }

    @Override
    public void userAttacks() {
        attacktype.userAttacks();
    }
  
    
}
