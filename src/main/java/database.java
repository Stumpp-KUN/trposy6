import com.mysql.fabric.jdbc.FabricMySQLConnection;
import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;
import java.util.ArrayList;

public class database {

    private final String URL = "jdbc:mysql://localhost:3306/accessories";
    private final String LOGIN = "root";
    private final String password = "root";

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public ArrayList<Integer> getINFO(int x) throws SQLException {
        switch (x) {
            case 1: {
                ArrayList<Integer> cost=new ArrayList<>();
                int i = 0;
                connection = DriverManager.getConnection(URL, LOGIN, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from cpuamd");
                System.out.println("Цена    Название    Кол-во ядер     id продукта");
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt("cost") + "     " + resultSet.getString("name") + "        " + resultSet.getInt("amountofcore") + "           " + resultSet.getInt("id"));
                    cost.add( resultSet.getInt("cost"));
                    i++;
                }
                return cost;
            }
            case 2: {
                ArrayList<Integer> cost=new ArrayList<>();
                int i = 0;
                connection = DriverManager.getConnection(URL, LOGIN, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from cpuintel");
                System.out.println("Цена    Название    Кол-во ядер     id продукта");
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt("cost") + "     " + resultSet.getString("name") + "        " + resultSet.getInt("amountofcore") + "           " + resultSet.getInt("id"));
                    cost.add(resultSet.getInt("cost"));
                    i++;
                }
                return cost;
            }
            case 3: {
                ArrayList<Integer> cost=new ArrayList<>();
                int i = 0;
                connection = DriverManager.getConnection(URL, LOGIN, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from videocardamd");
                System.out.println("Цена    Название    Кол-во ядер     id продукта");
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt("cost") + "     " + resultSet.getString("name") + "        " + resultSet.getInt("amountofcore") + "           " + resultSet.getInt("id"));
                    cost.add(resultSet.getInt("cost"));
                    i++;
                }
                return cost;
            }
            case 4: {
                ArrayList<Integer> cost=new ArrayList<>();
                int i = 0;
                connection = DriverManager.getConnection(URL, LOGIN, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from videocardnvidia");
                System.out.println("Цена    Название    Кол-во ядер     id продукта");
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt("cost") + "     " + resultSet.getString("name") + "        " + resultSet.getInt("amountofcore") + "           " + resultSet.getInt("id"));
                    cost.add(resultSet.getInt("cost"));
                    i++;
                }
                return cost;
            }
            case 5: {
                ArrayList<Integer> cost=new ArrayList<>();
                int i = 0;
                connection = DriverManager.getConnection(URL, LOGIN, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from memorymodel5");
                System.out.println("Цена    Название    Кол-во ядер     id продукта");
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt("cost") + "     " + resultSet.getString("name") + "        " + resultSet.getInt("amountofcore") + "           " + resultSet.getInt("id"));
                    cost.add(resultSet.getInt("cost"));
                    i++;
                }
                return cost;
            }
            case 6: {
                ArrayList<Integer> cost=new ArrayList<>();
                int i = 0;
                connection = DriverManager.getConnection(URL, LOGIN, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from memorymodelten");
                System.out.println("Цена    Название    Кол-во ядер     id продукта");
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt("cost") + "     " + resultSet.getString("name") + "        " + resultSet.getInt("amountofcore") + "           " + resultSet.getInt("id"));
                    cost.add(resultSet.getInt("cost"));
                    i++;
                }
                return cost;

            }
        }
        return null;
    }

    public ArrayList<String> getWeight(int weight, int k) throws SQLException {
        connection = DriverManager.getConnection(URL, LOGIN, password);
        Statement statement = connection.createStatement();
        switch (k) {
            case 11: {
                ResultSet resultSet = statement.executeQuery("select * from cpuamd");
                ArrayList<String> rn = getA(resultSet, weight);
                return rn;
            }
            case 21: {
                ResultSet resultSet = statement.executeQuery("select * from cpuintel");
                ArrayList<String> rn=getA(resultSet,weight);
                return rn;
           }
            case 31:{
                ResultSet resultSet = statement.executeQuery("select * from memorymodel5");
                ArrayList<String> rn=getA(resultSet,weight);
                return rn;
            }
            case 41:{
                ResultSet resultSet = statement.executeQuery("select * from memorymodelten");
                ArrayList<String> rn=getA(resultSet,weight);
                return rn;
            }
            case 51:{
                ResultSet resultSet = statement.executeQuery("select * from videocardamd");
                ArrayList<String> rn=getA(resultSet,weight);
                return rn;
            }
            case 61:{
                ResultSet resultSet = statement.executeQuery("select * from videocardnvidia");
                ArrayList<String> rn=getA(resultSet,weight);
                return rn;
            }

            }

        return null;
    }


    public ArrayList<String> getCost(int avgC,int k) throws SQLException {
        connection = DriverManager.getConnection(URL, LOGIN, password);
        Statement statement = connection.createStatement();
       switch (k){
            case 12:{
                ResultSet resultSet=statement.executeQuery("select * from cpuamd");
                ArrayList<String> g=getB(resultSet,avgC);
                return g;
            }
           case 22:{
               ResultSet resultSet=statement.executeQuery("select * from cpuintel");
               ArrayList<String> g=getB(resultSet,avgC);
               return g;
           }
           case 32:{
               ResultSet resultSet=statement.executeQuery("select * from memorymodel5");
               ArrayList<String> g=getB(resultSet,avgC);
               return g;
           }
           case 42:{
               ResultSet resultSet=statement.executeQuery("select * from memorymodelten");
               ArrayList<String> g=getB(resultSet,avgC);
               return g;
           }
           case 52:{
               ResultSet resultSet=statement.executeQuery("select * from videocardamd");
               ArrayList<String> g=getB(resultSet,avgC);
               return g;
           }
           case 62:{
               ResultSet resultSet=statement.executeQuery("select * from videocardnvidia");
               ArrayList<String> g=getB(resultSet,avgC);
               return g;
           }
        }
        return null;
   }

    private ArrayList<String> getA(ResultSet resultSet, int weight) throws SQLException {
        ArrayList<Integer> weights = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> rnames = new ArrayList<>();
        int j = 0;
        while (resultSet.next()) {
            weights.add(resultSet.getInt("weight"));
            names.add(resultSet.getString("name"));
            if (weights.get(j)<weight) {
                rnames.add(names.get(j));
            }
            j++;
        }
        return rnames;
    }

    private ArrayList<String> getB(ResultSet resultSet,int cost) throws SQLException {
        int j=0;
        ArrayList<Integer> costs=new ArrayList<>();
        ArrayList<String> names=new ArrayList<>();
        ArrayList<String> rnames=new ArrayList<>();
        while(resultSet.next()){
            costs.add(resultSet.getInt("cost"));
            names.add(resultSet.getString("name"));
            if(costs.get(j)<cost)
                rnames.add(names.get(j));
            j++;
        }
        return rnames;
    }

    public void insertDB(int weight1,String name1,int amountofcore1,int cost1,int id1,int tabl) throws SQLException {
        connection = DriverManager.getConnection(URL, LOGIN, password);
        Statement statement = connection.createStatement();
        switch (tabl){
            case 1: {
                statement.executeUpdate("INSERT INTO `cpuamd` (weight,name,amountofcore,cost,id) VALUES ('" + weight1 + "','" + name1 + "','" + amountofcore1 + "'," + cost1 + ",'" + id1 + "')");
            }
                break;
            case 2: {
                statement.executeUpdate("INSERT INTO `cpuintel` (weight,name,amountofcore,cost,id) VALUES ('" + weight1 + "','" + name1 + "','" + amountofcore1 + "'," + cost1 + ",'" + id1 + "')");
            }
                break;
            case 3: {
                statement.executeUpdate("INSERT INTO `memorymodel5` (weight,name,amountofcore,cost,id) VALUES ('" + weight1 + "','" + name1 + "','" + amountofcore1 + "'," + cost1 + ",'" + id1 + "')");
            }
                break;
            case 4: {
                statement.executeUpdate("INSERT INTO `memorymodelten` (weight,name,amountofcore,cost,id) VALUES ('" + weight1 + "','" + name1 + "','" + amountofcore1 + "'," + cost1 + ",'" + id1 + "')");
            }
                break;
            case 5: {
                statement.executeUpdate("INSERT INTO `videocardamd` (weight,name,amountofcore,cost,id) VALUES ('" + weight1 + "','" + name1 + "','" + amountofcore1 + "'," + cost1 + ",'" + id1 + "')");
            }
                break;
            case 6: {
                statement.executeUpdate("INSERT INTO `videocardnvidia` (weight,name,amountofcore,cost,id) VALUES ('" + weight1 + "','" + name1 + "','" + amountofcore1 + "'," + cost1 + ",'" + id1 + "')");
            }
        }


        System.out.println("Значение было записано в базу данных");
    }
    public void dropDB(int idt,int tabl) throws SQLException {
        connection = DriverManager.getConnection(URL, LOGIN, password);
        Statement statement = connection.createStatement();
        switch (tabl) {
            case 1: {
                String sql="DELETE FROM `cpuamd` WHERE id=?";
                PreparedStatement statement1=connection.prepareStatement(sql);
                statement1.setInt(1,idt);
                statement1.executeUpdate();
                          }
            break;
            case 2: {
                String sql="DELETE FROM `cpuintel` WHERE id=?";
                PreparedStatement statement1=connection.prepareStatement(sql);
                statement1.setInt(1,idt);
                statement1.executeUpdate();
                      }
            break;
            case 3: {
                String sql="DELETE FROM `memorymodel5` WHERE id=?";
                PreparedStatement statement1=connection.prepareStatement(sql);
                statement1.setInt(1,idt);
                statement1.executeUpdate();}
            break;
            case 4: {
                String sql="DELETE FROM `memortmodelten` WHERE id=?";
                PreparedStatement statement1=connection.prepareStatement(sql);
                statement1.setInt(1,idt);
                statement1.executeUpdate();}
            break;
            case 5: {
                String sql="DELETE FROM `videocardamd` WHERE id=?";
                PreparedStatement statement1=connection.prepareStatement(sql);
                statement1.setInt(1,idt);
                statement1.executeUpdate();}
            break;
            case 6: {
                String sql="DELETE FROM `videocardnvidia` WHERE id=?";
                PreparedStatement statement1=connection.prepareStatement(sql);
                statement1.setInt(1,idt);
                statement1.executeUpdate();
                statement1.close();

            }
        }
    }


}
