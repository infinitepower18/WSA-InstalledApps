package com.digiapps.installedapps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        finishAndRemoveTask();
        startActivity(new Intent(Intent.ACTION_MAIN).setClassName(
                "com.android.settings",
                "com.android.settings.applications.ManageApplications"
        ));
    }
}
