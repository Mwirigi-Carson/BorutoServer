package com.mwirigiCarson.models

import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse(
    val success : Boolean,
    val message : String? = null,
    val previousPage : Int? = null, // for paging
    val nextPage : Int? = null, // for paging
    val heroes : List<Hero> = emptyList()
)
