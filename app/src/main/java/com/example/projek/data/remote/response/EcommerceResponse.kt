package com.example.projek.data.remote.response


import com.google.gson.annotations.SerializedName

data class EcommerceResponse(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("request_id")
    val requestId: String,
    @SerializedName("status")
    val status: String
)