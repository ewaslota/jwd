package interfaces.lab15;

abstract public class MusicPlayer implements Player {

    public String playerType;
    private Song[] songs;
    private int currentSongIndex = 0;

    public MusicPlayer(String playerType, Song[] songs) {
        this.playerType = playerType;
        this.songs = songs;
    }

    public Song getCurrentSong() {
        return songs[currentSongIndex];
    }

    public void play() {
        System.out.println(playerType + " odtwarza " + getCurrentSong());
    }

    public void pause() {
        System.out.println(playerType + " pauza" + getCurrentSong());
    }

    public void stop () {
        System.out.println(playerType + " stop");
    }

    public void next() {
        if (++currentSongIndex >= songs.length) {
            currentSongIndex = 0;
        }
        System.out.println(playerType + " następny");
        play();
    }

    public void previous() {
        if (--currentSongIndex < 0 ) {
            currentSongIndex = songs.length - 1;
        }
        System.out.println(playerType + " poprzedni");
        play();
    }

}
