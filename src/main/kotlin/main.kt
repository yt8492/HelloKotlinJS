import org.w3c.dom.HTMLButtonElement
import kotlin.browser.document

fun main() {
    val greetButton = document.getElementById("greetButton") as HTMLButtonElement
    val greetText = document.getElementById("greetText")
    greetButton.onclick = {
        greetText?.textContent = "Hello, Kotlin/JS!"
        Unit
    }
}