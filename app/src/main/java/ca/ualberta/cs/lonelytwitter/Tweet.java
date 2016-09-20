package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by jferris on 13/09/16.
 */
public abstract class Tweet {
    private String message;
    private Date date;
    private ArrayList<Mood> moodList;

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
        this.moodList = new ArrayList<Mood>();
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
        this.moodList = new ArrayList<Mood>();
    }

    public abstract Boolean isImportant();

    public void setMessage(String message) throws TweetsTooLongException {
        if(message.length() > 140) {
            //Do the thin
            throw new TweetsTooLongException();
        }
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public void setMood(Mood mood) {
        this.moodList.add(mood);
    }

    public ArrayList<Mood> getMood() {
        return moodList;
    }

    public void printMood() {
        for (Mood i : this.moodList) {
            System.out.println(i.feelings());
        }
    }

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }

}
