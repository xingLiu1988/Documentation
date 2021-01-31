
const express = require('express'); //必备

const bodyParser = require('body-parser'); //必备

const ejs = require('ejs'); //可选

const mongoose = require('mongoose'); //必备


const app = express(); //必备

app.use(express.static('public')); //必备

app.set('view engine', 'ejs'); //可选

app.use(bodyParser.urlencoded({extended: true})); //必备

mongoose.connect("mongodb://localhost:27017/userDB",{useNewUrlParser: true}); //必备

//必备
const userSchema = new mongoose.Schema({
    email: String,
    password: String
});
//必备
const User = new mongoose.model('User', userSchema);


app.get('/', function(req, res){
    res.render('home');
})


//必备
app.listen(3000, function(){
    console.log('server started on port 3000');
})
