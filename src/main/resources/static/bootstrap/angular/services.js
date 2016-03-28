function StudentService() {
    var StudentService = {}
    //Service private methods or helper methods for services

    var checkService=function(){
        console.log("StudentService");
    }
    //Service public methods
        StudentService.getAllStudents = function ($http) {
        var obj=[]
        
    }
}


angular
    .module('app')
    .service('StudentService', StudentService);
