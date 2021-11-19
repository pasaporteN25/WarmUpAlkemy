package Model

data class Direccion(
    val pais: String,
    val provincia: String,
    val partido: String,
    val ciudad: String,
    val codigoPostal: String,
    val calle: Map<NombreDeCalle, EntreCalles>,
    val piso: Int?,
    val dpto: String?
)

data class NombreDeCalle(
    val nombre: String,
    val altura: Int
)

data class EntreCalles(
    val calle1: String,
    val calle2: String
)