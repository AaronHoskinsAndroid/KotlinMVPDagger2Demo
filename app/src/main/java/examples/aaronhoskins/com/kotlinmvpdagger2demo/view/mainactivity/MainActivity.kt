package examples.aaronhoskins.com.kotlinmvpdagger2demo.view.mainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import examples.aaronhoskins.com.kotlinmvpdagger2demo.R
import examples.aaronhoskins.com.kotlinmvpdagger2demo.model.translation.Translation
import examples.aaronhoskins.com.kotlinmvpdagger2demo.mvp.dagger2.components.DaggerMainActivityComponent
import examples.aaronhoskins.com.kotlinmvpdagger2demo.mvp.dagger2.modules.MainActivityPresenterModule
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject


class MainActivity : AppCompatActivity(), MainActivityContract.View {
    @Inject
    lateinit var presenterContract : MainActivityContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        DaggerMainActivityComponent
            .builder()
            .mainActivityPresenterModule(MainActivityPresenterModule(this))
            .build()
            .inject(this)

    }

    override fun onTranslationResult(translation: Translation) {
        tvTranslation.text = translation.contents.translated
    }

    fun onClick(view: View) {
        val text = etStringToTranslate.text.toString()
        val lang = etLanguageToTranslateTo.text.toString()
        presenterContract.onTranslationRequest(lang, text)
    }


}
