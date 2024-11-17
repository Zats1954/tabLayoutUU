package ru.zatsoft.tablayoutuu

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Site(val name: String, val uri: String): Parcelable{
    companion object{
        val sites = mutableListOf(
            Site("Новости","https://www.mediametrics.ru/rating/ru/online.html"),
            Site("Музыка", "https://www.zvuk.com/artist/1589360" ),
            Site("Кино", "https://w140.zona.plus/tvseries/kuhnya-2012" ),
        )
    }
}