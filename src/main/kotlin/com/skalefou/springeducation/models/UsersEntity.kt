package com.skalefou.springeducation.models

import jakarta.persistence.*

@Entity
@Table(name = "users")
open class UsersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGINT")
    open var id: Long? = null

    @Column(name = "username", nullable = false, unique = true, length = 30)
    open var username: String = ""

    @Column(name = "email", nullable = false, unique = true, length = 255)
    open var email: String = ""

    @Column(name = "password", nullable = false, length = 255)
    open var password: String = ""
}
