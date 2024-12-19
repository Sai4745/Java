import java.util.ArrayList;

public class Playlist {
    private ArrayList<MusicTrack> tracks;

    // Constructor
    public Playlist() {
        tracks = new ArrayList<>();
    }

    // Add a track to the playlist
    public void addTrack(MusicTrack track) {
        tracks.add(track);
    }

    // Display all tracks in the playlist
    public void displayPlaylist() {
        System.out.println("Playlist:");
        for (MusicTrack track : tracks) {
            track.displayTrackInfo();
        }
    }
}
