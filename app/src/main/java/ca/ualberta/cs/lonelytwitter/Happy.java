package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jferris on 13/09/16.
 */
public class Happy extends Mood {

    public Happy(Date date) {
        super(date);
    }

    public String feelings() {
        return "I am feeling like a million dollars";
    }
}
