package com.moa.moa

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MOAApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // 앱 초기화 코드 (필요한 경우)
    }
}