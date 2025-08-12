package Jdbc_Code;

import java.sql.*;

public class CRUD_Operations {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String dbURL = "jdbc:mysql://127.0.0.1:3306/companydb";
        String username = "root";
        String password = "mysql@123SKSM";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(dbURL, username, password);

        Statement st = con.createStatement();

        // -------- CREATE TABLE IF NOT EXISTS --------
        String createTable = "CREATE TABLE IF NOT EXISTS employees ("
                + "id INT PRIMARY KEY,"
                + "name VARCHAR(50),"
                + "department VARCHAR(50),"
                + "salary DOUBLE"
                + ")";
        st.execute(createTable);
        System.out.println("✅ Checked/Created employees table.");

        // -------- INSERT EMPLOYEES --------
        String insertQuery = "INSERT INTO employees (id, name, department, salary) VALUES (?, ?, ?, ?)";
        PreparedStatement insertPS = con.prepareStatement(insertQuery);

        // Insert Alice
        insertPS.setInt(1, 101);
        insertPS.setString(2, "Alice");
        insertPS.setString(3, "HR");
        insertPS.setDouble(4, 50000);
        insertPS.executeUpdate();

        // Insert Bob
        insertPS.setInt(1, 102);
        insertPS.setString(2, "Bob");
        insertPS.setString(3, "IT");
        insertPS.setDouble(4, 65000);
        insertPS.executeUpdate();

        // Insert Charlie
        insertPS.setInt(1, 103);
        insertPS.setString(2, "Charlie");
        insertPS.setString(3, "Sales");
        insertPS.setDouble(4, 60000);
        insertPS.executeUpdate();

        insertPS.close();
        System.out.println("✅ Inserted 3 employees.");

        // -------- READ ALL EMPLOYEES --------
        System.out.println("\n📋 All Employees:");
        ResultSet rsAll = st.executeQuery("SELECT * FROM employees");
        while (rsAll.next()) {
            System.out.println(rsAll.getInt("id") + " | " + rsAll.getString("name") + " | "
                    + rsAll.getString("department") + " | " + rsAll.getDouble("salary"));
        }
        rsAll.close();

        // -------- READ BY ID = 102 --------
        System.out.println("\n🔍 Employee with ID = 102:");
        PreparedStatement psById = con.prepareStatement("SELECT * FROM employees WHERE id = ?");
        psById.setInt(1, 102);
        ResultSet rsById = psById.executeQuery();
        while (rsById.next()) {
            System.out.println(rsById.getInt("id") + " | " + rsById.getString("name") + " | "
                    + rsById.getString("department") + " | " + rsById.getDouble("salary"));
        }
        rsById.close();
        psById.close();

        // -------- READ BY DEPARTMENT = 'IT' --------
        System.out.println("\n🔍 Employees from IT Department:");
        PreparedStatement psByDept = con.prepareStatement("SELECT * FROM employees WHERE department = ?");
        psByDept.setString(1, "IT");
        ResultSet rsByDept = psByDept.executeQuery();
        while (rsByDept.next()) {
            System.out.println(rsByDept.getInt("id") + " | " + rsByDept.getString("name") + " | "
                    + rsByDept.getString("department") + " | " + rsByDept.getDouble("salary"));
        }
        rsByDept.close();
        psByDept.close();

        // -------- UPDATE SALARY (id=102) --------
        PreparedStatement updateSalary = con.prepareStatement("UPDATE employees SET salary = 70000 WHERE id = 102");
        int update1 = updateSalary.executeUpdate();
        System.out.println("\n✅ Updated salary of ID 102: " + update1 + " row(s).");
        updateSalary.close();

        // -------- UPDATE DEPARTMENT (Alice to Finance) --------
        PreparedStatement updateDept = con.prepareStatement("UPDATE employees SET department = 'Finance' WHERE name = 'Alice'");
        int update2 = updateDept.executeUpdate();
        System.out.println("✅ Updated department of Alice: " + update2 + " row(s).");
        updateDept.close();

        // -------- DELETE BY ID = 103 --------
        PreparedStatement deleteById = con.prepareStatement("DELETE FROM employees WHERE id = 103");
        int del1 = deleteById.executeUpdate();
        System.out.println("\n🗑️ Deleted employee with ID 103: " + del1 + " row(s).");
        deleteById.close();

        // -------- DELETE BY DEPARTMENT = 'Sales' --------
        PreparedStatement deleteByDept = con.prepareStatement("DELETE FROM employees WHERE department = 'Sales'");
        int del2 = deleteByDept.executeUpdate();
        System.out.println("🗑️ Deleted employees from Sales department: " + del2 + " row(s).");
        deleteByDept.close();

        // -------- CLOSE --------
        st.close();
        con.close();
        System.out.println("\n🔚 CRUD operations completed.");
    }
}
