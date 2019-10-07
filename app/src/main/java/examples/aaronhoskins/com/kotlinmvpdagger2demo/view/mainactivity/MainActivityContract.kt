package examples.aaronhoskins.com.kotlinmvpdagger2demo.view.mainactivity

import examples.aaronhoskins.com.kotlinmvpdagger2demo.model.translation.Translation

interface MainActivityContract {
    interface View{
        fun onTranslationResult(translation : Translation)
    }
    interface Presenter{
        fun onTranslationRequest(language : String, text : String)
    }
}