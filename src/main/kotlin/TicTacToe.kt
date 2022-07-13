package tictactoe

fun main() {
   inputCells()
}

fun inputCells() {
    println("Input cells: ")
    val inputCells = readLine().toString()
    println("-".repeat(9))
    //print("| ")
    println("| ${inputCells[0]} ${inputCells[1]} ${inputCells[2]} |")
    println("| ${inputCells[3]} ${inputCells[4]} ${inputCells[5]} |")
    println("| ${inputCells[6]} ${inputCells[7]} ${inputCells[8]} |")
    //println(" |")
    println("-".repeat(9))
}