package alisa.learn.java.patterns.builder;

public class Player {

    CharacterBuilder builder;

    public void setBuilder(CharacterBuilder builder) {
        this.builder = builder;
    }

    public Character constructCharacter() {
        builder.createCharacter();
        builder.buildAttackSpeed();
        builder.buildCriticalDamage();
        builder.buildName();

        Character character = builder.getCharacter();
        return character;
    }


}
