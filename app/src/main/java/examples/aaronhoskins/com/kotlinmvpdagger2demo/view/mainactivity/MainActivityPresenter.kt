package examples.aaronhoskins.com.kotlinmvpdagger2demo.view.mainactivity

import android.util.Log
import examples.aaronhoskins.com.kotlinmvpdagger2demo.model.datasource.remote.retrofit.services.TranslationService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MainActivityPresenter @Inject constructor(val viewContract : MainActivityContract.View) : MainActivityContract.Presenter {


    override fun onTranslationRequest(language: String, text: String) {
        TranslationService
            .getTranslationService()
            .getTranslation(language, text)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                transition -> viewContract.onTranslationResult(transition)

            }

    }

//    override fun attachView(viewContract: MainActivityContract.View) {
//        Log.d("TAG", "attached View")
//        this.viewContract = viewContract
//        viewContract.attachPresenter(this)
//    }
//
//    override fun detachView() {
//
//    }
}