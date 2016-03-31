layout 'layouts/main.tpl',
        pageTitle: 'Spring Boot - Groovy templates example with layout',
        mainBody: contents {
            div(class: 'row') {
                div(class: 'col-md-offset-3 col-md-6') {
                    table(class: "table table-bordered") {
                        tr {
                            th(class: 'col-md-2') {
                                yield "ID"
                            }

                            th(class: 'col-md-2') {
                                yield "Name"
                            }
                        }
                        tr {
                            td(class: 'col-md-2') {
                                yield "$studentInstance.id"
                            }
                            td(class: 'col-md-2') {
                                yield "$studentInstance.name"
                            }
                        }
                    }
                }

            }
            div(class: row) {
                div(class: 'col-md-offset-5 col-md-3') {
                    a(class: 'btn btn-info', href: '/student/', "Back")
                    a(class: "btn btn-small btn-info", href: "/student/edit/${studentInstance.id}", "Edit")
                    a(class: "btn btn-small btn-info", href: "/student/deleteOne/${studentInstance.id}", "Delete")
                }
            }
        }









    


