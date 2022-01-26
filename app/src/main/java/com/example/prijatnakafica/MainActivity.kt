package com.example.prijatnakafica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    val EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT";

    private val aeroSteps = arrayOf("Pour 30g of water and evenly saturate the coffee", "Stir the grounds to ensure all coffee is fully immersed","Wait for the coffee to bloom","Pour 210g of water in a spiral motion over the dark areas","Place the plunger on the brewer and pull up slightly to create a pressure seal","Wait for the coffee to brew", "Gently press down on the plunger with steady pressure", "When done simply take off the bottom cap, pop the grounds and the filter")
    private val v60Steps = arrayOf("Pour 50g of water until all the grounds are evenly saturated","Wait for the coffee to bloom","Pour another 50g of water in spiral rotation","Wait for the water to drain through the grounds", "Pour the remaining 120g of water around the edges of the dripper", "Let the water drain through and when it's done discard the filter and serve")
    private val frenchSteps = arrayOf("Pour 60g of water and evenly saturate the coffee", "Gently stir the grounds to ensure all coffee is immersed","Wait for the coffee to bloom","Pour the remaining 290.00g of water in a spiral motion","Allow the coffee to steep for 3 minutes","Gently press the filter down and serve in a warm cup")
    private val moccaSteps = arrayOf("Fill the lower chamber with boiling water just below the valve", "Insert the funnel and fill it with ground coffee", "Tightly screw the upper part of the pot on to the base", "Put the brewer on a stove and turn on medium heat", "Wait aprox. 5 to 6 minutes for the water to boil", "Once the top of the pot is full, remove from the stove and pour into a cup")
    private val chemexSteps = arrayOf("Pour 50g of water until all the grounds are saturated","Sitr the grounds to ensure all coffee is fully immersed","Wait for the coffee to bloom","Pour 130g of water in a spiral motion over the dark areas", "Wait for the water to drain through the grounds","Slowly top up the brewer with another 160g of water", "Wait for the water to drain through the grounds", "Remove the filter and serve. Enjoy!")
    private val espressoSteps = arrayOf("Dose your ground coffee into your portafilter","Tap the portafilter handle gently on the tamp mat to distribute the ground coffee evenly, or – if you have one – use a distribution tool.", "Take your tamper and press it down onto the ground coffee", "Insert the portafilter handle into the group head and start brewing your espresso","Turn off the machine after 25 seconds", "Clean and serve")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.info).setOnClickListener {
            val intent = Intent(this, InfoActivity::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.chemex).setOnClickListener {
            val intent = Intent(this, chemex::class.java)
            intent.putExtra(EXTRA_TEXT,chemexSteps)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.v60).setOnClickListener {
            val intent = Intent(this, v60::class.java)
            intent.putExtra(EXTRA_TEXT,v60Steps)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.aero).setOnClickListener {
            val intent = Intent(this, aero::class.java)
            intent.putExtra(EXTRA_TEXT,aeroSteps)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.espresso).setOnClickListener {
            val intent = Intent(this, espresso::class.java)
            intent.putExtra(EXTRA_TEXT,espressoSteps)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.french).setOnClickListener {
            val intent = Intent(this, french::class.java)
            intent.putExtra(EXTRA_TEXT,frenchSteps)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.mocca).setOnClickListener {
            val intent = Intent(this, mocca::class.java)
            intent.putExtra(EXTRA_TEXT,moccaSteps)
            startActivity(intent)
        }
    }
}