public class MusicApp {
    public static void main(String[] args) {
        // Create tracks
        MusicTrack track1 = new MusicTrack("Song One", "Artist A", 200);
        MusicTrack track2 = new MusicTrack("Song Two", "Artist B", 240);
        MusicTrack track3 = new MusicTrack("Song Three", "Artist C", 180);

        // Create playlist
        Playlist playlist = new Playlist();
        playlist.addTrack(track1);
        playlist.addTrack(track2);
        playlist.addTrack(track3);

        // Display playlist
        playlist.displayPlaylist();

        // Play tracks
        MusicPlayer player = new MusicPlayer();
        player.playTrack(track1);
        player.stopTrack();
        player.playTrack(track2);
    }
}
