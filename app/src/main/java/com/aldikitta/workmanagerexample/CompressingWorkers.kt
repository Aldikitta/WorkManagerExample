package com.aldikitta.workmanagerexample

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class CompressingWorkers(context: Context, params: WorkerParameters) : Worker(context, params) {

    override fun doWork(): Result {
        try {
            for (i in 0..300) {
                Log.i("MYTAG", "Compressing $i")
            }

            return Result.success()
        } catch (e: Exception) {
            return Result.failure()
        }

    }
}