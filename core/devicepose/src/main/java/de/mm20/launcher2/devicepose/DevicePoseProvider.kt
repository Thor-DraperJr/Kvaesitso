package de.mm20.launcher2.devicepose

import android.content.Context
import android.hardware.SensorManager
import android.location.Location
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow

class DevicePoseProvider internal constructor(
    private val context: Context
) {
    var lastCachedLocation: Location? = null
        private set

    fun getLocation(minTimeMs: Long = 1000, minDistanceM: Float = 1f, skipCache: Boolean = false): Flow<Location> =
        emptyFlow()

    fun getAzimuthDegrees(samplingPeriodUs: Int = SensorManager.SENSOR_DELAY_UI): Flow<Float> =
        emptyFlow()

    fun getHeadingToDegrees(
        headingEastwardDegrees: Float,
        samplingPeriodUs: Int = SensorManager.SENSOR_DELAY_UI
    ): Flow<Float> = emptyFlow()
}
