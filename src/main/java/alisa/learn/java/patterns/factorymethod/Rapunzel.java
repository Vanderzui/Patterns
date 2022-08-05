package alisa.learn.java.patterns.factorymethod;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Rapunzel implements Princess {

    @Override
    public void princessDo() {
        log.info("Rapunzel is combing her hair");
    }
}
