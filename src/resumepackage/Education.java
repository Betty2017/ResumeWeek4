package resumepackage;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;

public class Education {
	private String degree; 
	private String institution; 
	private int year;
	
		
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	} 	
	
	public void addEdutoDB(int personID)
	{
		PreparedStatement stmt=null;
		String insertEduSQL = "insert into educationtable(degree,institution,year,personid) values(?,?,?,?)";
		ResultSet rs = null; 
			
		try{
			Class.forName("com.mysql.jdbc.Driver");
	        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/resume?"+ "user=root&assword=Password1");
			stmt = con.prepareStatement(insertEduSQL);
			stmt.setString(1,this.degree);
			stmt.setString(2,this.institution);
			stmt.setInt(3,this.year);
			stmt.setInt(3,personID);
			stmt.executeUpdate();
			
			stmt = con.prepareStatement(insertEduSQL);
			stmt.setString(1,this.getDegree());
			stmt.setString(2,this.getInstitution());
			stmt.setInt(3, personID);
			rs = stmt.executeQuery();
			rs.next();
				
		}
		catch(Exception e)
		{
			
		}
		finally{
			
		}
		
		System.out.println("Your job and duties successfully saved to the database");

		
	}
	
	
}
