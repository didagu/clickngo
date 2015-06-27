package com.example.dominic.clickngo.activity;


import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.dominic.clickngo.R;

public class AboutSettingsActivity extends ThemableSettingsActivity   {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about_settings);

		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView textView1= (TextView)findViewById(R.id.textView2);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.facebook.com/didagu")));
            }
        });
        TextView textView2= (TextView)findViewById(R.id.textView3
        );
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.twitter.com/dombrainbox")));
            }
        });


    }

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		finish();
		return true;
	}

}
