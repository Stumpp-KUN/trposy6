import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner scan=new Scanner(System.in);
        int selection,assesNum,amount=0,costpk=0;

    database db=new database();
   db.getConnection();
        System.out.println("Выберите действие: 1-Собрать вам пк, 2-Найти комплектующие под ваши запросы, 3-Добавить комплектующее, 4-Удалить комплектующее");
        selection=scan.nextInt();
        switch (selection){
            case 1:{
                while(amount<3){
                    switch (amount){
                        case 0:{
                            System.out.println("Выберите фирму процессора: 1-amd, 2-intel");
                            int k=scan.nextInt();
                            switch (k){
                                case 1:{
                                    ArrayList<Integer> cost=db.getINFO(k);
                                    System.out.println("Выберите модель");
                                    int cpAMD=scan.nextInt();
                                    costpk+= cost.get(--cpAMD);
                                }
                                break;
                                case 2:{
                                    ArrayList<Integer> cost=db.getINFO(k);
                                    System.out.println("Выберите модель");
                                    int cpIntel=scan.nextInt();
                                    costpk+=cost.get(--cpIntel);
                                }
                                break;
                            }
                        }
                        break;
                        case 1:{
                            System.out.println("Выберите видеокарту 3-amd, 4-nvidia");
                            int g=scan.nextInt();
                            if(g==3){
                                ArrayList<Integer> cost=db.getINFO(g);
                                System.out.println("Выберите модель");
                                int vcAmd=scan.nextInt();
                                costpk+=cost.get(--vcAmd);
                            }
                            else if(g==4){
                                ArrayList<Integer> cost=db.getINFO(g);
                                System.out.println("Выберите модель");
                                int vcNvidia=scan.nextInt();
                                costpk+=cost.get(--vcNvidia);
                            }
                        }
                        break;
                        case 2:{
                            System.out.println("Выберите модель памяти 5-Model5, 6-ModelTEN");
                            int u=scan.nextInt();
                            switch (u){
                                case 5:{
                                    ArrayList<Integer> cost=db.getINFO(u);
                                    System.out.println("Выберите модель");
                                    int m5=scan.nextInt();
                                    costpk+=cost.get(--m5);
                                }
                                break;
                                case 6:{
                                    ArrayList<Integer> cost=db.getINFO(u);
                                    System.out.println("Выберите модель");
                                    int mT=scan.nextInt();
                                    costpk+=cost.get(--mT);
                                }
                                break;
                            }
                        }
                    }
                    amount++;
                }
                System.out.println("Ваш компьютер собран, цена составляет: "+costpk);
            }
            break;
            case 2:{
                System.out.println("Что бы вы хотели посмотреть? 1 - Процессоры, 2 - Память, 3 - Видеокарта");
                int kt=scan.nextInt();
                switch(kt){
                    case 1:{
                        System.out.println("Выберите компанию 1-AMD, 2-INTEL, и допишите к цифре характиристику по которой вы выбираете 1-вес, 2-цена");
                        int gg=scan.nextInt();
                        switch (gg){
                            case 11:{
                                System.out.println("Впишите средний вес");
                                int avgW=scan.nextInt();
                                System.out.println(db.getWeight(avgW,gg));
                            }
                            break;
                            case 12:{
                                System.out.println("Впишите среднию цену");
                                int avgC=scan.nextInt();
                                System.out.println(db.getCost(avgC,gg));
                            }
                            break;
                            case 21:{
                                System.out.println("Впишите средний веc");
                                int avgW=scan.nextInt();
                                System.out.println(db.getWeight(avgW,gg));
                            }
                            break;
                            case 22:{
                                System.out.println("Впишите среднюю цену");
                                int avgC=scan.nextInt();
                                System.out.println(db.getCost(avgC,gg));
                            }
                            break;
                        }
                    }
                    break;
                    case 2:{
                        System.out.println("Выберите модель 3-model5, 4-modelTEN, и по какой характеристике 1-вес 2-цена");
                        int kj=scan.nextInt();
                        switch (kj){
                            case 31:{
                                System.out.println("Впишите средний веc");
                                int avgW=scan.nextInt();
                                System.out.println(db.getWeight(avgW,kj));
                            }
                            break;
                            case 32:{
                                System.out.println("Впишите среднюю цену");
                                int avgC=scan.nextInt();
                                System.out.println(db.getCost(avgC,kj));
                            }
                            break;
                            case 41:{
                                System.out.println("Впишите средний веc!");
                                int avgW=scan.nextInt();
                                System.out.println(db.getWeight(avgW,kj));
                            }
                            break;
                            case 42:{
                                System.out.println("Впишите среднюю цену!");
                                int avgC=scan.nextInt();
                                System.out.println(db.getCost(avgC,kj));
                            }
                            break;
                        }
                    }
                    break;
                    case 3:{
                        System.out.println("Выберите компанию 5-AMD, 6-NVIDIA и характеристику 1-вес 2-цена");
                        int kj=scan.nextInt();
                        switch(kj){
                            case 51:{
                                System.out.println("Впишите средний веc");
                                int avgW=scan.nextInt();
                                System.out.println(db.getWeight(avgW,kj));
                            }
                            break;
                            case 52:{
                                System.out.println("Впишите среднюю цену");
                                int avgC=scan.nextInt();
                                System.out.println(db.getCost(avgC,kj));
                            }
                            break;
                            case 61:{
                                System.out.println("Впишите средний веc!");
                                int avgW=scan.nextInt();
                                System.out.println(db.getWeight(avgW,kj));
                            }
                            break;
                            case 62:{
                                System.out.println("Впишите среднюю цену!");
                                int avgC=scan.nextInt();
                                System.out.println(db.getCost(avgC,kj));
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            break;
            case 3:{
                System.out.println("Введите название таблицы: (1-cpuamd,2-cpuintel,3-memorymodel5,4-memorymodelten,5-videocardamd,6-videocardnvidia)");
                int tabl=scan.nextInt();
                System.out.println("Введите вес, имя, количество ядер, цену, айди");
                int weight=scan.nextInt();
                String name=scan.next();
                int amountofcores=scan.nextInt();
                int cost=scan.nextInt();
                int id=scan.nextInt();
                db.insertDB(weight,name,amountofcores,cost,id,tabl);
            }
            break;
            case 4:{
                System.out.println("Введите название таблицы: (1-cpuamd,2-cpuintel,3-memorymodel5,4-memorymodelten,5-videocardamd,6-videocardnvidia)");
                int tabl=scan.nextInt();
                System.out.println("Введите id");
                int id=scan.nextInt();
                db.dropDB(id,tabl);
            }
        }



    }
}
