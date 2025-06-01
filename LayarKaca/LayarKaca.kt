package com.trihartanto1

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.MainAPI

class IndoXXI : MainAPI() {
    override var mainUrl = "https://lk21.film/"
    override var name = "LayarKaca"
    override val supportedTypes = setOf(TvType.Movie)
}
