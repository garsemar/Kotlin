package cat.itb.naimgomez7e5.dam.m03.uf1.generalexam

import java.util.*


fun main()
{
    val scan = Scanner(System.`in`);
    val target = scan.nextInt();
    var counter = 0;

    repeat(scan.nextInt())
    {

        val value = scan.nextInt();
        if(value == 0)
        {
            counter++;
            if(target == counter)
            {
                println("Hi ha $target seients consecutius")

                return;
            }
        }
        if(value == 1)
        {
            counter = 0;
        }

    }
    println("No hi ha $target seients consecutius")
}