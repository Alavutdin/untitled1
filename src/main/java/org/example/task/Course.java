package org.example.task;

import org.hibernate.Session;

import java.util.List;

public class Course {
    private static final String URL = "jdbc://localhost:3306";
    private static final String USER = "root";
    private static final String PASSWORD = "5";

    public static void con(){
//        try (Connection con = DriverManager.getConnection(URL,USER,PASSWORD)){
//            Statement statement = (Statement) con.createStatement();
//            statement.execute("DROP SCHEMA 'test' ");
//            statement.execute("CREATE SCHEMA 'test' ");
//            statement.execute("CREATE SCHEMA 'test'. 'Course' ('id' INT NOT NULL, 'title' VARCHAR(45) NULL, 'duration' VARCHAR(45) NULL, PRIMARY KEY('id')); ");
//            statement.execute("CREATE SCHEMA 'test'. 'Course' ('id','title','duration')\n"+
//                    "VALUES (1, 'Ivanov','Ivan');");
//
//
//            ResultSet set = statement.executeQuery("SELECT * FROM test.table;");
//            while (set.next()){
//                System.out.println(set.getString(3)+" "+set.getString(2)+" "+set.getInt(1));
//
//            }
//
//        }catch (SQLException e){
//            throw new RuntimeException();
//        };
//    }
//        final StandardServiceRegistry registry=new StandardServiceRegistryBuilder() {
//            .configure()
//            .build();
//
//            SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
//            Session session=sessionFactory.openSession();
//            Magic magic = new Magic(5, "Course");
//            session.getTransaction().commit();
//            session.close();
//
//        }
        Connector connector = new Connector();
//        Session session = connector.getSession();
//        Magic magic = new Magic(10,"Class");
//        session.save(magic);
//        session.close();
        try (Session session = connector.getSession()){
            List<Magic>classCourse = session.createQuery("FROM Magic",
                    Magic.class).getResultList();
            classCourse.forEach(b-> {
                System.out.println();
            });
        }catch (Exception e){
            e.printStackTrace();
        }


        }



}
