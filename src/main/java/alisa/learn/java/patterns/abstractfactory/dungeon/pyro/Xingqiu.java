package alisa.learn.java.patterns.abstractfactory.dungeon.pyro;

import alisa.learn.java.patterns.abstractfactory.HydroCharacter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Xingqiu implements HydroCharacter {

    @Override
    public void hydroReact() {
        log.info("Raincutter!");
    }
}
