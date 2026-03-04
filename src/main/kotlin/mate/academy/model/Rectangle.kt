package mate.academy.model

import java.math.BigDecimal
import java.math.RoundingMode

class Rectangle(
    color: Color,
    private val width: Double,
    private val height: Double
): Figure(color) {
    override fun draw() {
        println("Figure: rectangle, area: ${getArea()} sq. units, width: " +
                "$width units, height: $height units, color: ${color.name.lowercase()}")
    }

    override fun getArea(): Double {
        return BigDecimal(width * height)
            .setScale(1, RoundingMode.UP)
            .toDouble()
    }
}