package com.amonteiro.a06_ynov_kmp.presentation.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.amonteiro.a06_ynov_kmp.domain.model.Weather
import com.amonteiro.a06_ynov_kmp.presentation.ui.screens.PictureRowItem

@Composable
actual fun WeatherGallery(modifier: Modifier, list: List<Weather>) {

    LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp), modifier = modifier) {
        items(list.size) {
            PictureRowItem(data = list[it])
        }
    }

}