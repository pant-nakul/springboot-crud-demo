layout "layouts/main.tpl",
        pageTitle: 'Edit student',
        mainBody: contents {

            form(class: " col-md-offset-4 col-md-4 col-md-offset-4 form-horizontal", method: "post", action: "/student/${studentInstance.id}") {
                fieldset {

                    legend {
                        yield 'Edit Student'
                    }
                    div(class: "form-group") {
                        label(class: "col-md-6, control-label", for: "name", "Name")
//  div (class:"col-md-4"){
                        input(id: "name", name: "name", type: "text", value: "$studentInstance.name", class: "form-control input-md", required: true)
//  }
                    }

//Button
                    div(class: "form-group") {
//  label (class:"col-md-6 control-label", for:"update"){yield 'Update'}
//  div (class:"col-md-4"){
                        button(id: "update", type: 'submit', name: "update", class: "btn btn-info") { yield 'Update' }
                        a(class: "btn btn-info", href: "/student/", "Back")
//  }
                    }
                }
            }
        }