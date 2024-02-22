package src;

public class Rettangolo implements Forma {
    public int base;
    public int altezza;

    public Rettangolo(int base, int altezza) {
        this.altezza = altezza;
        this.base = base;
    }

    @Override
    public int calcolaArea() {
        return base * altezza;
    }
}
