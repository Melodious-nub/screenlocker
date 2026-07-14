package com.example.screenlocker

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.provider.Settings

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (ScreenLockService.isRunning()) {
            // Service is active, lock the screen immediately
            ScreenLockService.lock()
        } else {
            // Service is not active, open Accessibility Settings
            val intent = Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }

        // Close the activity immediately to keep the UI invisible
        finish()
    }
}
