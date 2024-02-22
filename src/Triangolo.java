package src;

public class Triangolo implements Forma {

    public int base;
    public int altezza;

    public Triangolo(int base, int altezza) {
        this.altezza = altezza;
        this.base = base;
    }

    @Override
    public int calcolaArea() {
        return base * altezza / 2;
    }
}
