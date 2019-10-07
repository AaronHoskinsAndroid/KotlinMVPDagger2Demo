package examples.aaronhoskins.com.kotlinmvpdagger2demo.model.translation


import android.annotation.SuppressLint
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@SuppressLint("ParcelCreator")
@Parcelize
data class Translation(
    @SerializedName("contents")
    val contents: Contents,
    @SerializedName("success")
    val success: Success
) : Parcelable