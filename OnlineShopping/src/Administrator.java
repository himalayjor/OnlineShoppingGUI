
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vaibhavatul47
 */
public class Administrator extends Person {

    @Override
    boolean isValidUser() {
        if (uName.equals("") || pass.equals("") || uName.equals(" username")) {
            JOptionPane.showMessageDialog(null, "Some fields are Empty!", "Oops!", 1);
            return false;
        }
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
		
        try {
                Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", database.uname, database.password);
                String query = "select * from admin_table";
                Statement st = connection.createStatement();
                ResultSet rs = st.executeQuery(query);

                int flag = 1;
                while (rs.next() && flag == 1) {
                        if (uName.equals(rs.getString(1)) && pass.equals(rs.getString(4))) {
                            flag = 2;
                            break;
                        }
                        else if (uName.equals(rs.getString(1)) && !pass.equals(rs.getString(4))) {
                            flag = 3;
                            break;
                        }
                }
                if (flag == 2) {
                    name = rs.getString(2);
		    mobileno = rs.getString(3);
		    squen = rs.getString(5);
		    sans = rs.getString(6);
		    city = rs.getString(7);
                    connection.close();
                    connection.close();
                    return true;
                }
                else if (flag == 3) {
                    //JOptionPane.showMessageDialog(null, "Invalid Username");
                    JOptionPane.showMessageDialog(null, "Invalid Username/Password", " Error", JOptionPane.DEFAULT_OPTION);
                    connection.close();
                    return false;
                }
                else {
                    JOptionPane.showMessageDialog(null, "Please, Signup First");
                    connection.close();
                    return false;
                }
                
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "SQL Exception");
                Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    @Override
    boolean knowsSecurityAns(int SecQues, String SecAns) {
        try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
	}
        
	int flag = 1;
        try {
                Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", database.uname, database.password);
                String query = "select * from admin_table";
                Statement st = connection.createStatement();
                ResultSet rs = st.executeQuery(query);

                    
                while (rs.next()) {
                        if (uName.equals(rs.getString(1)) && SecQues == rs.getInt(5) && SecAns.equals(rs.getString(6))) {
                            flag = 2;
                            break;
                        }
                }
                    
                connection.close();
        } catch (SQLException ex) {
                    Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
	}
        if (flag == 2) {
            return true;
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid Email ID and Security Answer combination", "User Error", JOptionPane.DEFAULT_OPTION);
            return false;
        }
		
    }
    @Override
    void updatePassword(String pwd) {
        try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
		Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
	}
        
        try {
                Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", database.uname, database.password);
                
                PreparedStatement pstmt;
                pstmt = connection.prepareStatement("UPDATE ADMIN_TABLE SET CUSTOMER_PWD = ? WHERE CUSTOMER_ID = ?");
                pstmt.setString(1, pwd);
                pstmt.setString(2, uName);
                pstmt.executeUpdate();
                connection.commit();
            
                connection.close();
        } catch (SQLException ex) {
                    Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
	}
    }
    
}
