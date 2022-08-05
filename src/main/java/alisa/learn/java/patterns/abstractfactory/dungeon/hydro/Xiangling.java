package alisa.learn.java.patterns.abstractfactory.dungeon.hydro;

import alisa.learn.java.patterns.abstractfactory.PyroCharacter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Xiangling implements PyroCharacter {

    @Override
    public void pyroReact() {
        log.info("Goba get it!");
    }
}
