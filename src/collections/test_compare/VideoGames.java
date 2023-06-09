package collections.test_compare;

import java.util.Objects;

public class VideoGames implements Actions {

    public final static int higher = 1;
    public final static int lower = -1;
    public final static int equal = 0;
    private String title;
    private int hoursStimated;
    private boolean isAdded;
    private String Category;
    private String Company;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getHoursStimated() {
        return hoursStimated;
    }

    public void setHoursStimated(int hoursStimated) {
        this.hoursStimated = hoursStimated;
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

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public VideoGames(String title, int hoursStimated, String category, String company) {
        this.title = title;
        this.hoursStimated = hoursStimated;
        this.isAdded = false;
        Category = category;
        Company = company;
    }

    @Override
    public String toString() {
        return "VideoGames{" +
                "title='" + title + '\n' +
                ", hoursStimated=" + hoursStimated + '\n' +
                ", isAdded=" + isAdded + '\n' +
                ", Category='" + Category + '\n' +
                ", Company='" + Company + '\n' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VideoGames that)) return false;
        return Objects.equals(getTitle(), that.getTitle()) && Objects.equals(getCompany(), that.getCompany());
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
        VideoGames videoGames = (VideoGames) object;
        if (hoursStimated > videoGames.getHoursStimated()) {
            state = higher;
        } else if (hoursStimated == videoGames.getHoursStimated()) {
            state = equal;
        }
        return state;
    }
}
