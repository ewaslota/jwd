package enums.lab17;

public enum DirectionsOfTheWorld {
    NORTH{
        @Override
        public String name(String abbreviation) {
            return "N" + "North" + "Północ";
        }
    },

    NORTH_EAST{
        @Override
        public String name(String abbreviation) {
            return "NE" + "North-East" + "Północny-Wschód";
        }
    },

    EAST{
            @Override
            public String name(String abbreviation) {
                return "E" + "East" + "Wschód";
            }
    },

    SOUTH_EAST {
        @Override
        public String name(String abbreviation) {
            return "SE " + "South-East " + "Południowy-Wschód ";
        }
    },

    SOUTH {
            @Override
            public String name(String abbreviation) {
                return abbreviation + "S " + "South " + "Południe ";
         }
    },

    SOUTH_WEST {
        @Override
        public String name(String abbreviation) {
            return "SW " +", " + "South-West " + "Południowy-Zachód ";
        }
    },

    WEST {
        @Override
        public String name(String abbreviation) {
            return "W " + "West " + "Zachód ";
        }
    },

    NORTH_WEST{
        @Override
        public String name(String abbreviation) {
            return "NW " + "North-West " + "Północny-Zachód ";
        }
    };

    public abstract String name (String abbreviation);
}

