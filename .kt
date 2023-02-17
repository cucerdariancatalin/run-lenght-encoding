fun encodeRLE(input: String): String {
    var encoded = ""
    var currentChar = input[0]
    var count = 1
    
    for (i in 1 until input.length) {
        if (input[i] == currentChar) {
            count++
        } else {
            encoded += "$count$currentChar"
            currentChar = input[i]
            count = 1
        }
    }
    
    encoded += "$count$currentChar"
    return encoded
}

fun decodeRLE(input: String): String {
    var decoded = ""
    
    var i = 0
    while (i < input.length) {
        var count = ""
        while (input[i].isDigit()) {
            count += input[i]
            i++
        }
        val num = count.toInt()
        val char = input[i]
        decoded += char.toString().repeat(num)
        i++
    }
    
    return decoded
}
