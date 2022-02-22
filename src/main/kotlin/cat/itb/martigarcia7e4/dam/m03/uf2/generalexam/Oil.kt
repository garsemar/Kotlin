package cat.itb.martigarcia7e4.dam.m03.uf2.generalexam

data class Oil(val nom: String, val nomEmpresa: String, val litres: Int, val toxicitat: Float, val gravetat: Float = litres*toxicitat)