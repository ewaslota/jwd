package interfaces.lab15;

public class StereoSystem {
    public static void main(String[] args) {

        Song[] songs = new Song[3];
        songs[0] = new Song("Michael Jackson", "Beat It", "Thriller");
        songs[1] = new Song("Pearl Jam", "Even Flow", "Ten");
        songs[2] = new Song("Portishead", "Over", "NYC Live");

        Player[] players = {new StreamingPlayer("Sreaming", songs), new Mp3Player("Mp3", songs), new CDPlayer("CD", songs)};
        players[0].play();
        players[0].stop();
        players[0].next();

        System.out.println();

        players[1].play();
        players[1].next();
        players[1].play();
        players[1].stop();
        players[1].previous();

        System.out.println();

        players[2].play();
        players[2].pause();
        }
    }

