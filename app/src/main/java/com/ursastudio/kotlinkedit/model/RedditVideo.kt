package com.ursastudio.kotlinkedit.model

data class RedditVideo(
	val duration: Int? = null,
	val isGif: Boolean? = null,
	val dashUrl: String? = null,
	val fallbackUrl: String? = null,
	val width: Int? = null,
	val scrubberMediaUrl: String? = null,
	val hlsUrl: String? = null,
	val transcodingStatus: String? = null,
	val height: Int? = null
)
