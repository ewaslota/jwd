package interfaces.lab15;

import interfaces.Calculator;

public class CDPlayer extends MusicPlayer {
    private static final String PLAYER_TYPE = "CD Player";
    public CDPlayer(Song[] library) {
        super(PLAYER_TYPE, library);
    }

}
