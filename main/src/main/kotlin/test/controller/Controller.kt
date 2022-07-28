package ko.test.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import temp.Square

@RestController
class Controller(private val square: Square) {
    @GetMapping("/test/{value}")
    fun getSomething(@PathVariable value: Int): Int {
        return square.getSquareValue(value)
    }
}
