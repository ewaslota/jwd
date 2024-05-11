package nightworking.enums;

public enum Countries {

    PL("Polska", "Poland", "PL") {
        @Override
        String entitle(String name) {
            return "Pan/Pani " + name + ", kraj pochodzenia: " + getNamePl();
        }
    },
    UK("Zjednoczone Królestwo", "United Kingdom", "UK") {
        @Override
        String entitle(String name) {
            return "Mr/Ms " + name + ", country: " + getNameEn();
        }
    },
    DE("Niemcy", "Germany", "DE") {
        @Override
        String entitle(String name) {
            return "Herr/Frau " + name + ", Land: " + getNameEn();
        }
    }
    ;
    String namePl;
    String nameEn;
    String countryCode;

    Countries(String namePl, String nameEn, String countryCode) {
        this.namePl = namePl;
        this.nameEn = nameEn;
        this.countryCode = countryCode;
    }

    public String getNamePl() {
        return namePl;
    }

    public String getNameEn() {
        return nameEn;
    }

    public String getCountryCode() {
        return countryCode;
    }

    abstract String entitle(String name);

    @Override
    public String toString() {
        return "Countries{" +
                "namePl='" + namePl + '\'' +
                ", nameEn='" + nameEn + '\'' +
                ", countryCode='" + countryCode + '\'' +
                '}';
    }
}
