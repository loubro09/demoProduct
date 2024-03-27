package Model;

public enum BeverageType {
    Small_coffee(30),
    Large_coffee(50),
    Energydrink(130);

    private int caffeine;

    BeverageType(int caffeine) {
        this.caffeine = caffeine;
    }

    public int getCaffeine() {return caffeine;}
}
