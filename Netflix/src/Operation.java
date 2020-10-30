
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

//Database database = new Database();
public class Operation {
    
    
    
    Connection con = null;
    Statement sta = null;
    Statement sta2 = null;
    PreparedStatement psta= null;
    
    //filmgetir metoduyla list oluşturdum sorguyu yazarak her dönen veriyi dönerek aktardık
    public ArrayList<Film> FilmCome(){
        ArrayList<Film> list=new ArrayList<Film>();
        String sorgu="Select * from program";
        
        try {
            sta =con.createStatement();
            ResultSet rs = sta.executeQuery(sorgu);
        
            while(rs.next()){
                int id =rs.getInt("id");
                String adi=rs.getString("adi");
                String tipi=rs.getString("tipi");
                
                StringBuilder turu=new StringBuilder();
                psta =con.prepareStatement("select * from programtur join tur on tur.id=programtur.tur_id where program_id = ?");
                psta.setInt(1, id);
                System.out.println("psta");
                ResultSet rs2= psta.executeQuery();
                System.out.println(rs2);
                while(rs2.next()){
                    turu.append(rs2.getString("ad"));
                    turu.append(",");
                }
                
                
                list.add(new Film(id,adi,turu.toString(),tipi));
            }
            return list;
            
        } catch (SQLException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public boolean Login(String email,String password){
        //Sql sorgusu yapıyorum
        String sorgu="Select * from kullanici where email= ? and password=? "; //kurduğumuz sql bağlantısında var mı yok mu kontrolü
        try {
            PreparedStatement pstmt = con.prepareStatement(sorgu);
            pstmt.setString(1,email);
            pstmt.setString(2,password);
            
            ResultSet rs= pstmt.executeQuery();//dönecek sonucu tutmak
            
            return rs.next();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
                         
     
    }

    public Operation() {
        
        //url-> jdbc:mysql://host:port/db_name;id;password;
        
        String url= "jdbc:sqlite:data.sqlite";
        
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection(url);
            System.out.println("Veri tabanına bağlandı");        
             
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Driver Çalışmadı :/");
        } catch (SQLException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Connection çalışamadı :/");
        }
                
    }
    
    public static void main(String[] args){
        Operation op =new Operation();
    }
}
