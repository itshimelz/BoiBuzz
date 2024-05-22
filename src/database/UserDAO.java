package database;

import java.sql.*;

public class UserDAO {

    private Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/boibuzzdb";
        String user = "root";
        String password = "himel1234";
        return DriverManager.getConnection(url, user, password);
    }

    public void addUser(String firstName, String lastName, String gender, String email, String password) throws SQLException {
        String sql = "INSERT INTO users (first_name, last_name, gender, email, password) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, firstName);
            pstmt.setString(2, lastName);
            pstmt.setString(3, gender);
            pstmt.setString(4, email);
            pstmt.setString(5, password); // Consider using password hashing
            pstmt.executeUpdate();
        }
    }

    public User getUserByEmail(String email) throws SQLException {
        String sql = "SELECT * FROM users WHERE email = ?";
        User user = null;

        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, email);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                user = new User();
                user.setId(rs.getInt("id"));
                user.setFirstName(rs.getString("first_name"));
                user.setLastName(rs.getString("last_name"));
                user.setGender(rs.getString("gender"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
            }
        }
        return user;
    }

    public boolean checkUserCredentials(String email, String password) throws SQLException {
        String sql = "SELECT id FROM users WHERE email = ? AND password = ?";
        boolean isValidUser = false;

        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, email);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            isValidUser = rs.next();
        }
        return isValidUser;
    }

    public boolean checkUserExist(String email) throws SQLException {
        String sql = "SELECT id FROM users WHERE email = ?";
        boolean userExist = false;

        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, email);
            ResultSet rs = pstmt.executeQuery();
            userExist = rs.next();
        }
        return userExist;
    }
}

// User model class
class User {

    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
