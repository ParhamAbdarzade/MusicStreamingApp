package ir.urmis.MusicStreaming.remote

import ir.urmis.MusicStreaming.data.entities.Song

interface Repository {

    suspend fun getSongs(): List<Song>
}