fun main (){
    word()
    var x=modulus()
    println(x)
    var outcome=knowme("Pascaline",20)
    println(outcome)
    var answer=take("akirachix")
    println(answer)

}
fun word(){
    var given="codeHive"
    println()
}
fun modulus():Int{
    var num1=23
    var num2=12
    var mod=23%12
    return mod

}
fun knowme(name:String,age:Int):String{
    var sentence="Hi,my name is $name and I'm $age years old."
    return sentence

}
fun take(name: String):Int{
    return name.length
}