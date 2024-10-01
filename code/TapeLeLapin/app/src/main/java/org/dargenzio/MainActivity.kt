package org.dargenzio

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.dargenzio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    private lateinit var listeBoutons : List<Button>

    var scorePafs = 0
    var scoreFlops = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.tvPafs.setOnClickListener(View.OnClickListener {
            println("Coucou")
            binding.tvPafs.setText("Lapin")
        })
        listeBoutons = listOf(
            binding.btn1,
            binding.btn2,
            binding.btn3,
            binding.btn4,
            binding.btn5,
            binding.btn6,
            binding.btn7,
            binding.btn8,
            binding.btn9,
        )
        for (btn in listeBoutons){
            btn.setOnClickListener(View.OnClickListener {
                reagirAuClic(it)
            })
        }
        initialiser()
    }

    fun initialiser(){
        for (btn in listeBoutons){
            btn.setText("TAUPE")
        }
        val boutonLapin : Button = listeBoutons.random()
        boutonLapin.setText("LAPIN")
    }

    fun reagirAuClic(it: View){
        val boutonClique : Button = it as Button
        if(boutonClique.text == "LAPIN"){
            boutonClique.setText("TAUPE")
            initialiser()
            scorePafs++
        }else{
            scoreFlops++
        }
        binding.tvPafs.setText("$scorePafs pafs")
        binding.tvFlops.setText("$scoreFlops flops")
    }
}