package alisa.learn.java.patterns.builder;

public class Character {

    private int attackSpeed;
    private int criticalDamage;

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public void setCriticalDamage(int criticalDamage) {
        this.criticalDamage = criticalDamage;
    }


    @Override
    public String toString() {
        return "Character name=" + name +
                ", attackSpeed=" + attackSpeed +
                ", criticalDamage=" + criticalDamage;
    }
}
