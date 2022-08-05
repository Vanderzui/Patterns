package alisa.learn.java.patterns.prototype;

public class Albedo implements Replicable {

    private String name;
    private String element;

    public Albedo(String name, String element) {
        this.name = name;
        this.element = element;
    }


    @Override
    public Object clone() {
        return new Albedo(name, element);
    }

    @Override
    public String toString() {
        return "Albedo{" +
                "name='" + name + '\'' +
                ", element='" + element + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setElement(String element) {
        this.element = element;
    }
}
