package com.example.answersemulator.dao

import com.example.answersemulator.entity.Message

interface MessageDao {

    fun saveMessage(message: Message)
}