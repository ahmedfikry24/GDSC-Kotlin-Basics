package design_patterns

class Paragraph private constructor(
    val partA: String,
    val partB: String,
    val partC: String
) {
    data class Builder(
        val partA: String = "",
        val partB: String = "",
        val partC: String = "",
    ) {
        fun setPartA(partA: String) = copy(partA = partA)
        fun setPartB(partB: String) = copy(partB = partB)
        fun setPartC(partC: String) = copy(partC = partC)
        fun build() = Paragraph(partA, partB, partC)
    }
}