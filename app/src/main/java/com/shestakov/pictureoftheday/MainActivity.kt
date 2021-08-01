package com.shestakov.pictureoftheday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shestakov.pictureoftheday.R
import com.shestakov.pictureoftheday.picture.PictureOfTheDayFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, PictureOfTheDayFragment.newInstance())
                .commitNow()
        }
    }
}