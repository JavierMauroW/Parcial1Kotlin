fun main() {
    val hotel = Hotel()
    var continuar = true

    while (continuar) {
        println("\n-  Reservas de Hotel")
        println("1. Registar Reserva")
        println("2. Cancelar Reserva")
        println("3. Mostrar Resercvas Activas")
        println("4. Salir")
        print("Seleccione una opción: ")

        when (readLine()?.toIntOrNull()) {
            1 -> {

                print("Ingresa ID de la reserva: ")
                val idReserva = readLine()?.toIntOrNull() ?: continue
                print("Ingresa nombre del que se va quedar: ")
                val nombreHuesped = readLine() ?: continue
                print("Ingree gmail del usuario: ")
                val emailHuesped = readLine() ?: continue
                print("Ingrese numero del cuarto: ")
                val numeroHabitacion = readLine()?.toIntOrNull() ?: continue
                print("Ingrese precio por Noche: ")
                val precioPorNoche = readLine()?.toDoubleOrNull() ?: continue
                print("Ingrese nunero de de noches: ")
                val cantidadNoches = readLine()?.toIntOrNull() ?: continue

                val reserva = Reserva(idReserva, nombreHuesped, emailHuesped, numeroHabitacion, precioPorNoche, cantidadNoches)
                hotel.registrarReserva(reserva)
            }
            2 -> {
                print("Ingrese id de reserva a cncelar: ")
                val idReserva = readLine()?.toIntOrNull() ?: continue
                hotel.cancelarReserva(idReserva)
            }
            3 -> {
                hotel.mostrarReservasActivas()
            }
            4 -> {
                continuar = false
                println("Saliendo del progamra...")
            }
            else -> {
                println("Opción no válida. Intente de nuevo.")
            }
        }
    }
}

         n

