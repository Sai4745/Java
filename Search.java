public class TrackSearch {
    public static MusicTrack searchTrack(Playlist playlist, String title) {
        for (MusicTrack track : playlist.tracks) {
            if (track.getTitle().equalsIgnoreCase(title)) {
                return track;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // Create a playlist and add tracks
        Playlist playlist = new Playlist();
        playlist.addTrack(new MusicTrack("Song One", "Artist A", 200));
        playlist.addTrack(new MusicTrack("Song Two", "Artist B", 240));

        // Search for a track
        MusicTrack foundTrack = searchTrack(playlist, "Song One");
        if (foundTrack != null) {
            System.out.println("Track found:");
            foundTrack.displayTrackInfo();
        } else {
            System.out.println("Track not found.");
        }
    }
}
