package nightworking.enums;

public class CountriesTester {
    public static void main(String[] args) {
        Countries country = Countries.UK;
        System.out.println("Moje państwo to: " + country.getNamePl());
        System.out.println("Indeks mojego państwa to: " + country.ordinal());
        System.out.println("Nazwa wartości enuma mojego państwa to: " + country.name());

        for (Countries value : Countries.values()) {
            System.out.println(value);
        }

        System.out.println("Wartość mojego państwa to: " + Countries.valueOf("PL"));

        System.out.println("Kraj: " + Countries.valueOf("PL").getNamePl());

        System.out.println(Countries.valueOf("DE").entitle("Helga"));
        System.out.println(Countries.valueOf("UK").entitle("John"));
    }
}
