package COMP3025.f22_WK8

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//class for data class of main activity
class FirstAdapter(private val dataSet: Array<TVShows>):
    RecyclerView.Adapter<FirstAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
    {
        val title: TextView
        val subTitle: TextView

        init {
            // Define click listener for the ViewHolder's View.
            title = view.findViewById(R.id.title)
            subTitle = view.findViewById(R.id.subTitle)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.text_row_item, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.title.text = dataSet[position].title // index of the array
        viewHolder.subTitle.text = dataSet[position].subTitle
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}