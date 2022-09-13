package cat.itb.martigarcia7e4.dam1.m03.uf1.iterative

import java.util.*

fun main()
{
    val number = Scanner(System.`in`).nextInt()
    var divider = 10;
    var result = 0;

    while(true){
        val digit = (number%divider)/(divider/10)
        if(digit == 0)
        {
            break
        }
        result += digit
        divider *= 10
    }
    println("$result")
}


/*package cat.itb.martigarcia7e4.dam1.m03.uf1.iterative

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    print("Introdueix un numero: ")
    val num = scan.nextInt()
    var cien = 10
    var num1 = 0
    /*
    println(num/100)
    var num1 = num % 100
    println(num1/10)
    println(num%10)
*/
    while(num%cien != num){
        cien *= 10
    }
    if(num%cien == num) {
        cien /= 10
        println(num / cien)
        num1 = num % cien
        println(num1/(cien/10))
        println(num%(cien/10))
    }
}
*/