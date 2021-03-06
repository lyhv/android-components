package com.lyhv.component.common.helper

import android.util.Log
import com.lyhv.component.BuildConfig

/**
 * Created by lyhv on August 29, 2019
 * Copyright @ est-rouge. All rights reserved
 */
object LogHelper {
    const val TAG_COROUTINES = "Couroutines"
    fun init() {
        System.setProperty("kotlinx.coroutines.debug", if (BuildConfig.DEBUG) "on" else "off")
    }

    fun logCouroutines(message: String) {
        Log.d(TAG_COROUTINES, message)
    }
}
