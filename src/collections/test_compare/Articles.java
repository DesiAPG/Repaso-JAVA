package collections.test_compare;

import java.util.ArrayList;
import java.util.List;

public class Articles {
    public static void main(String[] args) {
        List<Series> series = new ArrayList<>();
        List<VideoGames> videoGames = new ArrayList<>();

        series.add(new Series("Dark", 3, "Suspense", "Vince Gilligan"));
        series.add(new Series("Game of thrones", 7, "Action", "Vince Gilligan"));
        series.add(new Series("The Walking dead", 11, "Suspense", "Vince Gilligan"));
        series.add(new Series("Stranger things", 4, "Suspense", "Vince Gilligan"));
        series.add(new Series("Breaking Bad", 5, "Action", "Vince Gilligan"));

        videoGames.add(new VideoGames("GTA V", 100, "Action - Open world", "Rockstar"));
        videoGames.add(new VideoGames("Minecraft", 10000, "Open world", "Rockstar"));
        videoGames.add(new VideoGames("Valorant", 100000, "Action - Shooter", "Rockstar"));
        videoGames.add(new VideoGames("Counter strike", 3000, "Action - Shooter", "Rockstar"));
        videoGames.add(new VideoGames("Geometry Dash", 5000, "Platforms", "Rockstar"));

        for (int i = 0; i < series.size(); i++) {
            series.get(i).add();
        }

        for (int i = 0; i < videoGames.size(); i++) {
            videoGames.get(i).add();
        }

        int added = 0;

        for (int i = 0; i < series.size(); i++) {
            if (series.get(i).isAdded()) {
                added++;
                series.get(i).back();
            }

        }

        for (int i = 0; i < videoGames.size(); i++) {
            if (videoGames.get(i).isAdded()) {
                added++;
                videoGames.get(i).back();
            }

        }

        System.out.println("There's " + added + " items added");
        System.out.println();

        Series seriesHigher = series.get(0);
        VideoGames videoGamesHigher = videoGames.get(0);

        for (int i = 0; i < series.size(); i++) {
            if (series.get(i).compareTo(seriesHigher) == Series.higher) {
                seriesHigher = series.get(i);
            }
        }
        for (int i = 0; i < videoGames.size(); i++) {
            if (videoGames.get(i).compareTo(videoGamesHigher) == VideoGames.higher) {
                videoGamesHigher = videoGames.get(i);
            }
        }

        Series seriesLower = series.get(0);
        VideoGames videoGamesLower = videoGames.get(0);

        for (int i = 0; i < series.size(); i++) {
            if (series.get(i).compareTo(seriesLower) == Series.lower) {
                seriesLower = series.get(i);
            }
        }
        for (int i = 0; i < videoGames.size(); i++) {
            if (videoGames.get(i).compareTo(videoGamesLower) == VideoGames.lower) {
                videoGamesLower = videoGames.get(i);
            }
        }

        System.out.println();
        System.out.println("Higher articles: ");
        System.out.println("*---*---*---*---*");
        System.out.println();
        System.out.println(seriesHigher);
        System.out.println();
        System.out.println("Lower articles: ");
        System.out.println("*---*---*---*---*");
        System.out.println();
        System.out.println(seriesLower);
    }
}
