package app.eyal.appmoduleb

import app.eyal.appmodulea.AppDepA
import app.eyal.usermodel.User
import javax.inject.Inject

data class AppDepB @Inject constructor(private val appDepA: AppDepA) {
    val user = User("123")
}

