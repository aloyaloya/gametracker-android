package com.example.gametracker_android.presentation.screens.discover_screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.gametracker_android.R
import com.example.gametracker_android.presentation.screens.discover_screen.components.SearchField

@Composable
fun DiscoverScreen(
    modifier: Modifier = Modifier
) {
    var query by remember { mutableStateOf("") }

    Box(modifier = modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .paint(
                    painter = painterResource(id = R.drawable.ic_background_dark),
                    contentScale = ContentScale.FillBounds,
                )
                .padding(horizontal = dimensionResource(id = R.dimen.medium_padding))
                .padding(top = dimensionResource(id = R.dimen.medium_padding))
                .statusBarsPadding()
                .navigationBarsPadding(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SearchField(
                modifier = Modifier,
                query = query,
                onQueryChange = { query = it },
                onSearch = {},
                onClear = { query = "" }
            )
            Spacer(modifier = Modifier
                .height(dimensionResource(id = R.dimen.medium_spacer_height))
            )
        }
    }
}