'use strict';

angular.module('tilosAdmin').config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/login', {
            templateUrl: 'views/login.html',
            controller: 'LoginCtrl'
        }
    );
    $routeProvider.when('/password_reminder', {
            templateUrl: 'views/reminder.html',
            controller: 'PasswordReminderCtrl'
        }
    );

}])
;
angular.module("tilosAdmin").controller("PasswordReminderCtrl", function ($scope, $http) {
    $scope.reminderdata = {};

    $scope.reminder = function () {


        $http.post(server + '/api/v0/auth/password_reset', $scope.reminderdata).success(function (data) {
            if (data.success) {
                $scope.message = data.message;
            } else {
                $scope.remindererror = "Password reset error";
            }
        }).error(function (data) {
            if (data.error) {
                $scope.remindererror = data.error;
            } else {
                $scope.reminderror = "Unknown error"
            }
        });
    };
});
angular.module('tilosAdmin')
    .controller('LoginCtrl', function ($rootScope, $scope, $location, API_SERVER_ENDPOINT, $http, localStorageService) {
        $scope.logindata = {};
        $scope.login = function () {
            var data = {};
            $http.post(server + '/api/v1/auth/login', $scope.logindata).success(function (data) {
                localStorageService.set("jwt", data);
                $scope.loginerror = "";
                $http.get(server + '/api/v1/user/me').success(function (data) {
                    $rootScope.user = data;
                    $location.path('/index');
                });

            }).error(function (data) {
                $scope.loginerror = "Login error";
                localStorageService.remove('jwt');
            });

        }


    }
);