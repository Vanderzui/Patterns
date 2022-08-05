package alisa.learn.java.patterns.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DilucBuilder extends CharacterBuilder {

    @Override
    void buildAttackSpeed() {
        character.setAttackSpeed(20);
    }

    @Override
    void buildCriticalDamage() {
        character.setCriticalDamage(35000);
    }

    @Override
    void buildName() {
        character.setName("Diluc");
    }

    public Character getCharacter() {
        return character;
    }

}
