package alisa.learn.java.patterns.structural.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AnemoLuminImpl implements
        AnemoLumin {

    @Override
    public void wind() {
        log.info("Anemo power!");
    }

    @Override
    public void wearBlue() {
        log.info("Wearing blue clothes");
    }
}
