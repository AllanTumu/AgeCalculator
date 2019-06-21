import java.util.*

fun main (args:Array<String>){
    //input
    println("please input your date of birth")
    var DOB:String?
    DOB = readLine()!!.toString()

    println("please input your Month of birth")
    var MOB:String?
    MOB = readLine()!!.toString()

    println("please input your Year of birth")
    var YOB:Int?
    YOB = readLine()!!.toInt()

    var year = Calendar.getInstance().get(Calendar.YEAR)
    //process
    var Age:Int?
    Age = year - YOB

    //Output
    println("You were born on $DOB $MOB $YOB and you are $Age years old now")
}