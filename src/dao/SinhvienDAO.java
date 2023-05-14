package dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Sinhvien;
import util.HibernateUtil;

public class SinhvienDAO implements DAO<Sinhvien> {

	@Override
	public List<Sinhvien> findALL() {
		// TODO Auto-generated method stub
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();
		try {
			List<Sinhvien> list=sess.createCriteria(Sinhvien.class).list();
			tx.commit();
			return list;
			
		} catch (Exception e) {
			if (tx!=null)
				tx.rollback();
		}
		return null;
	}

	@Override
	public Sinhvien findByid(Serializable id) {
		// TODO Auto-generated method stub
				SessionFactory sf=HibernateUtil.getSessionFactory();
				Session sess=sf.openSession();
				Transaction tx=sess.beginTransaction();
				try {
					Sinhvien c=(Sinhvien) sess.get(Sinhvien.class,id);
					tx.commit();
					return c;
					
				} catch (Exception e) {
					if (tx!=null)
						tx.rollback();
				}
				return null;
		
	}

	@Override
	public boolean delete(Serializable id) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();
		try {
			Sinhvien c=(Sinhvien) sess.get(Sinhvien.class,id);
			sess.delete(c);
			tx.commit();
			return true;
			
		} catch (Exception e) {
			if (tx!=null)
				tx.rollback();
		}
		return false;
	}

	@Override
	public boolean add(Sinhvien t) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();
		try {
			sess.save(t);
			tx.commit();
			return true;
			
		} catch (Exception e) {
			if (tx!=null)
				tx.rollback();
		}
		return false;
	}

	@Override
	public boolean update(Sinhvien t) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();
		try {
			sess.saveOrUpdate(t);
			tx.commit();
			return true;
			
		} catch (Exception e) {
			if (tx!=null)
				tx.rollback();
		}
		return false;
	}

}


