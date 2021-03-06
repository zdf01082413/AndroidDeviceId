package com.zdf.deviceid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import com.zdf.androiddeviceid.CustomDeviceId
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // path ，也可不需要，有默认值。
        val Path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_ALARMS).toString() + File.separator + "AndroidDeviceId"
        CustomDeviceId.init(this).setFilePath(Path).getCustomDeviceId
    }
}
