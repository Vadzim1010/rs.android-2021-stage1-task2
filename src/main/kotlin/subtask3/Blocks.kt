package subtask3


import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        var data: KClass<*>
        var dataString: String = ""
        var dataDate: LocalDate = LocalDate.MIN
        var dataInt = 0
        val format = DateTimeFormatter.ofPattern("dd.MM.yyyy")
        for (value in blockA) {
            when (blockB) {
                String::class -> {
                    if (value is String) {
                        dataString += value
                    }
                }
                Int::class -> {
                    if (value is Int) {
                        dataInt += value
                    }
                }
                LocalDate::class -> {
                    if (value is LocalDate) {
                        if (dataDate < value) {
                            dataDate = value
                        }
                    }
                }
            }
        }

        when (blockB) {
            String::class -> {
                return dataString
            }
            Int::class -> {
                return dataInt
            }
            LocalDate::class -> {
                return format.format(dataDate)
            }
        }

        return Any()
    }
}


