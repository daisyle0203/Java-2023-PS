package org.daisy.DemoRelationship;

import java.util.HashSet;
import java.util.Set;

import org.daisy.DemoRelationship.model.Cohort;
import org.daisy.DemoRelationship.model.Teacher;
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

		// ----Create Cohort/class Entity set one----
		Cohort Class1 = new Cohort("Java Developer", "14 weeks");
		Cohort Class2 = new Cohort("FullStack Developer", "7 Weeks");
		Cohort Class3 = new Cohort("Python Developer", "12 Weeks");
		// ------ Store Cohort / Class --------
		session.persist(Class1);
		session.persist(Class2);
		session.persist(Class3);

		// -----Create Cohort one / Class one --------
		Set<Cohort> ClassSet1 = new HashSet<Cohort>();
		ClassSet1.add(Class1);
		ClassSet1.add(Class2);
		ClassSet1.add(Class3);
		// -----Create Cohort two / Class two --------
		Set<Cohort> ClassSet2 = new HashSet<Cohort>();
		ClassSet2.add(Class2);
		ClassSet2.add(Class3);
		ClassSet2.add(Class1);
		// -----Create Cohort Three / Class Three --------
		Set<Cohort> ClassSet3 = new HashSet<Cohort>();
		ClassSet3.add(Class3);
		ClassSet3.add(Class1);
		ClassSet3.add(Class2);

		Teacher t1 = new Teacher("100", "Haseeb", ClassSet1);
		Teacher t2 = new Teacher("200", "Jenny", ClassSet2);
		Teacher t3 = new Teacher("200", "Charlie", ClassSet3);

		session.persist(t1);
		session.persist(t2);
		session.persist(t3);
		t.commit();

	}

}
