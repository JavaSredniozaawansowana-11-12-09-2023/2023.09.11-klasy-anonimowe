package pl.comarch.szkolenia.enumy;

public class App {
    public static void main(String[] args) {
        Emplyee emplyee = new Emplyee();
        emplyee.name = "Janusz";
        emplyee.surname = "Kowalski";
        emplyee.sex = Sex.MEN;


        Emplyee emplyee2 = new Emplyee();
        emplyee2.name = "Zbyszek";
        emplyee2.surname = "Malinowski";
        emplyee2.sex = Sex.OTHER;

        Sex s = Sex.MEN;

        System.out.println(s.getX());

        Console ps5 = Console.PS5;
        System.out.println(ps5.getBrand());
        System.out.println(ps5.getModel());
        System.out.println(ps5.getReleaseDate());
        System.out.println(ps5.getCpu());

        ps5.setBrand("Nowy");

        Console ps = Console.PS5;
        System.out.println(ps.getBrand());

        Console ps2 = Console.PS5;
        System.out.println(ps2.getBrand());

        System.out.println(ps2.compareTo(ps));

        if(ps == Console.PS5) {

        }
    }
}
