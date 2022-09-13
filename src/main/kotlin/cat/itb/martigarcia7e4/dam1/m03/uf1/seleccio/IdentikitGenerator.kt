package cat.itb.martigarcia7e4.dam1.m03.uf1.seleccio

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    print("Introdueix tipus de cabell(arrissats @@@@@, llisos VVVVV o pentinats XXXXX): ")
    val hair = scan.nextLine()
    print("Introdueix tipus d'ulls(aclucats .-.-., rodons .o-o. o estrellats .*-*): ")
    val eyes = scan.nextLine()
    print("Introdueix tipus de nas(..0.., arromangat ..C.. o agilenc ..V..): ")
    val nose = scan.nextLine()
    print("Introdueix tipus de boca(normal .===., bigoti .∼∼∼. o dents-sortides .www.): ")
    val mouth = scan.nextLine()

    when{
        hair == "@@@@@" -> println("")
    }
}