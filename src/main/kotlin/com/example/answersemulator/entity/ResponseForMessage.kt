package com.example.answersemulator.entity

class ResponseForMessage() {
    val lengthDelegate = LengthDelegate()
    val calculateLength = CalculateLength()
    val openStream = OpenStream()
    val charset = Charset()
}

class LengthDelegate(val _value: Int = 0)

class CalculateLength()

class OpenStream()

class Charset(
        val name: String = "UTF-8",
        val aliases: Array<String> = arrayOf("UTF8", "unicode-1-1-utf-8"),
        val aliasSet: Array<String> = arrayOf("unicode-1-1-utf-8", "UTF8")
)
