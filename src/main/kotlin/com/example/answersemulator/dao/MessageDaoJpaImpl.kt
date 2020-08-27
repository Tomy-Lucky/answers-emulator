package com.example.answersemulator.dao

import com.example.answersemulator.entity.Message
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import javax.persistence.EntityManager

@Repository
class MessageDaoJpaImpl
@Autowired
constructor(
        private val entityManager: EntityManager
): MessageDao {

    override fun saveMessage(message: Message) {
        val dbMessage: Message = entityManager.merge(message)
        message.id = dbMessage.id
    }
}