package cat.itb.naimgomez7e5.dam.m03.uf1.generalexam

import java.util.*


fun main() {
    val scan = Scanner(System.`in`);
    var last_dot = false;

    for (i in 0 until scan.nextLine().toInt())
    {
        val value = scan.nextLine();
        if(!value[0].isUpperCase() && last_dot)
        {
            println(i+1)
        }
        last_dot = false ;
        if(value[value.length-1] == '.')
        {
            last_dot = true;
        }
    }
}