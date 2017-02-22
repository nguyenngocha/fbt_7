package FramgiaProject.project01.model;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  
  
public class StoreData {  
public static void main(String[] args) {  
      
    //creating configuration object  
    Configuration cfg=new Configuration();  
    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
      
    //creating seession factory object  
    SessionFactory factory=cfg.buildSessionFactory();  
      
    //creating session object  
    Session session=factory.openSession();  
      
    //creating transaction object  
    Transaction t=session.beginTransaction();  
      User admin = new User();
      admin.setBanking_account("bank_account");
      admin.setEmail("admin@gmail.com");
      admin.setName("admin");
      admin.setPassword("123456");
      admin.setPhone_number("1234567890");
      admin.setRole(1);
    		  
//    Employee e1=new Employee();  
//    e1.setId(115);  
//    e1.setFirstName("sonoo");  
//    e1.setLastName("jaiswal");  
//      
//    session.persist(e1);//persisting the object  
      
    t.commit();//transaction is committed  
    session.close();  
      
    System.out.println("successfully saved");  
      
}  
}  
