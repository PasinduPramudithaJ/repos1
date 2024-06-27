<?php
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
    // Escape user inputs for security
    $firstName = $conn->real_escape_string($_POST['first_name']);
    $lastName = $conn->real_escape_string($_POST['last_name']);
    $email = $conn->real_escape_string($_POST['email']);
    $phone = $conn->real_escape_string($_POST['phone']);
    $birthdate = $conn->real_escape_string($_POST['birthdate']);
    $gender = $conn->real_escape_string($_POST['gender']);
    $username = $conn->real_escape_string($_POST['username']);
    $password = $conn->real_escape_string($_POST['password']);
    $accountType = $conn->real_escape_string($_POST['account_type']);
    $rememberMe = isset($_POST['remember_me']) ? 1 : 0; // Checkbox handling

    // Prepare and bind SQL statement
    $stmt = $conn->prepare("INSERT INTO users (first_name, last_name, email, phone, birthdate, gender, username, password, account_type, remember_me) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
    $stmt->bind_param("sssssssssi", $firstName, $lastName, $email, $phone, $birthdate, $gender, $username, $password, $accountType, $rememberMe);

    if ($stmt->execute()) {
        // Registration successful
        echo "'Registration successful! Redirecting to the homepage...'<script>
                
                setTimeout(function() {
                    window.location.href = 'Homepage.html';
                }, 2000);
              </script>";
    } else {
        // Registration failed
        echo "<script>alert('Registration failed. Please try again.');</script>";
    }

    $stmt->close();
}

$conn->close();
?>
