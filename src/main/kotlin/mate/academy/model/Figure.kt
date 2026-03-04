package mate.academy.model

abstract class Figure(protected val color: Color) {
    abstract fun draw()
    abstract fun getArea(): Double
}