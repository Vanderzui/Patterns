package alisa.learn.java.patterns.abstractfactory.dungeon.cryo;

import alisa.learn.java.patterns.abstractfactory.ElectroCharacter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class YaeMiko implements ElectroCharacter {

    @Override
    public void electroReact() {
        log.info("Come on now");
    }
}
