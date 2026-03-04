package mate.academy.service

import mate.academy.model.Square
import mate.academy.model.RightTriangle
import mate.academy.model.Rectangle
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Circle
import mate.academy.model.Figure
import mate.academy.model.Color

const val MAX_NUMBER_OF_FIGURES = 5
const val DEFAULT_RADIUS = 10.0
const val MIN_VALUE = 1
const val MAX_VALUE = 50
const val ONE = 1
const val TWO = 2
const val THREE = 3
const val FOUR = 4

class FigureSupplier {
    private val supplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        return when ((MIN_VALUE..MAX_NUMBER_OF_FIGURES).random()) {
            ONE -> Square(supplier.getRandomColor(), getRandomDouble())
            TWO -> Rectangle(supplier.getRandomColor(), getRandomDouble(), getRandomDouble())
            THREE -> RightTriangle(supplier.getRandomColor(), getRandomDouble(), getRandomDouble())
            FOUR -> Circle(supplier.getRandomColor(), getRandomDouble())
            else -> IsoscelesTrapezoid(
                supplier.getRandomColor(),
                getRandomDouble(), getRandomDouble(),
                getRandomDouble())
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }

    private fun getRandomDouble() : Double {
        return (MIN_VALUE..MAX_VALUE).random().toDouble()
    }
}
