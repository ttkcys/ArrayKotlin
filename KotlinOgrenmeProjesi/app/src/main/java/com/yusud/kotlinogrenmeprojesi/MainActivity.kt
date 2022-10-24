package com.yusud.kotlinogrenmeprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Diziler (Array)
        println("---------------Array---------------")

        val stringOrnegi = "Yusufhan"
        val benimDizim = arrayOf(stringOrnegi,"Gözde","Keleş","Demir")

        println(benimDizim[0])
        println(benimDizim.get(1))
        benimDizim[2] = "Mahmut"
        println(benimDizim.get(2))
        benimDizim.set(3,"Çelik")
        println(benimDizim.get(3))

        val numaraDizisi = doubleArrayOf(1.2,2.0,3.5,4.6)
        println(numaraDizisi[2])

        val karisikDizi = arrayOf("Yusufhan",3,4.9,true,false)
        println(karisikDizi.get(3))

    }
}