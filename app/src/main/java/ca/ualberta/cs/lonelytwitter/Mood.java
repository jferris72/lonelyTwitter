package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jferris on 13/09/16.
 */
public abstract class Mood {
    private Date date;

    public Mood (Date date) {
        this.date = date;
    }

    public Mood() {
        this.date = new Date();
    }


    public abstract String feelings();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
