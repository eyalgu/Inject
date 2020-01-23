package app.eyal.inject

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import app.eyal.appentity.App
import kotlinx.coroutines.flow.collect

class MainActivity : AppCompatActivity() {

    lateinit var appGraph: AppGraph
    var userGraph: UserGraph? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        appGraph = DaggerAppGraph.factory().create(App)
        lifecycleScope.launchWhenCreated {
            appGraph.appComponentB.appDepB.user.collect {
                userGraph = appGraph.userGraphFactory.create(it).also {
                    val userDepB = it.userComponentB.userDepB
                    Log.d("MainActivity", userDepB.toString())
                }

            }
        }
    }
}
