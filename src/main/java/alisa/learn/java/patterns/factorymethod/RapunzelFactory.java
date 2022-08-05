package alisa.learn.java.patterns.factorymethod;

import org.springframework.stereotype.Component;

@Component
public class RapunzelFactory implements PrincessFactory {

    @Override
    public Princess createPrincess() {
        return new Rapunzel();
    }
}
