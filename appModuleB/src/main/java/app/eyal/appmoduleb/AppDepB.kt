package app.eyal.appmoduleb

import app.eyal.appmodulea.AppDepA
import app.eyal.usermodel.User
import javax.inject.Inject

class AppDepB @Inject constructor(appDepA: AppDepA) {
    val user = User("123")
}

