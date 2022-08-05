package alisa.learn.java.patterns.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EulaBuilder extends CharacterBuilder {

    @Override
    void buildAttackSpeed() {
        character.setAttackSpeed(10);
    }

    @Override
    void buildCriticalDamage() {
        character.setCriticalDamage(30000);
    }

    @Override
    void buildName() {
        character.setName("Eula");
    }

    public Character getCharacter() {
        return character;
    }

}
