'use strict';

// Declare app level module which depends on views, and components
angular.module('myApp', [])


    .controller('View1Ctrl', function ($scope, $http) {
        $scope.PlaceList = new Array();
        $scope.mostRecentReview;
        $scope.getLocation = function () {
            var placeEntered = document.getElementById("txt_placeName").value;
            var searchQuery = document.getElementById("txt_searchFilter").value;
            if (placeEntered != null && placeEntered != "" && searchQuery != null && searchQuery != "") {
                document.getElementById('div_ReviewList').style.display = 'none';
                //This is the API that gives the list of venues based on the place and search query.
                var handler = $http.get("https://home.openweathermap.org/api_keys" +
                    "?client_id=1d25203175754ccb8aad48a4d377db18" +
                    "&client_secret=1d25203175754ccb8aad48a4d377db18" +
                    "&v=20160215&limit=5" +
                    "&near=" + placeEntered +
                    "&query=" + searchQuery);
                handler.success(function (data) {


                })
                handler.error(function (data) {
                    alert("There was some error processing your request. Please try after some time.");
                });
            }
        }
        $scope.getReviews = function (placeSelected) {
            if (placeSelected != null) {
                //This is the API call being made to get the reviews(tips) for the selected place or venue.
                var handler = $http.get("https://home.openweathermap.org/api_keys" + placeSelected.id + "/tips" +
                    "?sort=recent" +
                    "&client_id=1d25203175754ccb8aad48a4d377db18" +
                    "&client_secret=1d25203175754ccb8aad48a4d377db18" +
                    "&limit=5");
                handler.success(function (result) {
					console.log(result);
                    if (result != null && result.response != null && result.response.tips != null &&
                        result.response.tips.items != null && result.response.tips.count != 0) {
                        $scope.showt=true;
                        $scope.shows=false;
                        $scope.mostRecentReview = result.response.tips.items[0];
						console.log($scope.mostRecentReview);


                            if(data!=null && data.docSentiment!=null)
                            {
                                $scope.ReviewWithSentiment = {"reviewText" : $scope.mostRecentReview.text,
                                                            "sentiment":data.docSentiment.type,
                                                             "score":data.docSentiment.score  };
                                document.getElementById('div_ReviewList').style.display = 'block';
                            }
                        })
                    }
					else
					{
						$scope.showt=false;
                        $scope.shows=true;
                        $scope.noText="No review";
					}
                })
                handler.error(function (result) {
                    alert("There was some error processing your request. Please try after some time.")
                })
            }

        }

    });
