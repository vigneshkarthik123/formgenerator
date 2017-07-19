<html>
<head>
<title>FORM CREATOR</title>
<script
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.6.0/angular.min.js"></script>
</head>
<body ng-app="myApp" ng-controller="myCtrl">
	<h2>Welcome to Form Generation</h2>
	<script>
		var app = angular.module('myApp', []);
		app.controller('myCtrl', function($scope, $http) {

			//Initialize page with default data which is blank in this example
			$scope.objects = [];
			$http.get("http://localhost:8080/FormGenerator/formcreators/261")
					.then(function(response) {
						$scope.formdata = response.data.formOutput;
						alert(JSON.stringify($scope.formdata));
					});

		});
	</script>
	<style>
.button {
	cursor: pointer;
	color: blue;
}

td, th {
	border: 1px solid gray;
	width: 25%;
	text-align: left;
}

table {
	width: 600px;
}
</style>
</head>
<body>
	<div ng-app="myApp" ng-controller="myCtrl">
		<div ng-repeat="x in formdata">
			<ul ng-repeat="inx in x">
				<li>{{inx.userId}}</li>
				<li ng-if="inx.textBox">{{inx.textBox}}</li>
				<li ng-if="inx.textArea">{{inx.textArea}}</li>
			</ul>
		</div>
	</div>

</body>
</html>
