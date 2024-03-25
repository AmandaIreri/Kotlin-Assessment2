fun main(){
    numbers(1,2,3,4)
    calculation(2.0)
    isPalindrome("Hello")
}
fun statement(){
    var sentence = "Barnie bakes brown bagels and buns"

}

fun numbers(num1:Int,num2:Int,num3:Int,num4:Int):Int{
    var values = arrayOf(num1,num2,num3,num4)
    var sum = num1+num2+num3+num4
    var count = values.count()
    var average= sum/count
     return sum
    return count
    return average
}

fun calculation(num:Double){
    var radius = num*num*num
    var volume = 4/3 * 3.14159 * radius
    println(volume)

}
fun isPalindrome(word:String):Boolean{
    var newWord = word.reversed()
    if (word==newWord)
        return true
    else
        return false

}
