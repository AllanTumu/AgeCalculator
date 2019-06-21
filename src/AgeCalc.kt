import java.time.Month
import java.util.*

fun main (args:Array<String>){
    //Input
    println("Enter your date of birth")
    var DOB:String?
    DOB = readLine()!!.toString()

    println("Enter your month of birth")
    var MOB = readLine()!!.toInt()

    println("Enter your year of birth")
    var YOB:Int?
     YOB = readLine()!!.toInt()

    var year = Calendar.getInstance().get(Calendar.YEAR)
    //Process
    var Age = year - YOB

    //Output
    println("Your Age is $Age")
}