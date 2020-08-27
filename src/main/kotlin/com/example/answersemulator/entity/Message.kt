package com.example.answersemulator.entity

import javax.persistence.*

@Entity
@Table(name = "messages")
class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Int = 0

    @Column(name = "phone_number")
    var phoneNumber: String = ""

    @Column(name = "message")
    var message: String = ""

    @Column(name = "priority")
    var priority: Int = 0

    // Define constructors
    constructor() {}

    constructor(phoneNumber: String, message: String, priority: Int) {
        this.phoneNumber = phoneNumber
        this.message = message
        this.priority = priority
    }

    override fun toString(): String {
        return "Message(id=$id, phoneNumber='$phoneNumber', message='$message', priority=$priority)"
    }
}