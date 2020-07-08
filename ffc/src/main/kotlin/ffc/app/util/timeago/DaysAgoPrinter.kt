/*
 * Copyright (c) 2015 NECTEC
 *   National Electronics and Computer Technology Center, Thailand
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ffc.app.util.timeago

import org.joda.time.DateTime

import java.util.Locale

internal class DaysAgoPrinter(private val currentTimer: CurrentTimer) : TimePrettyPrinter {

    override fun print(referenceTime: Long): String {
        val currentTimeInMills = DateTime(currentTimer.inMills)
        val agoDateTime = DateTime(referenceTime)

        val diffDay = currentTimeInMills.dayOfYear - agoDateTime.dayOfYear
        if (diffDay == 1) {
            val dateTime = DateTime(referenceTime)
            return String.format(Locale.US, "เมื่อวาน %02d:%02d", dateTime.getHourOfDay(), dateTime.getMinuteOfHour())
        } else {

            return "$diffDay วันที่แล้ว"
    }
    }
}
