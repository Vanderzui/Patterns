package alisa.learn.java.patterns.builder;

import java.util.Locale;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BuilderMain {

    private static final String AMOUNT_FORMAT_TEMPLATE = "%1$,.2f";
    private static final Locale locale = new Locale("ru");

    public static void main(String[] args) {
        CharacterBuilder dilucBuilder = new DilucBuilder();
        Player player = new Player();
        player.setBuilder(dilucBuilder);
        Character diluc = player.constructCharacter();
        log.info(diluc.toString());

        CharacterBuilder eulaBuilder = new EulaBuilder();
        player.setBuilder(eulaBuilder);
        Character eula = player.constructCharacter();
        log.info(eula.toString());

    }
}