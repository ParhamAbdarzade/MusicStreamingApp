package ir.urmis.musicstreaming.remote

import ir.urmis.musicstreaming.data.entities.Song

interface Repository {

    suspend fun getSongs(): List<Song>
}