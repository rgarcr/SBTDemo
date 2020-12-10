package csv 
//to call this project from terminal using sbt use sbt run while in the directory 
object CSVReader extends App{
    println("State, Count")
    val file = io.Source.fromFile("people.csv")
    for(line <- file.getLines()){
        println(line)
    }
}