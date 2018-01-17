package com.ursastudio.kotlinkedit.model

data class ImagesItem(
	val resolutions: List<ResolutionsItem?>? = null,
	val source: Source? = null,
	val variants: Variants? = null,
	val id: String? = null
)
