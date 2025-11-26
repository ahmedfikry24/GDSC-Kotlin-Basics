import design_patterns.Paragraph

fun main() {
    val paragraph = Paragraph.Builder().setPartA("This is part A. ")
        .setPartB("This is part B. ")
        .setPartC("This is part C.")
        .build()

    println("Paragraph: ${paragraph.partA}${paragraph.partB}${paragraph.partC}")
}
