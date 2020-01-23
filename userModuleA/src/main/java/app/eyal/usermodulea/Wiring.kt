package app.eyal.usermodulea

import app.eyal.usermodel.User
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides

@Component
interface UserComponentA {
    val userDepA: UserDepA

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance user: User): UserComponentA
    }
}

@Module
object UserComponentAModule {
    @Provides
    @JvmStatic
    fun provideComponentA(user: User): UserComponentA = DaggerUserComponentA.factory().create(user)
}

