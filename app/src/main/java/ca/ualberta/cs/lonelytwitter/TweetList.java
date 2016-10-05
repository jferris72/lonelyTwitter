package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.List;

/**
 * Creates a list of tweets with methods to get tweets and check for having tweets
 */
public class TweetList {
    /**
     * The Tweets.
     */
    List<Tweet> tweets = new ArrayList<Tweet>();

    /**
     * Add.
     *
     * @param tweet the tweet
     */
    public void add(Tweet tweet) {
        tweets.add(tweet);
    }

    /**
     * Has tweet boolean.
     *
     * @param tweet the tweet
     * @return the boolean
     */
    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    /**
     * Gets tweet.
     *
     * @param i the
     * @return the tweet
     */
    public Tweet getTweet(int i) {
        return tweets.get(i);
    }

    /**
     * Delete.
     *
     * @param tweet the tweet
     */
    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }

    /**
     * Gets count.
     *
     * @return the count
     */
    public int getCount() {
        return tweets.size();
    }
}
