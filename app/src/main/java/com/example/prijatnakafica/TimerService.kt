package com.example.prijatnakafica

import android.app.Service
import android.content.Intent
import android.icu.text.TimeZoneFormat
import android.os.IBinder
import java.util.*

class TimerService : Service() {

    override fun onBind(intent: Intent?): IBinder? = null


    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val time = intent?.getDoubleExtra(TIME_EXTRA,0.0)
        timer.scheduleAtFixedRate(time?.let { TimeTask(it) },0,1000)
        return START_NOT_STICKY
    }

    override fun onDestroy() {
        timer.cancel()
        super.onDestroy()
    }

    private inner class TimeTask(private var time: Double) : TimerTask(){
        override fun run(){
            val intent = Intent(TIMER_UPDATED)
            time++
            intent.putExtra(TIME_EXTRA,time)
            sendBroadcast(intent)
        }
    }

    private val timer = Timer()

    companion object{
        const val TIMER_UPDATED = "timerUpdated"
        const val TIME_EXTRA = "timeExtra"
    }

}