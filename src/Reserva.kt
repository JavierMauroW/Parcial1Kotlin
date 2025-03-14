class Reserva(
    val idReserva: Int,
    val nombreHuesped: String,
    val emailHuesped: String,
    val numeroHabitacion: Int,
    val precioPorNoche: Double,
    val cantidadNoches: Int
) {
                fun totalAPagar(): Double {

                    return precioPorNoche * cantidadNoches


    }
}