package alisa.learn.java.patterns.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Razor {

    private static Razor razor;


    private Razor() {
    }

    public static Razor getEgoisticDamageDealer() {
        if (razor == null) {
            return new Razor();
        }
        return razor;
    }

    public void attack() {
        log.info("I'm a lonely wolf, i do not need anyone");
    }
}
