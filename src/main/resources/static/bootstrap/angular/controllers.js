var app=angular.module("app");


function StudentController(StudentService,$http){
    var studentCtrl=this
    $http({
        method:"GET",
        url:'http://localhost:8080/student/1'
    }).success(function(response){
       studentCtrl.student=response
        console.log(response)
    }).error(function (data,status,header,config) {
        console.log("=======Error Status========="+status);
    })    
}







angular
    .module('app')
    .controller('StudentController', StudentController);
