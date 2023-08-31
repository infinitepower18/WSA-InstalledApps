package com.digiapps.installedapps;

import android.content.Intent;
import android.os.Bundle;

public class Activity extends android.app.Activity {
    public final void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        finishAndRemoveTask();
        startActivity(new Intent(Intent.ACTION_MAIN).setClassName(
            "com.android.settings",
            "com.android.settings.applications.ManageApplications"
        ));
    }
}
