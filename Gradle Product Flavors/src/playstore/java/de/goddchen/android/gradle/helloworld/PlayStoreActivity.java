package de.goddchen.android.gradle.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class PlayStoreActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playstore);
        ((TextView)findViewById(R.id.flavor_message)).setText(getString(R.string.flavor_message) + ", SPECIFIC CODE ADDED AS WELL.");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
