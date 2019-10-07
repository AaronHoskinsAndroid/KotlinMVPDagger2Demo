package examples.aaronhoskins.com.kotlinmvpdagger2demo.mvp.dagger2.components

import dagger.Component
import examples.aaronhoskins.com.kotlinmvpdagger2demo.mvp.dagger2.modules.MainActivityPresenterModule
import examples.aaronhoskins.com.kotlinmvpdagger2demo.view.mainactivity.MainActivity

@Component(modules = arrayOf(MainActivityPresenterModule::class))
interface MainActivityComponent  {
    fun inject(mainActivity : MainActivity)
}