package com.example.gametracker_android.presentation.screens.discover_screen.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.example.gametracker_android.R

@Composable
fun SearchField(
    modifier: Modifier = Modifier,
    query: String,
    onQueryChange: (String) -> Unit,
    onSearch: () -> Unit,
    onClear: () -> Unit
) {
    val focusManager = LocalFocusManager.current

    TextField(
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp)
            .padding(horizontal = 4.dp)
            .border(
                BorderStroke(
                    width = 4.dp,
                    color = MaterialTheme.colorScheme.onSurface
                ),
                shape = MaterialTheme.shapes.extraLarge
            ),
        value = query,
        onValueChange = onQueryChange,
        textStyle = MaterialTheme.typography.bodyLarge,
        placeholder = {
            Text(
                text = stringResource(id = R.string.search_field_placeholder),
                style = MaterialTheme.typography.bodyLarge
            )
        },
        leadingIcon = {
            IconButton(onClick = {
                focusManager.clearFocus()
                onSearch()
            }) {
                Icon(
                    modifier = Modifier
                        .size(dimensionResource(id = R.dimen.icon_size_small)),
                    painter = painterResource(id = R.drawable.ic_search_icon),
                    contentDescription = stringResource(
                        id = R.string.content_description_search_button
                    )
                )
            }
        },
        trailingIcon = {
            if (query.isNotEmpty()) {
                IconButton(onClick = { onClear() }) {
                    Icon(
                        modifier = Modifier.size(
                            dimensionResource(id = R.dimen.icon_size_small)
                        ),
                        painter = painterResource(id = R.drawable.ic_clear_icon),
                        contentDescription = stringResource(
                            id = R.string.content_description_clear_button
                        )
                    )
                }
            }
        },
        singleLine = true,
        shape = MaterialTheme.shapes.extraLarge,
        colors = TextFieldDefaults.colors(
            disabledContainerColor = MaterialTheme.colorScheme.surface,
            focusedContainerColor = MaterialTheme.colorScheme.surface,
            unfocusedContainerColor = MaterialTheme.colorScheme.surface,
            errorContainerColor = MaterialTheme.colorScheme.surface,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            errorIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            cursorColor = Color.Transparent,
            focusedLeadingIconColor = MaterialTheme.colorScheme.onPrimaryContainer,
            unfocusedLeadingIconColor = MaterialTheme.colorScheme.onPrimaryContainer,
            unfocusedPlaceholderColor = MaterialTheme.colorScheme.surfaceContainer,
            focusedPlaceholderColor = MaterialTheme.colorScheme.surfaceContainer,
            focusedTrailingIconColor = MaterialTheme.colorScheme.onPrimaryContainer,
            unfocusedTrailingIconColor = MaterialTheme.colorScheme.onPrimaryContainer,
            focusedTextColor = MaterialTheme.colorScheme.onPrimaryContainer,
            unfocusedTextColor = MaterialTheme.colorScheme.onPrimaryContainer
        ),
        keyboardActions = KeyboardActions(
            onSearch = {
                focusManager.clearFocus()
                onSearch()
            },
            onDone = {
                focusManager.clearFocus()
            }
        ),
        keyboardOptions = KeyboardOptions.Default.copy(
            imeAction = ImeAction.Search
        )
    )
}