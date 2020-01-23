package app.eyal.inject

import app.eyal.appentity.App
import app.eyal.appmodulea.AppComponentA
import app.eyal.appmodulea.AppComponentAModule
import app.eyal.appmoduleb.AppComponentB
import app.eyal.appmoduleb.AppComponentBModule
import app.eyal.usermodel.User
import app.eyal.usermodulea.UserComponentA
import app.eyal.usermodulea.UserComponentAModule
import app.eyal.usermoduleb.UserComponentB
import app.eyal.usermoduleb.UserComponentBModule
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Subcomponent

// @Scope
// @MustBeDocumented
// @Retention(AnnotationRetention.RUNTIME)
// annotation class AppScope


@Module( subcomponents = [UserGraph::class])
object AppSubcomponents

@Component(modules = [AppComponentAModule::class, AppComponentBModule::class, AppSubcomponents::class])
interface AppGraph {
    val appComponentA: AppComponentA
    val appComponentB: AppComponentB

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance app: App
        ): AppGraph
    }

    val userGraphFactory: UserGraph.Factory
}

// @Scope
// @MustBeDocumented
// @Retention(AnnotationRetention.RUNTIME)
// annotation class UserScope

@Subcomponent(modules = [UserComponentAModule::class, UserComponentBModule::class])
interface UserGraph {
    val userComponentA: UserComponentA
    val userComponentB: UserComponentB

    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance user: User
        ): UserGraph
    }
}

