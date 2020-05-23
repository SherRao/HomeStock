import { MongoClient } from "mongodb";
import { ObjectID } from "mongodb";
const dbname = "crud_mongodb";
const url = "mongodb://localhost:27017";
const mongoOptions = {useNewUrlParser : true};

const state = {
    db:null
};

const connect = function(cb){
    if (state.db) {
        cb ();
    } else {
        MongoClient.connect(url,mongoOptions,function(err,client) {
            if (err) {
                cb (err);
            } else {
                state.db = client.db(dbname);
                cb();
            }
        });
    }
}

const getPrimarykey = function(_id) {
    return ObjectID(_id);
}

const getDB = function () {
    return state.db;
}

export default {getDB, connect, getPrimarykey}