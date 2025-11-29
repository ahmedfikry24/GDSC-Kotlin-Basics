import design_patterns.FormField
import design_patterns.emailValidator
import design_patterns.passwordValidator

fun main() {
    val emailField = FormField("ahmed", emailValidator)
    val passwordField = FormField("1234567", passwordValidator)

    println("Is email valid? ${emailField.isValid()}")
    println("Is password valid? ${passwordField.isValid()}")
}
