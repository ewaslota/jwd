package interfaces.lab15;

public class Mp3Player extends MusicPlayer {
    private static final String PLAYER_TYPE = "Mp3 Player";
    public Mp3Player(Song[] library) {
       super(PLAYER_TYPE, library);
    }
}
