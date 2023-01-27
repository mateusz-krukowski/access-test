import java.sql.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java from motherfucking Microsoft Access B|");
        try{
            String url = "jdbc:ucanaccess://Z:/Thorlakur/_studia/AHE-2021-2025/semestr3/Systemy_baz_danych/lab/zjazd4.accdb";
            Connection connection = DriverManager.getConnection(url);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from person");
            while(resultSet.next()){
                for(int i = 1; i < resultSet.getMetaData().getColumnCount(); i++) {
                    System.out.print(resultSet.getString(i)+ " ");
                }
                System.out.println();
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
