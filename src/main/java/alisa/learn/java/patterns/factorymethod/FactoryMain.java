package alisa.learn.java.patterns.factorymethod;

import org.springframework.stereotype.Component;

@Component
//@RequiredArgsConstructor
public class FactoryMain {

    private PrincessFactory princessFactory;

    public FactoryMain(CinderellaFactory princessFactory) {
        this.princessFactory = new RapunzelFactory(); //use anyone princess
    }

    public FactoryMain() {
    }

    public void method() {
        var princess = princessFactory.createPrincess();
//         var princessFactory = princessChooser("snowwhite");
//         var princess = princessFactory.createPrincess();
        princess.princessDo();

    }

    private static PrincessFactory princessChooser(
            String princessName) { //also can make this useful method
        if (princessName.equalsIgnoreCase("snowwhite")) {
            return new SnowWhiteFactory();
        } else if (princessName.equalsIgnoreCase("cinderella")) {
            return new CinderellaFactory();
        } else if (princessName.equalsIgnoreCase("rapunzel")) {
            return new RapunzelFactory();
        } else {
            throw new RuntimeException(princessName + " can't do anything");
        }
    }
}
