package examples.aaronhoskins.com.kotlinmvpdagger2demo.model.translation


import android.annotation.SuppressLint
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@SuppressLint("ParcelCreator")
@Parcelize
data class Success(
    @SerializedName("total")
    val total: Int
) : Parcelable