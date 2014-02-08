package com.nachiket.titan.equalizer.activity;

import com.nachiket.titan.R;
import com.nachiket.titan.equalizer.HeadsetService;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;

public class Equalizer extends PreferenceActivity {
	public static final String SHARED_PREFERENCES_BASENAME = "com.nachiket.titan.eualizer";
	public static final String ACTION_UPDATE_PREFERENCES = "com.nachiket.titan.eualizer.UPDATE";
	
	public static final int NOTIFY_FOREGROUND_ID = 1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.main_preferences);
		/* mostly for development: ensure that the service is running if it isn't running yet. */
		startService(new Intent(HeadsetService.NAME));
    }
}