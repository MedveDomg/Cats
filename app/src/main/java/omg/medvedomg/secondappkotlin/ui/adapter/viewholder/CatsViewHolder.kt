package omg.medvedomg.firstkotlinapp.ui.adapter.viewholder

import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.View
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.row_cat.view.*
import omg.medvedomg.firstkotlinapp.model.Cat
import omg.medvedomg.secondappkotlin.R

/**
 * Created by medvedomg on 03.06.17.
 */
class CatsViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    fun bindCat(cat: Cat, activity: AppCompatActivity) {

        Picasso.with(activity)
                .load(cat.photoUrl)
                .error(R.mipmap.ic_launcher)
                .into(view.ivCat)

        view.tvBreed.setText(cat.breed)
        view.tvDescription.setText(cat.description)
        view.tvAverageAge.setText(Integer.toString(cat.averageAge))

    }
}