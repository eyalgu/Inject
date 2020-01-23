package app.eyal.appmoduleb

import app.eyal.appmodulea.AppComponentA
import dagger.Component
import dagger.Module
import dagger.Provides

@Component(dependencies = [AppComponentA::class])
interface AppComponentB {
    val appDepB: AppDepB

    @Component.Factory
    interface Factory {
        fun create(appComponentA: AppComponentA): AppComponentB
    }
}

@Module
object AppComponentBModule {
    @Provides
    @JvmStatic
    fun provideComponentB(appComponentA: AppComponentA): AppComponentB = DaggerAppComponentB.factory().create(appComponentA)
}
