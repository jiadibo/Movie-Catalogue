package com.jiadibo.moviecatalogue.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Tvshow(
    var name: String?,
    var desc: String?,
    var photo: String?
) : Parcelable