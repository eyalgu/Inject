package app.eyal.usermoduleb

import app.eyal.appmodulea.AppComponentA
import app.eyal.usermodulea.UserComponentA
import dagger.Component
import dagger.Module
import dagger.Provides

@Component(dependencies = [UserComponentA::class, AppComponentA::class])
interface UserComponentB {
    val userDepB: UserDepB

    @Component.Factory
    interface Factory {
        fun create(userComponentA: UserComponentA, appComponentA: AppComponentA): UserComponentB
    }
}

@Module
object UserComponentBModule {
    @Provides
    @JvmStatic
    fun provideComponentB(userComponentA: UserComponentA, appComponentA: AppComponentA): UserComponentB =
        DaggerUserComponentB.factory().create(userComponentA, appComponentA)
}

