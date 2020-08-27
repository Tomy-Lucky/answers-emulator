package com.example.answersemulator.controller

import com.example.answersemulator.entity.*
import com.example.answersemulator.service.MessageService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("answers-emulator/internal/notification-service")
class MessageRestController
@Autowired
constructor(
        private val messageService: MessageService
){

    @PostMapping("/sms")
    fun addMessage(@RequestBody message: Message): ResponseForMessage {

        // setting id to 0
        // this will save new item instead of updating
        message.id = 0
        messageService.saveMessage(message)
        return ResponseForMessage()
    }
}