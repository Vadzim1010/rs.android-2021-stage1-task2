package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        val arrayList: ArrayList<Int> = arrayListOf()
        for (bChar in b) {
            arrayList.add(a.indexOf(bChar, 0, true))
        }
        var respond = "YES"
        for (i in 0 until arrayList.size) {
            if (i < arrayList.size - 1) {
                if (arrayList[i] > arrayList[i + 1]) {
                    respond = "NO"
                }
            }
        }
        print(respond)
        return respond
    }
}
