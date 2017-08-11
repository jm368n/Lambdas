
package statictest;

public class TestStringBuilder {
    
    public static void main(String[] args) {
        StringBuilder con = new StringBuilder("Nombre,Nombre");
        StringBuffer con2;
        
        while(true)
        {
            con.append("Nombre").append("Nombre");
            System.out.println(con);
        }
    }
    
}
