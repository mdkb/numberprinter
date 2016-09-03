app.controller("myCtrl", function($scope, $http) {
  //  $scope.greeting = printNumber();

$http.get('printnumber/word/123')
      .then(function(response){
    console.log('init');
        $scope.greeting = response.data;
    console.log(response.data);
      });


    $scope.numberprinters = [];
$http.get('numberprinters')
      .then(function(response){
    console.log('numberprinters');
        $scope.numberprinters = response.data;
    console.log('numberprinters'+response.data);
      });

    $scope.number = 0;
    $scope.printedNumber;

    $scope.submit = function(printer, number) {
    console.log('submit');

    console.log('printnumber/' + printer + '/'+number);
      $http.get('printnumber/' + printer + '/'+number)
      .then(function(response){
    console.log('response');
        $scope.printedNumber = response.data;
      });
    }
});

