package alisa.learn.java.patterns.abstractfactory.dungeon;

import alisa.learn.java.patterns.abstractfactory.AnemoCharacter;
import alisa.learn.java.patterns.abstractfactory.CryoCharacter;
import alisa.learn.java.patterns.abstractfactory.ElectroCharacter;
import alisa.learn.java.patterns.abstractfactory.GenshinParty;
import alisa.learn.java.patterns.abstractfactory.HydroCharacter;
import alisa.learn.java.patterns.abstractfactory.PyroCharacter;
import alisa.learn.java.patterns.abstractfactory.dungeon.hydro.Diona;
import alisa.learn.java.patterns.abstractfactory.dungeon.hydro.Xiangling;
import org.springframework.stereotype.Component;

@Component
public class PartyForHydroDunge implements GenshinParty {

    @Override
    public AnemoCharacter getAnemoChar() {
        return null;
    }

    @Override
    public CryoCharacter getCryoChar() {
        return new Diona();
    }

    @Override
    public HydroCharacter getHydroChar() {
        return null;
    }

    @Override
    public PyroCharacter getPyroChar() {
        return new Xiangling();
    }

    @Override
    public ElectroCharacter getElectroChar() {
        return null;
    }
}
