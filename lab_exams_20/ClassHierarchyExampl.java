package lab_exams_20;

class VideoTape {
    protected String title;
    protected int duration;

    public VideoTape(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " minutes");
    }
}

class Movie extends VideoTape {
    private String director;

    public Movie(String title, int duration, String director) {
        super(title, duration);
        this.director = director;
    }

    public void display() {
        super.display();
        System.out.println("Director: " + director);
    }
}

class MusicVideo extends VideoTape {
    private String artist;

    public MusicVideo(String title, int duration, String artist) {
        super(title, duration);
        this.artist = artist;
    }

    public void display() {
        super.display();
        System.out.println("Artist: " + artist);
    }
}

public class ClassHierarchyExampl{
    public static void main(String[] args) {
        Movie movie = new Movie("Inception", 148, "Christopher Nolan");
        MusicVideo musicVideo = new MusicVideo("Shape of You", 235, "Ed Sheeran");

        System.out.println("Movie Information:");
        movie.display();
        System.out.println();

        System.out.println("Music Video Information:");
        musicVideo.display();
    }
}

