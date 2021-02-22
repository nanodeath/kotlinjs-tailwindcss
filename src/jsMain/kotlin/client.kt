import kotlinx.html.div
import kotlinx.html.dom.append
import org.w3c.dom.Node
import kotlinx.browser.document
import kotlinx.browser.window

fun main() {
    kotlinext.js.require("./app.css")
    window.onload = { document.body?.sayHello() }
}

fun Node.sayHello() {
    append {
        div {
            +"Hello from JS"
        }
    }
}