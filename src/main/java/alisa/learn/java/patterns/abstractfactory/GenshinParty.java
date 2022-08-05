package alisa.learn.java.patterns.abstractfactory;

public interface GenshinParty {

    AnemoCharacter getAnemoChar();

    CryoCharacter getCryoChar();

    HydroCharacter getHydroChar();

    PyroCharacter getPyroChar();

    ElectroCharacter getElectroChar();

}
