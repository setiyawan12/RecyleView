package com.setiyawan.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList = ArrayList<Model>()
        arrayList.add(Model("Yayang Setiyawan","Politeknik Harapan Bersama Tegal", R.drawable.user2))
        arrayList.add(Model("Nurul Chotimah","Politeknik Harapan Bersama Tegal", R.drawable.user1))
        arrayList.add(Model("Zaerina Nur Eriyadi","Politeknik Harapan Bersama Tegal", R.drawable.user3))
        arrayList.add(Model("Ade Kurniawan","Politeknik Harapan Bersama Tegal", R.drawable.user4))
        arrayList.add(Model("Faqih Zada","Politeknik Harapan Bersama Tegal", R.drawable.user5))
        arrayList.add(Model("No Name","Politeknik Harapan Bersama Tegal", R.drawable.user6))
        arrayList.add(Model("No Name","Politeknik Harapan Bersama Tegal", R.drawable.user6))
        arrayList.add(Model("No Name","Politeknik Harapan Bersama Tegal", R.drawable.user6))
        arrayList.add(Model("No Name","Politeknik Harapan Bersama Tegal", R.drawable.user6))
        arrayList.add(Model("No Name","Politeknik Harapan Bersama Tegal", R.drawable.user6))

        val myAdapter = MyAdapter(arrayList, this)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter
    }
}