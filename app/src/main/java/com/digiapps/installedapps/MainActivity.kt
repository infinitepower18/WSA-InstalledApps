package com.digiapps.installedapps

import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(Intent.ACTION_MAIN)
        intent.component = ComponentName(
            "com.android.settings",
            "com.android.settings.applications.ManageApplications"
        )
        startActivity(intent)
        finish()
    }
}
