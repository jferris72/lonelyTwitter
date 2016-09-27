package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by jferris on 27/09/16.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        TweetList list = new TweetList();

        Tweet tweet = new NormalTweet("Hello!");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    public void testHasTweet() {
        TweetList list = new TweetList();

        Tweet tweet = new NormalTweet("Hello!");
        assertFalse(list.hasTweet(tweet));
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    public void testGetTweet() {
        TweetList list = new TweetList();

        Tweet a = new NormalTweet("Hello!");
        Tweet b = new NormalTweet("HI!");

        list.add(a);
        list.add(b);

        assertEquals(a, list.getTweet(0));
        assertEquals(b, list.getTweet(1));
    }

    public void testDeleteTweet() {
        TweetList list = new TweetList();

        Tweet tweet = new NormalTweet("Hello!");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));

        list.delete(tweet);
        assertFalse(list.hasTweet(tweet));
    }

    public void testCountTweet() {
        TweetList list = new TweetList();

        Tweet a = new NormalTweet("Hello!");
        Tweet b = new NormalTweet("HI!");

        list.add(a);
        list.add(b);

        assertEquals(2, list.getCount());
    }
}
