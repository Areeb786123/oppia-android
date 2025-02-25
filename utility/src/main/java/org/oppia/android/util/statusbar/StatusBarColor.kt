package org.oppia.android.util.statusbar

import android.os.Build
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

/** Utility to change the color of Status Bar. */
class StatusBarColor {
  companion object {
    /**
     * This method updates the color of the Status Bar.
     * @param colorId color passed for the status bar
     * @param activity the reference of the activity from which this method is called.
     * @param statusBarLight passed Boolean true if the status bar theme is light, else passed Boolean false
     */
    fun statusBarColorUpdate(colorId: Int, activity: AppCompatActivity, statusBarLight: Boolean) {
      if (statusBarLight && Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        // TODO(#3616): Migrate to the proper SDK 30+ APIs.
        @Suppress("DEPRECATION") // The code is correct for targeted versions of Android.
        activity.window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
      }
      activity.window.statusBarColor = ContextCompat.getColor(activity, colorId)
    }
  }
}
