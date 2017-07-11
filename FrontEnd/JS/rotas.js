app.config(function($routeProvider){

    $routeProvider

        .when('/home', {
            controller: 'homeController',
            controller: 'graficoController',
            templateUrl: 'VIEW/home.html'
        })
 
         .when('/login', {
            controller: 'loginController',
            templateUrl: 'VIEW/login.html'
        })
        
         .when('/cadastro', {
            controller: 'cadastroController',
            templateUrl: 'VIEW/cadastro.html'
        })

        .when('/analiserota', {
            controller: 'analiseRotaController',
            templateUrl: 'VIEW/analiseRota.html',
            resolve: {
                autenticado: function (authService) {
                    return authService.isAutenticadoPromise();
                }
            }
        })

        .when('/veiculo', {
            templateUrl: 'VIEW/veiculo.html'
        })
        .when('/cadastroOcorrencia', {
            templateUrl: 'VIEW/cadastroOcorrencia.html',
            controller: 'ocorrenciaController'
        })
        .when('/consultaOcorrencia', {
            templateUrl: 'VIEW/consultaOcorrencia.html',
            controller: 'ocorrenciaController'
        })

        .otherwise({redirectTo: '/home'});
});