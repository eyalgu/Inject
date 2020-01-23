package app.eyal.inject

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import app.eyal.appentity.App

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appGraph = DaggerAppGraph.factory().create(App)
        val userGraph = appGraph.userGraphFactory.create(appGraph.appComponentB.appDepB.user)
        val userDepB = userGraph.userComponentB.userDepB
        Log.d("MainActivity", userDepB.toString())
    }
}
