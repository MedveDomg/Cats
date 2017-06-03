package omg.medvedomg.firstkotlinapp.ui.adapter

import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import omg.medvedomg.firstkotlinapp.model.Cat
import omg.medvedomg.firstkotlinapp.ui.adapter.viewholder.CatsViewHolder
import omg.medvedomg.secondappkotlin.R
import java.util.logging.Logger

/**
 * Created by medvedomg on 03.06.17.
 */
class CatsAdapter(val activity: AppCompatActivity, var catsList: List<Cat>) : RecyclerView.Adapter<CatsViewHolder>() {

    override fun onBindViewHolder(holder: CatsViewHolder?, position: Int) {
        holder?.bindCat(catsList.get(position),activity)
    }

    override fun getItemCount(): Int {
        return catsList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, p1: Int): CatsViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.row_cat, parent,false);
        return CatsViewHolder(view)
    }

}