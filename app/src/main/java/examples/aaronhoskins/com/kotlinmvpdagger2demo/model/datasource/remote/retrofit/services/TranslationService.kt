package examples.aaronhoskins.com.kotlinmvpdagger2demo.model.datasource.remote.retrofit.services

import examples.aaronhoskins.com.kotlinmvpdagger2demo.model.datasource.remote.retrofit.RetrofitHelper
import examples.aaronhoskins.com.kotlinmvpdagger2demo.model.translation.Translation
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TranslationService {
    companion object{
        fun getTranslationService()
                = RetrofitHelper().getRetrofitInstance().create(TranslationService::class.java)
    }
    @GET("translate/{language}")
    fun getTranslation(
        @Path("language") language : String,
        @Query("text") text : String) : Observable<Translation>
}