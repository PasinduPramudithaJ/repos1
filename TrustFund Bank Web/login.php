<?php
session_start(); // Start session to persist login state

$servername = "localhost"; // Replace with your server name
$username = "root"; // Replace with your database username
$password = ""; // Replace with your database password
$dbname = "registration"; // Replace with your database name

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $username = $conn->real_escape_string($_POST['username']);
    $password = $conn->real_escape_string($_POST['password']);

    // Prepare SQL statement to fetch user by username
    $stmt = $conn->prepare("SELECT * FROM users WHERE username = ?");
    $stmt->bind_param("s", $username);
    $stmt->execute();
    $result = $stmt->get_result();

    if ($result->num_rows == 1) {
        $row = $result->fetch_assoc();
        $stored_password = $row['password']; // Retrieve stored password from database

        // Compare entered password with stored password
        if ($password == $stored_password) {
            // Password is correct, start a session
            $_SESSION['username'] = $username;
            header("Location:Bankpage.html"); // Redirect to home page after successful login
            exit();
        } else {
            // Incorrect password
            echo "<script>alert('Incorrect password. Please try again.');
            
                
                setTimeout(function() {
                    window.location.href = 'Homepage.html';
                }, 2000);
              </script>";
        }
    } else {
        // Username not found
        echo "<script>alert('Username not found. Please try again.');
        setTimeout(function() {
                    window.location.href = 'Homepage.html';
                }, 2000);</script>";
    }

    $stmt->close();
}

$conn->close();
?>
