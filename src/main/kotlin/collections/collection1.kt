// Создание пустой коллекции (collection), наполнение до заданного размера (collectSise - ввод c консоли), вывод содержимого в консоль.

//

fun main() {
    val collection: ArrayList<String> = arrayListOf() // создание пустой коллекции

    println("\nВведите количество элементов списка\n")

    var enter = readLine() // для ввода из консоли
    if (enter == "" || enter == "0") { // проверка на пустой ввод или 0
        println("\nСписок не содержит элементов\n")
    } else {
        var collectSise = enter!!.toInt() // размер коллекции
        for (k in 1..collectSise) { // зааполнение коллекции
            collection.add("thing ${k}")
        }

        println("\nКолличество элементов в списке ${collectSise} \n")

        for (el in collection) { // выввод элементов коллекции
            println(el)
        }
    }
}
