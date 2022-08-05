package alisa.learn.java.patterns.factorymethod;

import org.springframework.stereotype.Component;

@Component
public class SnowWhiteFactory implements PrincessFactory {

    @Override
    public Princess createPrincess() {
        return new SnowWhite();
    }
}
