package com.example.answersemulator.service

import com.example.answersemulator.entity.Message

interface MessageService {

    fun saveMessage(message: Message)
}