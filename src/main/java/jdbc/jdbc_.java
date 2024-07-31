package jdbc;
import java.sql.*;
import java.util.Scanner;
public class jdbc_ {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*
		  1.IMPORT PACAKAGE
		  2.LOAD DRIVER & REGISTER DRIVER
		  3.CREATE CONNECTION
		  4.CREATE STATEMENT
		  5.EXECUTE STATEMENT
		  6.PROCESSS THE RESULT
		  7.CLOSE
		 		 		*/
		 
		
		// FETCH DATA FROM ONE
		
		
//		String url = "jdbc:postgresql://localhost:5432/Demo";
//		String pass = "********";
//		String uname = "postgres";
//		String sql ="Select s_name from student where s_id=1";
//		
//		
//		Class.forName("org.postgresql.Driver");
//		Connection con= DriverManager.getConnection(url, uname, pass);
//		
//		System.out.println("connection ready");
//		
//		Statement st = con.createStatement();
//		ResultSet res= st.executeQuery(sql);
//		
//		res.next();
//		
//		String rest =res.getString("s_name");
//		
//		System.out.println(rest);
//		
//		
//		
//		con.close();
//		System.out.println("Connection closed");
//		
																	//FETCH ALL DATA
		
		
		
//		String url = "jdbc:postgresql://localhost:5432/Demo";
//		String pass = "********";
//		String uname = "postgres";
//		String sql ="Select * from student";
//		
//		
//		Class.forName("org.postgresql.Driver");
//		Connection con= DriverManager.getConnection(url, uname, pass);
//		
//		System.out.println("connection ready");
//		
//		Statement st = con.createStatement();
//		ResultSet res= st.executeQuery(sql);
		
//		res.next();
//		
//		String rest =res.getString("s_name");
//		System.out.println( res.getString("s_name") );
//		
//		System.out.println(rest);
		
////		
//		while (res.next()) {
//			System.out.print(res.getInt(1)+" ");
//			System.out.print(res.getString(2)+" ");
//			System.out.println(res.getInt(3));
//		}
////		
////		
//		
//		con.close();
//		System.out.println("Connection closed");
//		
		
																	// INSERT DATA
//		String url ="jdbc:postgresql://localhost:5432/Demo";
//		String uname ="postgres";
//		String pass ="MIETHrayan123$";
//		String qury = "insert into student values(19 ,'ram',70)";
//		
//		
//		Class.forName("org.postgresql.Driver");
//		Connection con = DriverManager.getConnection(url, uname, pass);
//		System.out.println("connection approved");
//		Statement st = con.createStatement();
//	boolean sts=st.execute(qury);
//	System.out.println(sts);
//		
//		
//		
//		con.close();
//		System.out.println("connection closed");
		
		
		
																	//update
		
//		String url ="jdbc:postgresql://localhost:5432/Demo";
//		String uname ="postgres";
//		String pass ="*********";
//		String qury = "update student set marks =90 where s_id=1";
//		
//		
//		Class.forName("org.postgresql.Driver");
//		Connection con = DriverManager.getConnection(url, uname, pass);
//		System.out.println("connection approved");
//		Statement st = con.createStatement();
//		st.execute(qury);
////		System.out.println(sts);
//		
//		
//		
//		con.close();
//		System.out.println("connection closed");
		
													//delete
//		
//		
//		String url ="jdbc:postgresql://localhost:5432/Demo";
//		String uname ="postgres";
//		String pass ="**********";
//		String qury = "delete from student where s_id=12";
//		
//		
//		Class.forName("org.postgresql.Driver");
//		Connection con = DriverManager.getConnection(url, uname, pass);
//		System.out.println("connection approved");
//		Statement st = con.createStatement();
//		st.execute(qury);
////		System.out.println(sts);
//		
//		
//		
//		con.close();
//		System.out.println("connection closed");
		
													//preparedstatement
//		Scanner scanner =new Scanner(System.in);
//		int sid =scanner.nextInt();
//		String name=scanner.next();
//		int mrk =scanner.nextInt();
		
		
		int sid=191;
		String name="rameshuu";
		int mrk =89;
		
		
		
		
		
		String url ="jdbc:postgresql://localhost:5432/Demo";
		String uname ="postgres";
		String pass ="*******";
		String qury = "insert into student values (?,?,?)";
		
		
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		System.out.println("connection approved");
		
		PreparedStatement st = con.prepareStatement(qury);
		
		st.setInt(1, sid);
		st.setString(2, name);
		st.setInt(3, mrk);
		
		
		st.execute();
//		System.out.println(sts);
		
		
		
		con.close();
		System.out.println("connection closed");
		
		
		
		
		
		
		
//		int sid=105;
//		String sname="jasmi";
//		int marks =78;
//		
//		String url="jdbc:postgresql://localhost:5432/Demo";
//		String uname="postgres";
//		String pass="**********";
////		String qury="select * from student";
////		String qury="insert into student values(9,'john',48)";
//		String qury="select s_name from student where s_id =3";
////		String qury="insert into student values ("+sid+",'"+sname+"',"+marks+")";
////		String qury="insert into student values (?,?,?)";
//		
////		Class.forName("org.postgresql.Driver");
//		Connection con = DriverManager.getConnection(url,uname, pass);
//		System.out.println("connection Established");
//		Statement sts = con.createStatement();
//	ResultSet rt=sts.executeQuery(qury);
////		System.out.println(rt.next());
//	rt.next();
////	rt.next();
//	String res=rt.getString("s_name");
//	System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
		
//		PreparedStatement st =con.prepareStatement(qury);
//		st.setInt(1,sid);
//		st.setString(2,sname);
//		st.setInt(3,marks);
//					st.execute();
//boolean sts=		
//st.execute(qury);
//System.out.println(sts);
//		ResultSet rs =st.executeQuery(qury);
		
//		rs.next();
//		String str = rs.getString("s_name");
//		System.out.println("your name is:"+ str);
		
//		System.out.println(rs.next());
//		while(rs.next()) {
//			System.out.print(rs.getInt(1)+"-");
//			System.out.print(rs.getString(2)+"-");
//			System.out.println(rs.getInt(3));
//		}
//		
		
		
//		con.close();
//		System.out.println("Connection closed");
//		
		
		
	}

}
