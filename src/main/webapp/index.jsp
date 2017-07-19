<html>
<head>
<title>FORM CREATOR</title>
</head>
<body>
<h2>Welcome to Form Generation</h2>
<script>
var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http) {

    //Initialize page with default data which is blank in this example
    $scope.objects = [];

});
refreshPageData();
//HTTP GET- get all employees collection
function _refreshPageData() {
    $http({
        method : 'GET',
        url : 'http://localhost:8080/FormGenerator/formcreators/261'
    }).then(function successCallback(response) {
        $scope.formdata = response.data.formdata;
    }, function errorCallback(response) {
        console.log(response.statusText);
    });
}
</script>
<style>
    .button {
                cursor: pointer;
                color: blue;
            }
            td,th{
                border: 1px solid gray;
                width: 25%;
                text-align: left;
            }
            table {
                width: 600px;
            }</style>
</head>
<body>
<div ng-app="myApp" ng-controller="myCtrl"> 

<p>form data</p>
<h1></h1>
<table>
  <tr>
                <th>room Name</th>
                <th>start time</th>
          
            </tr>
  <tr ng-repeat="x in formdata">
    <td>{{ formdata }}</td>
    <td>{{ x.textbox }}</td>
  </tr>
</table>


</div>

</body>
</html>
