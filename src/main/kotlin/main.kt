import org.w3c.dom.HTMLButtonElement
import org.w3c.dom.HTMLHeadingElement
import kotlin.browser.document
import kotlin.browser.window

fun main() {
    window.addEventListener("load", {
        onLoadWindow()
    })
}

fun onLoadWindow() {
    val greetButton = document.getElementById("greetButton") as HTMLButtonElement
    val greetText = document.getElementById("greetText") as HTMLHeadingElement
    greetButton.addEventListener("click", {
        greetText.textContent = "Hello, Kotlin/JS!"
    })
}