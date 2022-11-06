package COMP3025.f22_WK8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TV show variable hardcoded
        val tvShows = arrayOf<TVShows>(
            TVShows("FRIENDS", "Netflix"),
            TVShows("Lord of the Rings", "HBO"),
            TVShows("Forrest Gump", "Netflix"),
            TVShows("Star Wars", "AppleTv"),
            TVShows("BreakingBad", "HBO"),
            TVShows("Interstellar", "HBO")
        )

        //val for data class FirstAdaptor
        val firstAdapter: FirstAdapter = FirstAdapter(tvShows)
        val recyclerView: RecyclerView = findViewById(R.id.First_Recycler_View)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = firstAdapter
    }
}