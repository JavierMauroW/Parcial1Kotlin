open class Hotel {


            private val reservas = mutableListOf<Reserva>()
        private val habitacionesOcupadas = mutableSetOf<Int>()

    fun registrarReserva(reserva: Reserva): Boolean {
            if (habitacionesOcupadas.contains(reserva.numeroHabitacion)) {
                      println("La habitacifggn ${reserva.numeroHabitacion} ya está reservada.")
                return false
            }
            reservas.add(reserva)
             habitacionesOcupadas.add(reserva.numeroHabitacion)


            println("Reserva regisrada con exito: ${reserva.idReserva}")

            return true
        }


          fun cancelarReserva(idReserva: Int): Boolean {
               val reserva = reservas.find { it.idReserva == idReserva }
                   return if (reserva != null) {
                    reservas.remove(reserva)
                   habitacionesOcupadas.remove(reserva.numeroHabitacion)
                        println("Reserva caneelada: $idReserva")
                 true
            } else {
                  println("No se encontro la reserva con ID: $idReserva")
                false
            }
        }




                   fun mostrarReservasActivas() {
            if (reservas.isEmpty()) {

                println(" ya  nohay reservas activas.")
                return
            }

            println("Reservas ocupadas:")


            for (reserva in reservas) {
                println(
                    "ID Reserva: ${reserva.idReserva}, Huésped: ${reserva.nombreHuesped}, " +

                            "Habitación: ${reserva.numeroHabitacion}, Total a Pagar: ${reserva.totalAPagar()}"
                )
            }
        }
    }

