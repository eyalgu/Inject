package app.eyal.appmodulea

import app.eyal.appentity.App
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides

@Component
interface AppComponentA {
    val appDepA: AppDepA

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: App): AppComponentA
    }

}

@Module
object AppComponentAModule {
    @Provides
    @JvmStatic
    fun provideComponentA(app: App): AppComponentA = DaggerAppComponentA.factory().create(app)
}

