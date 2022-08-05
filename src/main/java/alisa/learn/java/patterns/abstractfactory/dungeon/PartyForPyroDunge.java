package alisa.learn.java.patterns.abstractfactory.dungeon;

import alisa.learn.java.patterns.abstractfactory.AnemoCharacter;
import alisa.learn.java.patterns.abstractfactory.CryoCharacter;
import alisa.learn.java.patterns.abstractfactory.ElectroCharacter;
import alisa.learn.java.patterns.abstractfactory.GenshinParty;
import alisa.learn.java.patterns.abstractfactory.HydroCharacter;
import alisa.learn.java.patterns.abstractfactory.PyroCharacter;
import alisa.learn.java.patterns.abstractfactory.dungeon.pyro.Xiao;
import alisa.learn.java.patterns.abstractfactory.dungeon.pyro.Xingqiu;
import org.springframework.stereotype.Component;

@Component
public class PartyForPyroDunge implements GenshinParty {

    @Override
    public AnemoCharacter getAnemoChar() {
        return new Xiao();
    }

    @Override
    public CryoCharacter getCryoChar() {
        return null;
    }

    @Override
    public HydroCharacter getHydroChar() {
        return new Xingqiu();
    }

    @Override
    public PyroCharacter getPyroChar() {
        return null;
    }

    @Override
    public ElectroCharacter getElectroChar() {
        return null;
    }
}
