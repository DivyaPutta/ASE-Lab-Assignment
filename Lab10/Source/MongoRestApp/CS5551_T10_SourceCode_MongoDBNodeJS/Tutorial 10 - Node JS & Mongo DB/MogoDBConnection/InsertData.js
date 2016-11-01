/**
 * Created by mnpw3d on 20/10/2016.
 */
var MongoClient = require('mongodb').MongoClient;
var assert = require('assert');
var url = 'mongodb://DivyaPutta:Divya123@ds051873.mlab.com:51873/testdb_2';
var insertDocument = function(db, callback) {
    db.collection('divya').insertOne( {
        "fname" : "Divya",
        "lname" : "Putta",
        "address":{
            "city":"Kansas City",
            "state":"Missouri"
        },
        "education" : {
            "university":"University of Missouri kansas city",
            "degree":"Master of Science",
            "major":"Computer Science"
        },
        "mail":"dpwz5@mail.umkc.edu"
    }, function(err, result) {
        assert.equal(err, null);
        console.log("Inserted a document into the restaurants collection.");
        callback();
    });
};
MongoClient.connect(url, function(err, db) {
    assert.equal(null, err);
    insertDocument(db, function() {
        db.close();
    });
});