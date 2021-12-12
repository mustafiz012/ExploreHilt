package com.musta.explorehilt.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.musta.explorehilt.LogApplication
import com.musta.explorehilt.R
import com.musta.explorehilt.navigator.AppNavigator
import com.musta.explorehilt.navigator.Screens
import dagger.hilt.android.AndroidEntryPoint

/**
 * Main activity of the application.
 *
 * Container for the Buttons & Logs fragments. This activity simply tracks clicks on buttons.
 */
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var navigator: AppNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigator = (applicationContext as LogApplication).serviceLocator.provideNavigator(this)

        if (savedInstanceState == null) {
            navigator.navigateTo(Screens.BUTTONS)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()

        if (supportFragmentManager.backStackEntryCount == 0) {
            finish()
        }
    }
}
