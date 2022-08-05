package alisa.learn.java.patterns.abstractfactory.dungeon;

import alisa.learn.java.patterns.abstractfactory.AnemoCharacter;
import alisa.learn.java.patterns.abstractfactory.CryoCharacter;
import alisa.learn.java.patterns.abstractfactory.ElectroCharacter;
import alisa.learn.java.patterns.abstractfactory.GenshinParty;
import alisa.learn.java.patterns.abstractfactory.HydroCharacter;
import alisa.learn.java.patterns.abstractfactory.PyroCharacter;
import alisa.learn.java.patterns.abstractfactory.dungeon.cryo.Diluc;
import alisa.learn.java.patterns.abstractfactory.dungeon.cryo.YaeMiko;
import org.springframework.stereotype.Component;

@Component
public class PartyForCryoDunge implements GenshinParty {

    @Override
    public AnemoCharacter getAnemoChar() {
        return null;
    }

    @Override
    public CryoCharacter getCryoChar() {
        return null;
    }

    @Override
    public HydroCharacter getHydroChar() {
        return null;
    }

    @Override
    public PyroCharacter getPyroChar() {
        return new Diluc();
    }

    @Override
    public ElectroCharacter getElectroChar() {
        return new YaeMiko();
    }
}
