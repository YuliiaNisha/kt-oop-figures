package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val FIGURES_NUMBER = 6
const val TWO = 2

fun main() {
    val figures = getFigures()

    figures.forEach {
            it.draw()
        }
}

fun getFigures() : Array<Figure> {
    val supplier = FigureSupplier()
    val size = FIGURES_NUMBER
    return Array(size) { index ->
        if (index < size / TWO) {
            supplier.getRandomFigure()
        } else {
            supplier.getDefaultFigure()
        }
    }
}
