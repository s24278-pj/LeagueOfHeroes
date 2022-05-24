package model.heroes;

public class Mage extends Hero {
    protected void modifyStrength() {
        strength++;
    }

    protected void modifyDefence() {
        defence++;
    }

    protected void modifyIntelligence() {
        intelligence = (int) ((intelligence + 1) / 1.2);
        intelligence++;
        intelligence *= 1.2;
    }

    protected void modifyDexterity() {
        dexterity = (int) ((dexterity + 1) / 1.05);
        dexterity++;
        dexterity *= 1.05;
    }

    public void modifyAgility() {
        agility = (int) ((agility + 1) / 1.02);
        agility++;
        agility *= 1.02;
    }

    protected void modifySpeed() {
        speed++;
    }
}
