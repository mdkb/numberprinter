app.controller("myCtrl", function($scope, $http) {
  //  $scope.greeting = printNumber();

$http.get('printnumber/word/123')
      .then(function(response){
    console.log('init');
        $scope.greeting = response.data;
      });

    $scope.number = 0;
    $scope.printedNumber;

    $scope.submit = function(number) {
    console.log('submit');
    console.log('printnumber/word/'+number);
      $http.get('printnumber/word/'+number)
      .then(function(response){
    console.log('response');
        $scope.printedNumber = response.data;
      });
    }
});

