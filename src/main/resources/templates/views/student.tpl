layout 'layouts/main.tpl',
    pageTitle: 'Spring Boot - Groovy templates example with layout',
    mainBody: contents {
      div("This is an application using Boot and Groovy templates ")
     div(){
        yield "${studentInstance?.id}  ${studentInstance?.name}"
     }
        a(href:"/student/edit/${studentInstance.id}","Edit ${studentInstance.name}")
        a(href:"/student/edit/${studentInstance.id}","Edit ${studentInstance.name}")
    }