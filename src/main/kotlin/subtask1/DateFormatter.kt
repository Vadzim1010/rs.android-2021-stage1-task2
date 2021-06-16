package subtask1


import java.lang.Exception
import java.time.DayOfWeek
import java.time.LocalDate


class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        var date: String = ""
        val dayOfWeekString: String?
        val dayInt = day.toInt()
        val monthInt = month.toInt()
        val yearInt = year.toInt()
        var dateFormatter = LocalDate.now()

        try {
            dateFormatter = LocalDate.of(yearInt, monthInt, dayInt)
        } catch (e: Exception) {
            date = "Такого дня не существует"
        }

        val monthString: String? = when (dateFormatter.monthValue) {
            1 -> "января"
            2 -> "февраля"
            3 -> "марта"
            4 -> "апреля"
            5 -> "мая"
            6 -> "июня"
            7 -> "июля"
            8 -> "августа"
            9 -> "сентября"
            10 -> "октября"
            11 -> "ноября"
            12 -> "декабря"
            else -> null
        }

        dayOfWeekString = when (dateFormatter.dayOfWeek) {
            DayOfWeek.MONDAY -> "понедельник"
            DayOfWeek.TUESDAY -> "вторник"
            DayOfWeek.WEDNESDAY -> "среда"
            DayOfWeek.THURSDAY -> "четверг"
            DayOfWeek.FRIDAY -> "пятница"
            DayOfWeek.SATURDAY -> "суббота"
            DayOfWeek.SUNDAY -> "воскресенье"
        }

        if (date != "Такого дня не существует") {
            date = dateFormatter.dayOfMonth.toString() + " " + monthString + ", " + dayOfWeekString
        }

        return date
    }
}
