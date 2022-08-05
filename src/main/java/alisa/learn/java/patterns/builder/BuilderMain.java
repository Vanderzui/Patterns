package alisa.learn.java.patterns.builder;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BuilderMain {

    private static final String AMOUNT_FORMAT_TEMPLATE = "%1$,.2f";
    private static final Locale locale = new Locale("ru");

    public static void main(String[] args) {
//        CharacterBuilder dilucBuilder = new DilucBuilder();
//        Player player = new Player();
//        player.setBuilder(dilucBuilder);
//        Character diluc = player.constructCharacter();
//        log.info(diluc.toString());
//
//        CharacterBuilder eulaBuilder = new EulaBuilder();
//        player.setBuilder(eulaBuilder);
//        Character eula = player.constructCharacter();
//        log.info(eula.toString());
//        log.info(BigDecimal.valueOf(1000000, 3).toPlainString().replace(".", ","));

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.getDefault());
        symbols.setDecimalSeparator(',');
        var decimalFormat = new DecimalFormat("#.#", symbols);
        log.info(decimalFormat.format(10));
        log.info(decimalFormat.format(10.0));
        log.info(decimalFormat.format(1000.000));
        log.info(decimalFormat.format(12345678.34));
    }
}