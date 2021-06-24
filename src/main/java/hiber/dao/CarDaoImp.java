package hiber.dao;

import org.hibernate.SessionFactory;
import hiber.model.Car;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.TypedQuery;
import java.util.List;

public class CarDaoImp implements CarDao{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(Car car) {
        sessionFactory.getCurrentSession().save(car);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Car> listCars() {
        TypedQuery<Car> query = sessionFactory.getCurrentSession().createQuery("from Car");
        return query.getResultList();
    }
}
