fun main() {
//CAPTURA DE DATOS POR CONSOLA
    println("Ingrese su nombre: ")
    var nombre = readLine()//Captura un String y lo devuelve
    //Tambien se puede escribir como readln()
    println("Hola $nombre!")

    println("Ingrese su edad: ")
    //var edad = readLine()!!.toInt()
    //Usando readln() no necesitamos poner !!
    var edad = readln()
    println("Su edad es de $edad años.")

    //Valores nulos
    /*
    Un valor nulo implica que una variable esta vacia
    o que el valor no es valido
    */
}