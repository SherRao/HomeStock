import express from "express";
import { json } from "body-parser";

const app = express (); //create a new server
app.use(json());
import path from "path";

import db from "./db";
const collection = "products"

db.connect(function () {
    if (err) {
        console.log('Unable to connect to the database.');
        process.exit(1);
    } else {
        app.listen(3000, function () {
            console.log('connected to database, listening to port 3000')
        })
    }
})


// const mongoClient = require('mongodb').MongoClient
// const url = "mongodb://localhost:27017"

// app.use(express.json())

// mongoClient.connect(url, function(err, db) {
//     if (err) {
//         console.log("Error while connecting with the MongoDB client.")
//     } else {
//         const myDb = db.db('myDb')
//     }
// })

// app.get("/", function(req, res){ //main local host
//     res.end("Welcome to my site!");
// }) //request = req, result = res

// app.get("/complement", function(req, res){
//     res.end("You look nice today");
// })

// app.listen(3000, function() {
//     console.log("listening on http://localhost:3000")
// })