package alisa.learn.java.patterns.factorymethod;

import org.springframework.stereotype.Component;

@Component
public class CinderellaFactory implements PrincessFactory {

    @Override
    public Princess createPrincess() {
        return new Cinderella();
    }
}
