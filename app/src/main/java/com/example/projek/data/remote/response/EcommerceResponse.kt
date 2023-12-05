package com.example.projek.data.remote.response


import com.google.gson.annotations.SerializedName

data class EcommerceResponse(
    @SerializedName("limit")
    val limit: Int,
    @SerializedName("products")
    val products: List<Product>,
    @SerializedName("skip")
    val skip: Int,
    @SerializedName("total")
    val total: Int
)