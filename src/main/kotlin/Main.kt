import Model.Direccion
import Model.EntreCalles
import Model.NombreDeCalle

fun main() {

    val dptos :ArrayList<Direccion> = arrayListOf(
        //Dir ej 1:
        Direccion("Argentina","Buenos Aires"
            ,"La Matanza","San Justo","1754"
            , mapOf(NombreDeCalle("Derqui",3986)to EntreCalles("Condarco","Balbastro"))
            ,3,"B"),

        //Dir ej 2:
        Direccion("Chile","Valparaiso"
            ,"Papudo","Quinquimo","1754"
            , mapOf(NombreDeCalle("4 Ote",15)to EntreCalles("3 Ote","5 Ote"))
            ,null,null),

        //Dir ej 3:
        Direccion("Argentina","Buenos Aires"
            ,"Almirante Brown","","1854"
            , mapOf(NombreDeCalle("Av. Aviacion",629)to EntreCalles("Pres. Rivadavia","Manuel Belgrano"))
            ,1,"A")
    )

    //Ejercicios:

    //Direccion completa:
    direccionToString(dptos[0])

    //Dptos y Pisos:
    for (str in format4Dpto(dptos)){
        println(str)
    }


}

fun format4Dpto(dirs: ArrayList<Direccion>): ArrayList<String>{

    val dptos = ArrayList<String>()

    for (dir in dirs){
        if(dir.piso != null && dir.dpto != null){
            dptos.add("Piso: "+ dir.piso.toString() + ";Depto: "+ dir.dpto)
        }
    }
    return dptos
}

fun direccionToString(dir: Direccion){
    println("DATOS CONSULTA \n")

    var cadena = "Pais: ${ dir.pais } \n" +
            "Provincia:  ${ dir.provincia } \n" +
            "Ciudad:  ${ dir.ciudad } \n" +
            "Partido: ${ dir.partido } \n" +
            "Codigo Postal: ${ dir.codigoPostal } \n" +
            "Calle: ${ dir.calle.keys.first().nombre } ${ dir.calle.keys.first().altura.toString() } \n" +
            "Entre: ${ dir.calle.values.first().calle1 } y ${ dir.calle.values.first().calle2 } \n"

    if(dir.piso != null && dir.dpto!= null){
        cadena+="Dpto: ${ dir.piso.toString() }°${ dir.dpto} \n"
    }

    println(cadena)

}