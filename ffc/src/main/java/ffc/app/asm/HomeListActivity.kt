package ffc.app.asm

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ffc.android.onClick
import ffc.app.R
import kotlinx.android.synthetic.main.activity_home_list.*

class HomeListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_list)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar.setTitle("Tab Layout")
        //setSupportActionBar(toolbar)

        val fragmentAdapter = MyPagerAdapter(supportFragmentManager);
        viewPager.adapter = fragmentAdapter

        tabLayout.setupWithViewPager(viewPager)
        homeAsUp.onClick {
            finish();
        }
    }
}
