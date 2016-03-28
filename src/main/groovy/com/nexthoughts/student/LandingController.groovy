package com.nexthoughts.student

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.servlet.ModelAndView

@Controller
class LandingController {

    @RequestMapping(method=RequestMethod.GET,value = "/")
    public def landingPage() {

        return new ModelAndView("views/landing",[:])
    }
}
