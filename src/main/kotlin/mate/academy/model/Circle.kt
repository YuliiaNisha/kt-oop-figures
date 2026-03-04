package mate.academy.model

import java.math.BigDecimal
import java.math.RoundingMode

class Circle(
    color: Color,
    private val radius: Double
) : Figure(color) {
    override fun draw() {
        println("Figure: circle, area: ${getArea()} sq. units, " +
                "radius: $radius units, color: ${color.name.lowercase()}"
        )
    }

    override fun getArea(): Double {
        return BigDecimal(Math.PI * radius * radius)
            .setScale(1, RoundingMode.UP)
            .toDouble()
    }
}