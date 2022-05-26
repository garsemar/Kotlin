package cat.itb.martigarcia7e4.dam.m03.uf6.beachapp.model

class Beach(val id: Int, val name: String, val city: String, waterQuality: Int) {
    init {
        if(waterQuality !in 1..5){
            throw IllegalArgumentException("Water quality must be between 1 and 5")
        }
    }
    var waterQuality = waterQuality
        set(it) {
            if(it in 1..5) {
                field = it
            }
        }

    override fun toString(): String {
        return "Beach(id=$id, name=$name, city=$city, quality=$waterQuality)"
    }
}