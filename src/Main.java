package src;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 2);
        Rettangolo rettangolo1 = new Rettangolo(3, 3);
        Triangolo triangolo = new Triangolo(2, 3);
        Triangolo triangolo1 = new Triangolo(6, 5);


        System.out.println(rettangolo.calcolaArea());
        System.out.println(rettangolo1.calcolaArea());
        System.out.println(triangolo.calcolaArea());
        System.out.println(triangolo1.calcolaArea());
    }
}
