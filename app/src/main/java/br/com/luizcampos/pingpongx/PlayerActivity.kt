package br.com.luizcampos.pingpongx

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_player.*

class PlayerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)

        btStart.setOnClickListener {
            val proximaTela = Intent(this, MainActivity::class.java)
            proximaTela.putExtra("PLAYER1", etPlayer1.text.toString())
            proximaTela.putExtra("PLAYER2", etPlayer2.text.toString())
            startActivity(proximaTela)
            finish()
        }
    }


}