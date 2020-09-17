package br.com.luizcampos.pingpongx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var playerOneScore = 0
    var playerTwoScore = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpPlayers()

        if(savedInstanceState != null) {
            playerOneScore = savedInstanceState.getInt("PLAYER_ONE_SCORE")
            playerTwoScore =savedInstanceState.getInt("PLAYER_TWO_SCORE")
            setUpScorePlayerOne()
            setUpScorePlayerTwo()

        }

        btPlayerOneScore.setOnClickListener {
            playerOneScore++
            setUpScorePlayerOne()
        }
        btPlayerTwoScore.setOnClickListener {
            playerTwoScore++
            setUpScorePlayerTwo()
        }

        btFinishMatch.setOnClickListener {
            finish()
        }
        btRevenge.setOnClickListener {
            revenge()
        }


    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("PLAYER_ONE_SCORE", playerOneScore)
        outState.putInt("PLAYER_TWO_SCORE", playerTwoScore)
    }

    private fun setUpScorePlayerOne() {
            tvPlayerOneScore.text = playerOneScore.toString()
     }

    private fun setUpScorePlayerTwo() {
            tvPlayerTwoScore.text = playerTwoScore.toString()
     }

    private fun revenge() {
            playerOneScore = 0
            playerTwoScore = 0
            setUpScorePlayerOne()
            setUpScorePlayerTwo()
     }

    private fun setUpPlayers() {
        tvPlayerOneName.text = intent.getStringExtra("PLAYER1")
        tvPlayerTwoName.text = intent.getStringExtra("PLAYER2")
    }
}



