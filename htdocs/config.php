<?php

$server = "localhost";
$username = "root";
$password = "Shiku270305";
$database = "HMS";

$conn = mysqli_connect($server,$username,$password,$database);

if(!$conn){
    die("<script>alert('connection Failed.')</script>");
} ?>