package mate.academy

import mate.academy.model.Figure
import mate.academy.model.FigureSupplier

fun main() {
    val figures = getFigures()

    figures.forEach {
            it.draw()
        }
}

fun getFigures() : Array<Figure> {
    val supplier = FigureSupplier()
    val size = 6
    return Array(size) { index ->
        if (index < size / 2) {
            supplier.getRandomFigure()
        } else {
            supplier.getDefaultFigure()
        }
    }
}
