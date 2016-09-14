package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jferris on 13/09/16.
 */
public class Sad extends Mood {

    public Sad(Date date) {
        super(date);
    }

    public String feelings() {
        return "I am feeling used and neglected";
    }
}
