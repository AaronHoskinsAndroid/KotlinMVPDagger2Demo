package examples.aaronhoskins.com.kotlinmvpdagger2demo.model.translation


import android.annotation.SuppressLint
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@SuppressLint("ParcelCreator")
@Parcelize
data class Contents(
    @SerializedName("text")
    val text: String,
    @SerializedName("translated")
    val translated: String,
    @SerializedName("translation")
    val translation: String
) : Parcelable