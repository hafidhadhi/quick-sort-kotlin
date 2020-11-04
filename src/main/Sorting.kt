fun main(args: Array<String>) {
    val input = intArrayOf(4, 9, 7, 5, 8, 9, 3, 10, 1)
    input.quickSort()
    println(input.toList().toString())
}

fun IntArray.partition(begin: Int, end: Int): Int {

    var counter = begin
    for (i in begin until end) {
        if (this[i] < this[end]) {
            val temp = this[counter]
            this[counter] = this[i]
            this[i] = temp
            counter++
        }
    }
    val temp = this[end]
    this[end] = this[counter]
    this[counter] = temp

    return counter
}

fun IntArray.quickSort(begin: Int = 0, end: Int = size - 1) {
    if (end <= begin) return
    val pivot = partition(begin, end)
    quickSort(begin, pivot - 1)
    quickSort(pivot + 1, end)
}