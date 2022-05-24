package cat.itb.martigarcia7e4.dam.m03.uf5.dadescovid

class UI{
    suspend fun start(){
        val covidStats = CovidStatsApp()

        covidStats.loadData()

        covidStats.totalDeaths()
        covidStats.newConfirmed()
        covidStats.euData()
        covidStats.spainRelative()
        covidStats.topRelative()
    }
}

suspend fun main() {
    UI().start()
}