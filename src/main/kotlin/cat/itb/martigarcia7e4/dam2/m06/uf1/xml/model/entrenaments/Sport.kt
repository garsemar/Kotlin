package cat.itb.martigarcia7e4.dam2.m06.uf1.xml.model.entrenaments

import kotlinx.serialization.Serializable

@Serializable
data class Entrenaments(
    val entrenament: MutableList<Entrenament>
)

@Serializable
data class Entrenament(
    val name: String,
    val duration: Int
)