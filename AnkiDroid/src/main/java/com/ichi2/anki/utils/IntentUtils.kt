package com.ichi2.anki.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle

fun <T : Activity> Context.startActivityWithClearTop(
    activity: Class<T>,
    flags: Int = 0,
    extras: Bundle? = null,
) {
    val intent =
        Intent(this, activity).apply {
            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or flags)
            extras?.let { putExtras(it) }
        }
    startActivity(intent)
}

fun <T : Activity> Context.startActivityWithNewTask(
    activity: Class<T>,
    flags: Int = 0,
    extras: Bundle? = null,
) {
    val intent =
        Intent(this, activity).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or flags)
            extras?.let { putExtras(it) }
        }
}
