yieldUnescaped '<!DOCTYPE html>'
html {
    head {
        title(pageTitle)
        link(rel: 'stylesheet', href: '/bootstrap/css/bootstrap.css')
    }
    body {
        div(class: "page-header", style: "background-color: dodgerblue") {
            div(class: "row") {
                div(class: "col-xs-4 col-xs-offset-4") {
                    h1("SpringBoot CRUD Demo")
                }
            }
        }
        mainBody()
        script('src': '/bootstrap/angular/jquery-1.12.2.min.js') { yield '' }
    }
}