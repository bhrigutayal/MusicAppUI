package com.example.musicappui.ui.theme

import androidx.annotation.DrawableRes
import com.example.musicappui.R

data class Lib(@DrawableRes val icon : Int, val name : String)

val libraries = listOf<Lib>(
    Lib(R.drawable.ic_music_player,"Playlist"),
    Lib(R.drawable.ic_music_player,"Artist"),
    Lib(R.drawable.ic_music_player,"Ablum"),
    Lib(R.drawable.ic_music_player,"Songs"),
    Lib(R.drawable.ic_music_player,"Genre")



)