package com.example.screenlocker

import android.accessibilityservice.AccessibilityService
import android.annotation.SuppressLint
import android.view.accessibility.AccessibilityEvent

@SuppressLint("AccessibilityPolicy")
class ScreenLockService : AccessibilityService() {

    override fun onServiceConnected() {
        super.onServiceConnected()
        instance = this
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        // No implementation needed for this app
    }

    override fun onInterrupt() {
        // No implementation needed
    }

    override fun onDestroy() {
        super.onDestroy()
        instance = null
    }

    fun lockScreen() {
        performGlobalAction(GLOBAL_ACTION_LOCK_SCREEN)
    }

    companion object {
        private var instance: ScreenLockService? = null

        fun isRunning(): Boolean = instance != null

        fun lock() {
            instance?.lockScreen()
        }
    }
}
