package com.example.answersemulator.service

import com.example.answersemulator.dao.MessageDao
import com.example.answersemulator.entity.Message
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class MessageServiceImpl
@Autowired
constructor(
        @Qualifier("messageDaoJpaImpl")
        private val messageDao: MessageDao
) : MessageService {

    @Transactional
    override fun saveMessage(message: Message) {

        // checking message
        if (checkMessage(message)) {
            // save message
            messageDao.saveMessage(message)
        }
    }

    fun checkMessage(message: Message): Boolean {
        val phoneNumber = message.phoneNumber
        val messageText = message.message

        if (phoneNumber.isEmpty()) {
            return false
        } else if (!((message.phoneNumber.length == 11 && phoneNumber.toCharArray()[0] == '8') // phoneNumber starts with '8'
                        || (phoneNumber.length == 12 && phoneNumber.toCharArray()[0] == '+' && phoneNumber.toCharArray()[1] == '7')) // phoneNumber starts with '+7'
        ) {
            return false
        } else if (messageText.isEmpty()) {
            return false
        }
        return true
    }
}