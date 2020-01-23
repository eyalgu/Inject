package app.eyal.usermoduleb

import app.eyal.appmodulea.AppDepA
import app.eyal.usermodulea.UserDepA
import javax.inject.Inject

data class UserDepB  @Inject constructor(private val userDepA: UserDepA, private val appDepA: AppDepA)

