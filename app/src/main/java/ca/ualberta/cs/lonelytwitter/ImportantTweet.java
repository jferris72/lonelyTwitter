package ca.ualberta.cs.lonelytwitter;

/**
 * Important tweet extends class tweet
 * To be used if you want the tweet to stand out and be marked as important
 * For regular tweets use NormalTweet
 * @see Tweet
 * @see NormalTweet
 */
public class ImportantTweet extends Tweet {

    /**
     * Instantiates a new Important tweet.
     *
     * @param message the message
     */
    public ImportantTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

}
