package com.nexthoughts.student

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id
    @Column(name='name')
    String name
}
