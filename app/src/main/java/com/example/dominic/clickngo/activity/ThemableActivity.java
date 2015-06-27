package com.example.dominic.clickngo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.dominic.clickngo.R;
import com.example.dominic.clickngo.preference.PreferenceManager;

public abstract class ThemableActivity extends AppCompatActivity {

	private boolean mDark;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		mDark = PreferenceManager.getInstance().getUseDarkTheme();

		// set the theme
		if (mDark) {
			setTheme(R.style.Theme_DarkTheme);
		}
		super.onCreate(savedInstanceState);
	}

	@Override
	protected void onResume() {
		super.onResume();
		if (PreferenceManager.getInstance().getUseDarkTheme() != mDark) {
			restart();
		}
	}

	protected void restart() {
		final Bundle outState = new Bundle();
		onSaveInstanceState(outState);
		final Intent intent = new Intent(this, getClass());
		finish();
		overridePendingTransition(0, 0);
		startActivity(intent);
	}
}
