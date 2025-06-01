package com.trihartanto1

import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.TvType

class LayarKaca : MainAPI() {
    override var mainUrl = "https://lk21.film/"
    override var name = "LayarKaca"
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries)

    // Tambahkan logika scrapper sesuai kebutuhan di sini
}
