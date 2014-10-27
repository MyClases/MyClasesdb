package com.example.user.myclases;

import android.app.ActionBar;
        import android.app.Activity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class aa extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aa);

        Button showActionBar = (Button)findViewById(R.id.showactionbar);
        Button hideActionBar = (Button)findViewById(R.id.hideactionbar);

        showActionBar.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                ActionBar actionBar = getActionBar();
                actionBar.show();
            }});

        hideActionBar.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                ActionBar actionBar = getActionBar();
                actionBar.hide();
            }});
    }
}