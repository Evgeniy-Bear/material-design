package com.shestakov.pictureoftheday

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.shestakov.pictureoftheday.picture.PictureOfTheDayFragment
import com.shestakov.pictureoftheday.settings.SETTINGS_SHARED_PREFERENCES
import com.shestakov.pictureoftheday.settings.THEME_RES_ID

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(
            getSharedPreferences(SETTINGS_SHARED_PREFERENCES, MODE_PRIVATE)
                .getInt(THEME_RES_ID, R.style.DefaultTheme)
        )
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, PictureOfTheDayFragment.newInstance())
                .commitNowAllowingStateLoss()
        }
    }
}