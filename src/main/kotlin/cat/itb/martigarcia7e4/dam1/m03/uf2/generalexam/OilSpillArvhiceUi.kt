package cat.itb.martigarcia7e4.dam1.m03.uf2.generalexam

import cat.itb.martigarcia7e4.dam1.m03.uf1.data.project.scan

class OilSpillArvhiceUi(){
    private val oilSpillArchive = OilSpillArchive()
    private val oilSpill = OilSpill()
    fun showMainMenu(){
        println("Chose option:")
        println("1. Add oil spill")
        println("2. List oil spills")
        println("3. Worst oil spill")
        println("4. Show Spill litters")
        println("5. Show spill gravity")
        println("6. Spills for company")
        println("7. Worst company")
        println("0. Exit")

        when(oilSpillArchive.scan.nextInt()){
            1 -> addOil()
            2 -> listOil()
            3 -> worstSpill()
            4 -> showSpillLit()
            5 -> showSpillGrav()
            6 -> spillComp()
            7 -> worstComp()
            0 -> return
            else -> {
                showMainMenu()
            }
        }
    }

    fun selectOil(){
        println("name - company - litters - toxicity - gravity")
        for(i in oilSpill.oil.indices) {
            print("Spill name: ${oilSpill.oil[i].nom} - ")
            print("Company name: ${oilSpill.oil[i].nomEmpresa} - ")
            print("Liters: ${oilSpill.oil[i].litres} - ")
            print("Toxicity: ${oilSpill.oil[i].toxicitat} - ")
            println("Gravity: ${oilSpill.oil[i].gravetat}")
        }
    }

    private fun addOil() {
        println("[Add oil]")
        oilSpill.addOil(oilSpill.inpStr("Spill name"), oilSpill.inpStr("Nom de l'empresa"), oilSpill.inpInt("Litres"), oilSpill.inpFl("Toxicitat"))
        showMainMenu()
    }

    private fun listOil() {
        println("[List oil]")
        selectOil()
        showMainMenu()
    }

    private fun worstSpill() {
        println("[Worst spill]")
        val list = oilSpill.worstSpill()
        println("Spill name: ${list.nom} ")
        println("Company name: ${list.nomEmpresa} ")
        println("Liters: ${list.litres} ")
        println("Gravity: ${list.gravetat}")
        showMainMenu()
    }

    private fun showSpillLit() {
        TODO("Not yet implemented")
    }

    private fun showSpillGrav() {
        TODO("Not yet implemented")
    }

    private fun spillComp() {
        println("[Spill for company]")
        print("Company name: ")
        val list = oilSpill.spillComp(scan.next())
        if(list.isEmpty()) showMainMenu()

        println("name - company - litters - toxicity - gravity")
        for(i in list.indices){
            print("Spill name: ${list[i].nom} - ")
            print("Company name: ${list[i].nomEmpresa} - ")
            print("Liters: ${list[i].litres} - ")
            print("Toxicity: ${list[i].toxicitat} - ")
            println("Gravity: ${list[i].gravetat}")
        }
    }

    // No ma donat temps a acabarlo
    private fun worstComp() {
        println("[Worst company]")
        print("Company name: ")
        val list = oilSpill.worstComp()
    }
}
