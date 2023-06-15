package org.daisy.DemoRelationship;

import org.daisy.DemoRelationship.model.Address;
import org.daisy.DemoRelationship.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		// creating departments
//		Department dep = new Department();
//		dep.setDname("IT");
//
//		Department dep2 = new Department();
//		dep2.setDname("HR");
//
//		// creating teacher
//		Teacher t1 = new Teacher();
//		t1.setDep(dep);
//		t1.setSalary("1000");
//		t1.setTeachername("MHaseeb");
//
//		Teacher t2 = new Teacher();
//		t2.setDep(dep);
//		t2.setSalary("2220");
//		t2.setTeachername("Shahparan");
//
//		Teacher t3 = new Teacher();
//		t3.setDep(dep);
//		t3.setSalary("30000");
//		t3.setTeachername("James");
//
//		Teacher t4 = new Teacher();
//		t4.setDep(dep2);
//		t4.setSalary("40000");
//		t4.setTeachername("Joseph");
//		// Storing Departments in database
//		session.persist(dep);
//		session.persist(dep2);
//		// Storing teachers in database
//		session.persist(t1);
//		session.persist(t2);
//		session.persist(t3);
//		session.persist(t4);
//		t.commit();

//		Teacher t1 = new Teacher();
//		t1.setTeachername("Haseeb");
//		t1.setSalary("100");
//
//		Teacher t2 = new Teacher();
//		t2.setTeachername("Jenny Finch");
//		t2.setSalary("10000");
//
//		Teacher t3 = new Teacher();
//		t3.setTeachername("James");
//		t3.setSalary("25000");
//
//		Teacher t4 = new Teacher();
//		t4.setTeachername("SID ROSE");
//		t4.setSalary("3000");
//
//		Teacher t5 = new Teacher();
//		t5.setSalary("200");
//		t5.setTeachername("Ali");
//
//		// Add teacher entity object to the list
//		List<Teacher> teachlist = new ArrayList();
//		teachlist.add(t1);
//		teachlist.add(t2);
//		teachlist.add(t3);
//		teachlist.add(t4);
//		teachlist.add(t5);
//		session.persist(t1);
//		session.persist(t2);
//		session.persist(t3);
//		session.persist(t4);
//		session.persist(t5);
//
//		// Creating Department
//		Department department = new Department();
//		department.setDname("Development");
//		department.setTeacherList(teachlist);
//
//		// Storing Department
//		session.persist(department);
//		t.commit();

		System.out.println("Maven + Hibernate + SQL One to One Mapping Annotations");

		Address a1 = new Address();
		a1.setCity("nyc");
		a1.setState("NY");
		a1.setStreet("27th street");
		a1.setZipcode(11103);

		Address a2 = new Address();
		a2.setCity("Bufflo");
		a2.setState("NY");
		a2.setStreet("28th street");
		a2.setZipcode(15803);

		Person p1 = new Person();
		p1.setAge(25);
		p1.setEmail("e.jon@email.com");
		p1.setName("elbert Adam");
		p1.setAdress(a1);

		Person p2 = new Person();
		p2.setAge(45);
		p2.setEmail("ch.fink@email.com");
		p2.setName("Christ fink");
		p2.setAdress(a2);

		session.persist(p1);
		session.persist(p2);
		session.persist(a1);
		session.persist(a2);
		t.commit();

	}

}
