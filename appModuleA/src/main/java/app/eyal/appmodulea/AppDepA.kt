package app.eyal.appmodulea

import app.eyal.appentity.App
import javax.inject.Inject

data class AppDepA @Inject constructor(private val app: App) {
}


