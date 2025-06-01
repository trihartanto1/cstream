// use an integer for version numbers
version = 20


cloudstream {
    language.set("id")
    description.set("Plugin LayarKaca")
    authors.set(listOf("trihartanto1"))

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1 // will be 3 if unspecified
    tvTypes = listOf(
        "AsianDrama",
        "TvSeries",
        "Movie",
    )


    iconUrl = "https://www.google.com/s2/favicons?domain=amp.lk21official.mom&sz=%size%"

}
