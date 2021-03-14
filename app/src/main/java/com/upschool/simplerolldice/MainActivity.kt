package com.upschool.simplerolldice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val zarAtButton:Button=findViewById(R.id.zarAtButton)
        val temizleButton:Button=findViewById(R.id.temizleButton)
        val zarImageView:ImageView=findViewById(R.id.zarImageView)
        val zarImageView2:ImageView=findViewById(R.id.zarImageView2)

        val randomSayi=(1..6).random()
        val randomSayi2=(1..6).random()

        zarAtButton.setOnClickListener {
            Toast.makeText(this, "ZAR ATILDI!", Toast.LENGTH_SHORT).show()
            val randomSayi=(1..6).random()
            val randomSayi2=(1..6).random()
            when (randomSayi) {
                1 -> zarImageView.setImageResource(R.drawable.dice_1)
                2 -> zarImageView.setImageResource(R.drawable.dice_2)
                3 -> zarImageView.setImageResource(R.drawable.dice_3)
                4 -> zarImageView.setImageResource(R.drawable.dice_4)
                5 -> zarImageView.setImageResource(R.drawable.dice_5)
                else -> zarImageView.setImageResource(R.drawable.dice_6)
            }
            when (randomSayi2) {
                1 -> zarImageView2.setImageResource(R.drawable.dice_1)
                2 -> zarImageView2.setImageResource(R.drawable.dice_2)
                3 -> zarImageView2.setImageResource(R.drawable.dice_3)
                4 -> zarImageView2.setImageResource(R.drawable.dice_4)
                5 -> zarImageView2.setImageResource(R.drawable.dice_5)
                else -> zarImageView2.setImageResource(R.drawable.dice_6)

            }
        }

        temizleButton.setOnClickListener {
            Toast.makeText(this, "OYUN BİTTİ!", Toast.LENGTH_SHORT).show()

            zarImageView.setImageResource(R.drawable.purplesquare)
            zarImageView2.setImageResource(R.drawable.purplesquare)
        }
    }

}