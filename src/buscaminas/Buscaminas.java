/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

import java.security.AccessControlContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 *
 * @author albert
 */
public class Buscaminas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SessionFactory factory = MyHibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        Partida t = new Partida(10);
        session.save(t);
        session.getTransaction().commit();
        
    }
    
}
