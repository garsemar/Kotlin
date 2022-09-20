package cat.itb.martigarcia7e4.dam2.m06.uf1.xml.model.restaurant

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import nl.adaptivity.xmlutil.serialization.XmlElement

@Serializable
@SerialName("restaurant")
data class Restaurant(
    @XmlElement(true) val name: String,
    @XmlElement(true) val address: String,
    @XmlElement(true) val owner: String,
    val type: String
)