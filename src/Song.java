import java.util.ArrayList;

public class Song {

    ArrayList<String> oldListener = new ArrayList<>();
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int howMany(ArrayList<String> listeners) {
        int cnt = 0;
        for (String x : listeners) {
            String regardless = x.toLowerCase();
            if (!oldListener.contains(regardless)) {
                oldListener.add(regardless);
                cnt++;
            }
        }
        return cnt;
    }
}
