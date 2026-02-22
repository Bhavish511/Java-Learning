import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) {

        /*
        import packages
        load and register
        create connection
        create statement
        execute statement
        process the results
        close
        */

        // Load the drivers (Optional step)
//        try {
//            Class.forName("org.postgresql.Driver");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pss = "root";
        String query = "select sname from student where sid = 1";

//        String query1 = "select * from student";
        String query1 = "insert into student values (6, 48, 'John')";
        String query2 = "update student set sname='Max' where sid=6";
        String query3 = "delete from student where sid=6";

        Connection con;
        ResultSet rs;
        try {
            con = DriverManager.getConnection(url, uname, pss);
            System.out.println("Connection Established");
        } catch (SQLException e) {
            System.out.println("Connection Failed");
            throw new RuntimeException(e);
        }
        Statement st;

        // Problems with statement:
        // sql injection
        int sid =102;
        String sname = "Karl";
        int marks = 98;
//        String query4 = "insert into student values (sid,marks,sname)";
//        String query4 = "insert into student values (" + sid +", " + marks + ",'" + sname + "')";
        // Transform with help of Prepared Statements
        String query4 = "insert into student values (?,?,?)";
        PreparedStatement pst;


        try {
//            st = con.createStatement();

//            rs = st.executeQuery(query);
//            System.out.println(rs.next());
//
//
//            // pass column name or number
//            System.out.println(rs.getString("sname"));
////            System.out.println(rs.getString(2));
//            rs = st.executeQuery(query1);
//            while (rs.next()){
//                System.out.print(rs.getInt(1)+ " - ");
//                System.out.print(rs.getInt(2)+ " - ");
//                System.out.print(rs.getString(3));
//                System.out.println();
//
                pst = con.prepareStatement(query4);
                pst.setInt(1,sid);
                pst.setInt(2,marks);
                pst.setString(3,sname);
//            }
//            st.execute();
            pst.execute();

//            System.out.println(status);
            con.close();
            System.out.println("Connection Closed");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
