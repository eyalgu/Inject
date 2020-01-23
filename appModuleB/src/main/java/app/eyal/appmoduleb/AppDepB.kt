package app.eyal.appmoduleb

import app.eyal.appmodulea.AppDepA
import app.eyal.usermodel.User
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

data class AppDepB @Inject constructor(private val appDepA: AppDepA) {
    val user = flowOf(User("123"))
}

