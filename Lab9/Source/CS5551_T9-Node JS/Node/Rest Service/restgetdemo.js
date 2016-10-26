/**
 * Created by divya on 23/10/2016.
 */
var express = require('express');
var app = express();
var request = require('request');
app.get('/getPlace', function (req, res) {
    var result={
        'venue': []
    };

    request('https://developers.google.com/maps/web?client_id=1d25203175754ccb8aad48a4d377db18&client_secret=1d25203175754ccb8aad48a4d377db18&limit=1&near=Kansas&query=Temperature', function (error, response, body) {
        //Check for error
        if(error){
            return console.log('Error:', error);
        }

        //Check for right status code
        if(response.statusCode !== 200){
            return console.log('Invalid Status Code Returned:', response.statusCode);
        }
        //All is good. Print the body
        body = JSON.parse(body);
        var place = body.response.Places;
        for(var i=0;i<Place.length;i++)
        {
            result.place.push({'name': place[i].name,
                                'address':place[i].location.formattedAddress.toString()});
        }
        res.contentType('application/json');
        res.write(JSON.stringify(result));
        res.end();
    });
    console.log(result);


})

var server = app.listen(8081, function () {
    var host = server.address().address
    var port = server.address().port

    console.log("Example app listening at http://%s:%s", host, port)
})