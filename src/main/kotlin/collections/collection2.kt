// Создание пустой коллекции (collection), наполнение значениями c консоли, вывод содержимого в консоль.

//
fun main() {

    val collection: ArrayList<Char> = arrayListOf() // создание пустой коллекции
    var enter: String // для ввода из консоли

    while (true){ // зааполнение коллекции
        println("\nДобавьте символ в список или для завершения введите \"end\"")
        enter = readLine().toString()
        if (enter == "end") break // проверка завершения заполнения
        collection.add(enter[0])
    }

    println("\nКолличество элементов в списке ${collection.size} \n")

    for (el in collection){ // выввод элементов коллекции
        println(el)
    }

}
