package com.example.image_to_pdf.ui


import android.graphics.Bitmap

data class MainScreenState(
    val imageBitmaps : List<Bitmap> = emptyList(),
    val isLoading : Boolean = false,
    val success : Boolean? = null
)