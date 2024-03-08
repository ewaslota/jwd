package interfaces.lab15;

import overleading.Printer;

public class StreamingPlayer extends MusicPlayer {
    private static final String PLAYER_TYPE = "Streaming Player";
    public StreamingPlayer(Song[] library) {
        super(PLAYER_TYPE, library);
    }
}
