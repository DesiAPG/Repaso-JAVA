package collections.test_compare;

import java.util.Objects;

public class Series implements Actions {
    public final static int higher = 1;
    public final static int lower = -1;
    public final static int equal = 0;
    private String title;
    private int seasons;
    private boolean isAdded;
    private String Category;
    private String Director;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }


    public void setAdded(boolean added) {
        isAdded = added;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public Series(String title, int seasons, String category, String director) {
        this.title = title;
        this.seasons = seasons;
        this.isAdded = false;
        Category = category;
        Director = director;
    }

    @Override
    public String toString() {
        return "Series{" +
                "title='" + title + '\'' +
                ", seasons=" + seasons +
                ", isAdded=" + isAdded +
                ", Category='" + Category + '\'' +
                ", Director='" + Director + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Series series)) return false;
        return Objects.equals(getTitle(), series.getTitle()) && Objects.equals(getDirector(), series.getDirector());
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public void add() {
        isAdded = true;
    }

    @Override
    public void back() {
        isAdded = false;
    }

    public boolean isAdded() {
        return isAdded;
    }

    @Override
    public int compareTo(Object object) {
        int state = lower;
        Series series = (Series) object;
        if (seasons > series.getSeasons()) {
            state = higher;
        } else if (seasons == series.getSeasons()) {
            state = equal;
        }
        return state;
    }

}
