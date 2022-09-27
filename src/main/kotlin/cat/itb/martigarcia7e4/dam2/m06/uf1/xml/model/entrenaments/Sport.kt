package cat.itb.martigarcia7e4.dam2.m06.uf1.xml.model.entrenaments

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import nl.adaptivity.xmlutil.serialization.XmlElement
import java.time.Duration

//@Serializable
//@SerialName("sport")
//data class Sport(
//    @XmlElement(true) val name: String
//)

@Serializable
data class Entrenament(
    val name: String,
    val duration: Int
)