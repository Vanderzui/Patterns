package alisa.learn.java.patterns.builder;

public abstract class CharacterBuilder {

    Character character;

    void createCharacter() {
        character = new Character();
    }

    abstract void buildAttackSpeed();

    abstract void buildCriticalDamage();

    abstract void buildName();

    abstract Character getCharacter();


}
