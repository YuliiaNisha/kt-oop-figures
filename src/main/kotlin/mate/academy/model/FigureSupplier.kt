package mate.academy.model

import mate.academy.service.ColorSupplier

class FigureSupplier {
    fun getRandomFigure(): Figure {
        val supplier = ColorSupplier()
        return when ((1..5).random()) {
            1 -> Square(supplier.getRandomColor(), getRandomDouble())
            2 -> Rectangle(supplier.getRandomColor(), getRandomDouble(), getRandomDouble())
            3 -> RightTriangle(supplier.getRandomColor(), getRandomDouble(), getRandomDouble())
            4 -> Circle(supplier.getRandomColor(), getRandomDouble())
            else -> IsoscelesTrapezoid(
                supplier.getRandomColor(),
                getRandomDouble(), getRandomDouble(),
                getRandomDouble())
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, 10.0)
    }

    private fun getRandomDouble() : Double {
        return (1..50).random().toDouble()
    }
}