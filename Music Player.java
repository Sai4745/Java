public class MusicPlayer {
    private MusicTrack currentTrack;

    // Play a track
    public void playTrack(MusicTrack track) {
        currentTrack = track;
        System.out.println("Now playing: " + track.getTitle() + " by " + track.getArtist());
    }

    // Stop the track
    public void stopTrack() {
        if (currentTrack != null) {
            System.out.println("Stopped playing: " + currentTrack.getTitle());
            currentTrack = null;
        } else {
            System.out.println("No track is currently playing.");
        }
    }
}
