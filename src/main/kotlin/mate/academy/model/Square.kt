package mate.academy.model

import java.math.BigDecimal
import java.math.RoundingMode

class Square(color: Color, private val side: Double) : Figure(color) {
    override fun draw() {
        println("Figure: square, area: ${getArea()} sq. units, side: " +
                "$side units, color: ${color.name.lowercase()})"
        )
    }

    override fun getArea(): Double {
        return BigDecimal(side * side)
            .setScale(1, RoundingMode.UP)
            .toDouble()
    }
}