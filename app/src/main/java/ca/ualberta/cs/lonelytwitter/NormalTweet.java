package ca.ualberta.cs.lonelytwitter;

/**
 * Normal tweet extends tweet, use for all normal tweets
 * If desire an important tweet use Important tweet
 * @see ImportantTweet
 */
public class NormalTweet extends Tweet implements Tweetable {

    /**
     * This constructor makes a normalTweet with given string parameter
     *
     * @param message this parameter is the given string for the tweet. If it is set to empty                string then it will be replaced by...
     */
    public NormalTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
