package hse.ru.avitoweather.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hse.ru.avitoweather.R
import hse.ru.avitoweather.listeners.WeatherListener
import hse.ru.avitoweather.models.HourEntity
import hse.ru.avitoweather.ui.fragments.MainFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_activity, MainFragment())
            .commit()
    }


}