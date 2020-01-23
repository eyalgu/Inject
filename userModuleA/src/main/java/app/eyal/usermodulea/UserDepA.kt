package app.eyal.usermodulea

import app.eyal.usermodel.User
import javax.inject.Inject

data class UserDepA  @Inject constructor(private val user: User)
