package enums.lab17;

public enum DirectionsOfTheWorld {
    N("północ", "North", 0),
    E("wschód", "East", 90),
    S("południe", "South", 180),
    W("zachód", "West", 270),
    NE("północny wschód", "North-East", 45),
    SE("południowy-wschód", "South-East", 135),
    SW("południowy-zachód", "South-West", 225),
    NW("północny-zachód", "North-West", 315);



    String namePL;
    String nameEn;
    int rotation;

    DirectionsOfTheWorld(String namePL, String nameEn, int rotation) {
        this.namePL = namePL;
        this.nameEn = nameEn;
        this.rotation = rotation;
    }
    public String getNamePL() {
        return namePL;
    }

    public String getNameEn() {
        return nameEn;
    }

    public int getRotation() {
        return rotation;
    }

    @Override
    public String toString() {
        return "DirectionsOfTheWorld{" +
                "namePL = '" + namePL + '\'' +
                ", nameEn = '" + nameEn + '\'' +
                ", rotation = " + rotation +
                '}';
    }
}