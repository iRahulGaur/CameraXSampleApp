package com.rahulgaur.camera

import android.Manifest
import android.content.Context
import android.os.Build
import pub.devrel.easypermissions.EasyPermissions

object Utility {
    fun hasCameraPermissions(context: Context) =
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.Q) {
            EasyPermissions.hasPermissions(
                context,
                Manifest.permission.CAMERA,
                Manifest.permission.RECORD_AUDIO
            )
        } else {
            EasyPermissions.hasPermissions(
                context,
                Manifest.permission.CAMERA
            )
        }
}