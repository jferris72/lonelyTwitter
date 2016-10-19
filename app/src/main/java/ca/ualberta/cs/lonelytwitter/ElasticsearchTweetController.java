package ca.ualberta.cs.lonelytwitter;

import android.os.AsyncTask;
import android.util.Log;

import com.searchly.jestdroid.DroidClientConfig;
import com.searchly.jestdroid.JestClientFactory;
import com.searchly.jestdroid.JestDroidClient;

import io.searchbox.core.DocumentResult;
import io.searchbox.core.Index;

/**
 * Created by jferris on 18/10/16.
 */
public class ElasticsearchTweetController {
    private static JestDroidClient client;

    //TODO we need a function that gets tweets!

    //TODO we need a function that adds a tweet!
    public static class AddTweetsTask extends AsyncTask<NormalTweet, Void, Void> {

        @Override
        protected Void doInBackground(NormalTweet... tweets) {
            verifySettings();

            for (NormalTweet tweet: tweets) {
                Index index = new Index.Builder(tweet).index("testing").type("tweet").build();

                try {
                    DocumentResult result = client.execute(index);
                    if(result.isSucceeded()){
                        tweet.setId(result.getId());
                    }
                    else {
                        Log.i("error", "not able to add tweet");
                    }
                }
                catch(Exception e) {
                    Log.i("Uhoh", "We failed");
                }
            }

            return null;
        }
    }

    private static void verifySettings() {
        if(client == null) {
            DroidClientConfig.Builder builder = new DroidClientConfig.Builder("http://cmput301.softwareprocess.es:8080");
            DroidClientConfig config = builder.build();

            JestClientFactory factory = new JestClientFactory();
            factory.setDroidClientConfig(config);
            client = (JestDroidClient) factory.getObject();
        }
    }
}
