package com.example.walczpio.task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView BrithnessActivityStart;
    Toolbar toolBar;
    Intent enterBrithnessActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolBar);

        BrithnessSettingsTextView();

    }

    private void BrithnessSettingsTextView() {
        BrithnessActivityStart = (TextView) findViewById(R.id.brithnessAactivityEnter);
        BrithnessActivityStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enterBrithnessActivity = new Intent(MainActivity.this, BrithnessSettingsActivity.class);
                MainActivity.this.startActivity(enterBrithnessActivity);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }
}
