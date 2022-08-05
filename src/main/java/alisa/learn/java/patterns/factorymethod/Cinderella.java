package alisa.learn.java.patterns.factorymethod;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Cinderella implements Princess {

    @Override
    public void princessDo() {
        log.info("Cinderella is singing for the birds and rats");
    }
}
