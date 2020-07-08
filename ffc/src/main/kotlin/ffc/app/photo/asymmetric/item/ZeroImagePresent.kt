package ffc.app.photo.asymmetric.item

import ffc.app.photo.asymmetric.ImageItem

class ZeroImagePresent : ImagePresent {
    override val maxDisplayItem: Int
        get() = 1
    override val item: List<ImageItem>
        get() = listOf()
    override val requestColumns: Int
        get() = 1
}
