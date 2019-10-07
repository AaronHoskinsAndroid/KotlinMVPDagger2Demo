package examples.aaronhoskins.com.kotlinmvpdagger2demo.mvp.dagger2.modules

import dagger.Module
import dagger.Provides
import examples.aaronhoskins.com.kotlinmvpdagger2demo.view.mainactivity.MainActivityContract
import examples.aaronhoskins.com.kotlinmvpdagger2demo.view.mainactivity.MainActivityPresenter

@Module
class MainActivityPresenterModule(val view : MainActivityContract.View) {

    @Provides
    fun providesMainActivityView() : MainActivityContract.View{
        return view
    }

    @Provides
    fun providesMainActivityPresenter() : MainActivityContract.Presenter{
        return MainActivityPresenter(view)
    }
}