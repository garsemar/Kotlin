package cat.itb.naimgomez7e5.dam.m03.uf1.generalexam

import java.util.*


fun main() {
    val scan = Scanner(System.`in`);

    val teams = Array(10) {0};
    for (i in  0..49)
    {
        teams[i%10] += scan.nextInt();
    }

    for (i in teams.iterator())
    {
        println(i)
    }
}