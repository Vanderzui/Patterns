package alisa.learn.java.patterns.structural.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AnemoToPyroLuminAdapter implements PyroLumin {

    private AnemoLumin anemoLumin;

    public AnemoToPyroLuminAdapter(AnemoLumin anemoLumin) {
        this.anemoLumin = anemoLumin;
    }

    @Override
    public void fire() {
        log.info("I'm using fire instead of ...");
        anemoLumin.wind();
    }

    @Override
    public void wearOrange() {
        log.info("Better to wear orange instead of ...");
        anemoLumin.wearBlue();
    }
}
