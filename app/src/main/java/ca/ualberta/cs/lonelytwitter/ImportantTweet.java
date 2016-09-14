package ca.ualberta.cs.lonelytwitter;

/**
 * Created by jferris on 13/09/16.
 */
public class ImportantTweet extends Tweet {

    public ImportantTweet(String message) {
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
