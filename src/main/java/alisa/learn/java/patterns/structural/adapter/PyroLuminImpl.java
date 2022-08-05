package alisa.learn.java.patterns.structural.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PyroLuminImpl implements PyroLumin {

    @Override
    public void fire() {
        log.info("Fire!!!");
    }

    @Override
    public void wearOrange() {
        log.info("Wearing orange clothes");
    }
}
