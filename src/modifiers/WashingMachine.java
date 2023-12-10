package modifiers;

public class WashingMachine {
    private int temprature;
    private int spinning;

    void modeForSensitiveClothes() {
        temprature = 30;
        spinning = 800;
    }

    void modeForTowelsAndBedLinen() {
        temprature = 90;
        spinning = 1200;
    }
}
