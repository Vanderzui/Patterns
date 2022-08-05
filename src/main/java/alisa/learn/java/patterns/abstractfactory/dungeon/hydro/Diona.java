package alisa.learn.java.patterns.abstractfactory.dungeon.hydro;

import alisa.learn.java.patterns.abstractfactory.CryoCharacter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Diona implements CryoCharacter {

    @Override
    public void cryoReact() {
        log.info("Diona Special!");
    }
}
