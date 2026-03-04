package mate.academy.model

import java.math.BigDecimal
import java.math.RoundingMode

class IsoscelesTrapezoid(
    color: Color,
    private val firstBase: Double,
    private val secondBase: Double,
    private val height: Double
) : Figure(color) {
    override fun draw() {
        println("Figure: isosceles trapezoid, area: ${getArea()} sq. units, first base: " +
                "$firstBase units, second base: $secondBase units, " +
                "height: $height units, color: ${color.name.lowercase()}"
        )
    }

    override fun getArea(): Double {
        return BigDecimal(((firstBase + secondBase) / 2) * height)
            .setScale(1, RoundingMode.UP)
            .toDouble()
    }
}