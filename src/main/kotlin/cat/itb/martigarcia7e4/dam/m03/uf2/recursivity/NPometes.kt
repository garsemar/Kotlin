package cat.itb.martigarcia7e4.dam.m03.uf2.recursivity

fun getAppleSongStanza(applesCount: Int) =
    """
        $applesCount pometes té el pomer, 
        de $applesCount una, de $applesCount una,
        $applesCount pometes té el pomer,
        de $applesCount una en caigué. 
        Si mireu el vent d'on vé 
        veureu el pomer com dansa, 
        si mireu el vent d'on vé
        veureu com dansa el pomer.
    """

fun getAppleSong(applesCount: Int):String{
    if(applesCount == 0){
        return ""
    }
    return getAppleSongStanza(applesCount) + getAppleSong(applesCount-1)
}

fun main() {
    print(getAppleSong(10))
}