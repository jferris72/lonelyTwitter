package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 *interface to be implemented by tweet types
 * ensures able to get date and message
 */
public interface Tweetable {
    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage();

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate();
}
