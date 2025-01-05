package ru.normno.mycustomlazylayout

interface CustomLazyListScope {

    fun items(items: List<ListItem>, itemContent: ComposableItemContent)
}

class CustomLazyListScopeImpl : CustomLazyListScope {

    private val _items = mutableListOf<LazyLayoutItemContent>()
    val items: List<LazyLayoutItemContent> = _items

    override fun items(items: List<ListItem>, itemContent: ComposableItemContent) {
        items.forEach { _items.add(LazyLayoutItemContent(it, itemContent)) }
    }
}