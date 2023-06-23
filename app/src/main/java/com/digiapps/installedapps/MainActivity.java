package com.digiapps.installedapps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;

public class MainActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        finishAndRemoveTask();
        startActivity(new Intent(Settings.ACTION_APPLICATION_SETTINGS));
    }
}
