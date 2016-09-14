package ca.ualberta.cs.lonelytwitter;

/**
 * Created by jferris on 13/09/16.
 */
public class NormalTweet extends Tweet implements Tweetable {

    public NormalTweet(String message) {
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }

}
