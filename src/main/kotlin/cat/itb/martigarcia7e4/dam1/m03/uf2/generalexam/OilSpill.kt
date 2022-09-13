package cat.itb.martigarcia7e4.dam1.m03.uf2.generalexam

class OilSpill {
    val oil = mutableListOf<Oil>()

    fun inpInt(msg: String): Int {
        print("$msg: ")
        return OilSpillArchive().scan.nextInt()
    }
    fun inpFl(msg: String): Float {
        print("$msg: ")
        return OilSpillArchive().scan.nextFloat()
    }
    fun inpStr(msg: String): String {
        print("$msg: ")
        return OilSpillArchive().scan.nextLine()
    }

    fun addOil(name: String, nomEmpresa: String, litres: Int, toxicitat: Float){
        if(toxicitat > 1.0 || toxicitat < 0.0){
            println("Toxicitat a destar entre 0 i 1")
            return
        }
        println("Oil added successfully")
        oil.add(Oil(name, nomEmpresa, litres, toxicitat))
    }

    fun worstSpill(): Oil {
        val list = mutableListOf<Float>()
        for(i in oil.indices){
            list.add(oil[i].gravetat)
        }
        for(j in oil.indices) {
            if (list.maxOrNull() == oil[j].gravetat){
                return oil[j]
            }
        }
        return oil[0]
    }

    fun spillComp(name: String): MutableList<Oil> {
        val list = mutableListOf<Oil>()
        for(i in oil.indices){
            if(name == oil[i].nomEmpresa){
                list.add(oil[i])
            }
        }
        return list
    }

    // No ma donat temps a acabarlo
    fun worstComp() {
        val list = mutableListOf<Int>()
        var num = 0.0
        val dic = mapOf<String, Int>()
        val name = oil[0].nomEmpresa
        for (i in oil.indices) {
            if (name == oil[i].nomEmpresa) {
                num += oil[i].gravetat
            }
        }


        /*val list = mutableListOf<Float>()
        for (i in oil.indices) {
            list.add(oil[i].gravetat)
        }
        for (j in oil.indices) {
            if (list.maxOrNull() == oil[j].gravetat) {
                return oil[j]
            }
        }
        return oil[0]*/
    }
}