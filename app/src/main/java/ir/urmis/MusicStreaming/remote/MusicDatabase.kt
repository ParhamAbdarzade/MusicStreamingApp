package ir.urmis.MusicStreaming.remote

import com.google.firebase.firestore.FirebaseFirestore
import ir.urmis.MusicStreaming.data.entities.Song
import ir.urmis.MusicStreaming.utils.Constants.SONGS_COLLECTION
import kotlinx.coroutines.tasks.await

class MusicDatabase : Repository {

    private val fireStore = FirebaseFirestore.getInstance()
    private val songCollection = fireStore.collection(SONGS_COLLECTION)


    override suspend fun getSongs(): List<Song> {
        return try {
            songCollection.get().await().toObjects(Song::class.java)
        } catch (e: Throwable) {
            listOf()
        }
    }
}