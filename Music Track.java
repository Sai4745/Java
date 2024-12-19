public class MusicTrack {
    private String title;
    private String artist;
    private int duration; // in seconds

    // Constructor
    public MusicTrack(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    // Methods to get track details
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    // Display track information
    public void displayTrackInfo() {
        System.out.println("Title: " + title + ", Artist: " + artist + ", Duration: " + duration + " seconds");
    }
}
