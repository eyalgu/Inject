package app.eyal.usermoduleb

import app.eyal.usermodulea.UserDepA
import javax.inject.Inject

class UserDepB  @Inject constructor(userDepA: UserDepA)

