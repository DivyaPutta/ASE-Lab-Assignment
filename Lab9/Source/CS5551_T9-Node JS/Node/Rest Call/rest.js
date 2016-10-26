var request = require('request');
request('https://developers.google.com/maps/web?client_id=1d25203175754ccb8aad48a4d377db18&client_secret=1d25203175754ccb8aad48a4d377db18&limit=1&near=Kansas&query=Temperature', function (error, response, body) {
    //Check for error
    if(error){
        return console.log('Error:', error);
    }

    //Check for right status code
    if(response.statusCode !== 200){
        return console.log('Invalid Status Code Returned:', response.statusCode);
    }
//	console.log(body);
    //All is good. Print the body
    body = JSON.parse(body);
	var place = body.response.places;
	var i;
	for(i=0;i<place.length;i++)
	{
		console.log(place[i].name);
	}
	
});