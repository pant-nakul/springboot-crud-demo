layout "layouts/main.tpl",
pageTitle : 'Edit student',
mainBody:contents{

form (class:"col-md-offset-4 form-horizontal",method:"Post",action:"/student"){
fieldset{


legend{
 yield 'Create Student'
}
div (class:"form-group"){
  label (class:"col-md-4, control-label" ,for:"textinput","Name")
  div (class:"col-md-4"){
  input (id:"name", name:"name" ,type:"text", placeholder:"Please enter a name", class:"form-control input-md", required:true)

  }
  }

//Button
div (class:"form-group"){
  label (class:"col-md-4 control-label", for:"save"){yield 'Save'}
  div (class:"col-md-4"){
    button (id:"save",type:'submit', name:"save", class:"btn btn-info"){yield 'Submit'}
    a(class:"btn btn-info",href:"/student/","Back")
  }
}
}
}
}