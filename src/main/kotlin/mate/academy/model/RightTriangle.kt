package mate.academy.model

import java.math.BigDecimal
import java.math.RoundingMode

class RightTriangle(
    color: Color,
    private val firstLeg: Double,
    private val secondLeg: Double
) : Figure(color) {
    override fun draw() {
        println("Figure: right triangle, area: ${getArea()} sq. units, first leg: " +
                "$firstLeg units, second leg: $secondLeg units, color: ${color.name.lowercase()}")
    }

    override fun getArea(): Double {
        return BigDecimal((firstLeg * secondLeg) / 2)
            .setScale(1, RoundingMode.UP)
            .toDouble()
    }
}