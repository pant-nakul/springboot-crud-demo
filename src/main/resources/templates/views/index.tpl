layout 'layouts/main.tpl',
    pageTitle: 'Spring Boot - Groovy templates example with layout',
    mainBody: contents {
    div(class:"panel panel-default col-md-offset-2 col-md-8 col-md-offset-2"){
      
      div(class:"panel-heading"){
      strong{yield 'Students List'}
      a(class:"btn  btn-info col-md-offset-9",href:"/student/create","Add Student")
      }
      div(class:"panel-body"){

 
      table (class:"table"){
        tr{
            th{
            yield "ID"
            }

            th{
            yield "Name"
            }
            th{
                        yield "Action"
                        }

                        th{
                        yield "Action"
                        }
        }
        students.each{student->
        tr{
            td{
               yield  "$student.id"
            }
            td{
                yield  "$student.name"
            }
            td{
                a(class:"btn btn-small btn-info",href: "/student/edit/${student.id}","Edit")
            }
            td{
                a(class:"btn btn-small btn-info",href: "/student/deleteOne/${student.id}","Delete")
            }
        }
      }
      }
      }
    }
    
    
//      div("This is an application using Boot  and Groovy templates ")
//        ul{
//            students.each{student->
//                li{
//                    yield "$student.id "
//                    a(href:"/student/$student.id"){
//                    yield "$student.name"
//                    }
//                }
//            }
//        }
    }