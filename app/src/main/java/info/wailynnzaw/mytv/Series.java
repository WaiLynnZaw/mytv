package info.wailynnzaw.mytv;

import java.io.Serializable;
import java.util.ArrayList;

public class Series implements Serializable {
    private String title;
    private ArrayList<Movie> episodes;

    public Series(String title, ArrayList<Movie> episodes) {
        this.title = title;
        this.episodes = episodes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Movie> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(ArrayList<Movie> episodes) {
        this.episodes = episodes;
    }
}
