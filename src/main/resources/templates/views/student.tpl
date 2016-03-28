layout 'layouts/main.tpl',
    pageTitle: 'Spring Boot - Groovy templates example with layout',
    mainBody: contents {
      div(class:"col-md-offset-2 col-md-6 col-md-offset-2"){
      div(class:"col-md-4"){
                    label(class:'modal-header',for:'studentId'){yield 'Id'}
                    input(class:"form-control",type:'textfield',id:'studentId',name:'studentId',readonly:true,"${studentInstance.id}")
                    label(class:'modal-header',for:'studentName'){yield 'Name'}
                    input(class:"form-control",type:'textfield',id:'studentName',name:'studentName',readonly:true,"${studentInstance.name}")

      }
    }

}









    


