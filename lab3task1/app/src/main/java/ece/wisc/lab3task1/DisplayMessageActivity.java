package ece.wisc.lab3task1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayMessageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        // Show the Up button in the action bar.
        ActionBar ab = getActionBar();
        try {
            ab.setDisplayShowTitleEnabled(true);
            ab.setDisplayShowHomeEnabled(true);
        }
        catch (NullPointerException npe) {
            Log.d(TAG, "Null pointer occurred");
        }
    }
}