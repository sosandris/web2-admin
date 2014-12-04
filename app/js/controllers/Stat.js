'use strict';

angular.module('tilosAdmin').config(function ($routeProvider) {
  $routeProvider.when('/stat/listener', {
    templateUrl: 'views/stat-listener.html',
    controller: 'StatListenerCtrl'
  });
});

angular.module('tilosAdmin').controller('StatListenerCtrl', function ($scope, $http, API_SERVER_ENDPOINT, $location) {
  var query = "";
  if (($location.search()).from && ($location.search()).to) {
    query = "?from=" + ($location.search()).from + "&to=" + ($location.search()).to;
  }
  $http.get(API_SERVER_ENDPOINT + "/api/v1/stat/listener" + query).success(function (data) {
    $scope.listeners = data;
  });
});
