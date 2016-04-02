package com.nexthoughts.student

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView
import org.springframework.web.servlet.view.RedirectView


@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = '/rest')
class StudentRestController {
    @Autowired
    StudentRepository studentRepository


    @RequestMapping(method=RequestMethod.GET)
    public def getAll() {
        def students=studentRepository.findAll()
        return students
    }

    @RequestMapping(method=RequestMethod.GET ,value = '{id}')
    public def getOne(@PathVariable String id) {
        Student student=studentRepository.findOne(Long.parseLong(id))
        return student
    }

    @RequestMapping(method=RequestMethod.POST)
    public def create(@RequestBody Student student) {
        def studentCreated= studentRepository.saveAndFlush(student)
        studentCreated
    }

    @RequestMapping(method=RequestMethod.DELETE, value="{id}")
    public def delete(@PathVariable String id) {
        studentRepository.delete(Long.parseLong(id))
        return [status:'deleted']
    }

    @RequestMapping(method=RequestMethod.PUT, value="{id}")
    public Student update(@PathVariable String id, @RequestBody Student student) {
        Student student1=studentRepository.findOne(Long.parseLong(id))
        student1.name=student.name
        return studentRepository.save(student1)
    }
}
