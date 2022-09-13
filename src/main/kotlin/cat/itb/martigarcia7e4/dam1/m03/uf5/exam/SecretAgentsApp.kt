package cat.itb.martigarcia7e4.dam1.m03.uf5.exam

import java.util.*

class UI(val scan: Scanner){
    private val secretAgentsApp = SecretAgentsApp()
    fun start(){
        while (true){
            println("Vols (1) afegir, (2) renombrar, (3) cercar, (0) sortir?")
            when(scan.nextInt()){
                1 -> addAgent()
                2 -> renameAgent()
                3 -> searchAgent()
                0 -> return
                else -> println("Opció incorrecta")
            }
        }
    }

    private fun addAgent() {
        println("Afegir nou agent:")
        println("Nom Cognom Alies")
        val newAgent = Agent(scan.next(), scan.next(), scan.next())
        if(newAgent in secretAgentsApp.agents) {
            println("Aquest àlias ja està utilitzat")
        }
        else if(secretAgentsApp.checkAgent(newAgent)){
            println("Creat")
        }
        else{
            println("Àlies invàlid")
        }
        return
    }

    private fun renameAgent() {
        println("Renombrar agent:")
        println("Antic alies Nou alies")
        if(secretAgentsApp.renameAgent(scan.next(), scan.next())){
            println("Renombrat")
        }
        else{
            println("Àlies incorrectes")
        }
        return
    }

    private fun searchAgent() {
        println("Buscar agent:")
        val agent = secretAgentsApp.searchAgent(scan.next())
        if(agent != null){
            println(agent)
        }
        else{
            println("No existex aquest àlias")
        }
    }
}

class SecretAgentsApp{
    val agents = mutableListOf<Agent>()
    fun checkAgent(newAgent: Agent): Boolean{
        if(checkAlias(newAgent.alias)){
            agents.add(newAgent)
            return true
        }
        return false
    }
    fun renameAgent(oldAlias: String, newAlias: String): Boolean{
        val agent = agents.find { it.alias == oldAlias }
        if(checkAlias(newAlias) && agent != null){
            agents.find { it.alias == oldAlias }?.alias = newAlias
            return true
        }
        return false
    }
    fun searchAgent(alias: String): Agent? {
        val agent = agents.find { it.alias == alias }
        if(agent != null){
            return agent
        }
        return null
    }
    private fun checkAlias(alias: String): Boolean{
        val regex = Regex("^[A-Z](\\w+){2}\\d\$")
        if(regex.matches(alias) && alias !in agents.map { it.alias }){
            return true
        }
        return false
    }
}

data class Agent(val name: String, val lastName: String, var alias: String)

fun main() {
    val scan = Scanner(System.`in`).useLocale(Locale.US)
    val secretAgentsApp = UI(scan)

    secretAgentsApp.start()
}