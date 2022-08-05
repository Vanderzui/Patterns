package alisa.learn.java.patterns.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        Razor egoisticDamageDealer = Razor.getEgoisticDamageDealer();
        egoisticDamageDealer.attack();
    }

}
