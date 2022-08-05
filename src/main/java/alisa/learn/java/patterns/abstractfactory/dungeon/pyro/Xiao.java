package alisa.learn.java.patterns.abstractfactory.dungeon.pyro;

import alisa.learn.java.patterns.abstractfactory.AnemoCharacter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Xiao implements AnemoCharacter {

    @Override
    public void anemoReact() {
        log.info("Evil conquering!");
    }
}
