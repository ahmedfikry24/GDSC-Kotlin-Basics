package design_patterns

fun interface Validator {
    fun validate(input: String): Boolean
}

val emailValidator: Validator = Validator { it.contains("@") && it.contains(".") }

val passwordValidator: Validator = Validator { it.length >= 8 && it.any { character -> character.isDigit() } }

class FormField(private val input: String, private val validator: Validator) {
    fun isValid(): Boolean = validator.validate(input)
}
