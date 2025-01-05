package ru.normno.mycustomlazylayout

import androidx.compose.runtime.Composable

typealias ComposableItemContent = @Composable (ListItem) -> Unit

data class LazyLayoutItemContent(
    val item: ListItem,
    val itemContent: ComposableItemContent
)