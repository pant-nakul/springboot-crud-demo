package com.nexthoughts.student

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView
import org.springframework.web.servlet.view.RedirectView


@Controller
@RequestMapping(value = '/student')
class RootController {
    @Autowired
    StudentRepository studentRepository
    
    
    @RequestMapping(method=RequestMethod.GET)
    public def getAll() {
        def students=studentRepository.findAll()
        println "=========$students========"
           return new ModelAndView("views/index",[students:students])
    }

    @RequestMapping(method=RequestMethod.GET ,value = '{id}')
    public def getOne(@PathVariable String id) {
        Student student=studentRepository.findOne(Long.parseLong(id))
        println "============$student.properties============="
         return new ModelAndView("views/student",[studentInstance: student])
    }

    @RequestMapping(method=RequestMethod.POST)
    public def create(@ModelAttribute Student student) {
        println "======Inside create method========="
        println "=======$student.properties======="
       Student student1= studentRepository.saveAndFlush(student)
        if(student){
            return new ModelAndView(new RedirectView("/student"))
        }
    }

    @RequestMapping(method=RequestMethod.GET,value = "/create")
    public def createOne() {
        return new ModelAndView("views/createStudent")
    }

    @RequestMapping(method=RequestMethod.DELETE, value="{id}")
    public def delete(@PathVariable String id) {
        studentRepository.delete(Long.parseLong(id))
        return [status:'deleted']
    }

    @RequestMapping(method=RequestMethod.POST, value="{id}")
    public def update(@PathVariable String id, @ModelAttribute Student student) {
        println "======Inside update method==========="
        println "===ID === $id==="
        println "=======$student.properties"
        Student student1=studentRepository.findOne(Long.parseLong(id))
        student1.name=student.name
        if(studentRepository.save(student1)){
            return new ModelAndView(new RedirectView("/student"))
        }
    }

    @RequestMapping(method=RequestMethod.GET, value="/edit/{id}")
    public def edit(@PathVariable String id) {
        Student student=studentRepository.findOne(Long.parseLong(id))
        new ModelAndView("views/edit",[studentInstance: student])
    }

    @RequestMapping(method=RequestMethod.GET, value="/deleteOne/{id}")
    public def deleteOne(@PathVariable String id) {
        studentRepository.delete(Long.parseLong(id))
        return new ModelAndView(new RedirectView("/student/"))
    }


}
