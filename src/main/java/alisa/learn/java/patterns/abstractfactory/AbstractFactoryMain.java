package alisa.learn.java.patterns.abstractfactory;

import alisa.learn.java.patterns.abstractfactory.dungeon.PartyForCryoDunge;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@NoArgsConstructor
public class AbstractFactoryMain {

    public void letsPlayGenshin() {
        PartyForCryoDunge cryoDunge = new PartyForCryoDunge();
        PyroCharacter pyroChar = cryoDunge.getPyroChar();
        ElectroCharacter electroChar = cryoDunge.getElectroChar();

        log.info("Lets go to cryo dunge!");
        pyroChar.pyroReact();
        electroChar.electroReact();
    }
}
