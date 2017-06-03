package omg.medvedomg.secondappkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import omg.medvedomg.firstkotlinapp.model.Cat
import omg.medvedomg.firstkotlinapp.ui.adapter.CatsAdapter
import omg.medvedomg.secondappkotlin.R.id.rvCats

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val catBritish = Cat("British Shorthair",
                "http://cdn2-www.cattime.com/assets/uploads/gallery/british-shorthair-cats-and-kittens/british-shorthair-cats-and-kittens-1.jpg",
                "sleepy",
                100)

        val catSeams = Cat("Siamese cat",
                "http://cdn2-www.cattime.com/assets/uploads/gallery/siamese-cats-and-kittens-pictures/siamese-cat-kitten-picture-5.jpg",
                "playfull",
                20)

        var catsList = listOf<Cat>(catBritish,catSeams)

        rvCats.layoutManager = LinearLayoutManager(this)

        rvCats.adapter = CatsAdapter(this,catsList)

    }
}
