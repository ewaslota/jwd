package enums.lab17;

public enum Computation {
    ADD{
        @Override
        public double perform(double x, double y) {
            return x + y;
        }
    },
    SUBSTRACT{
        @Override
        public double perform(double x, double y) {
            return x - y;
        }
    },
    MULTIPLY {
        @Override
        public double perform(double x, double y) {
            return x * y;
        }
    },
    DIVIDE {
        @Override
        public double perform(double x, double y) {
            return x / y;
        }
    };

    abstract public double perform(double x, double y);
}
