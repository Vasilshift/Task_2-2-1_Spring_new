package hiber.service;

import hiber.dao.UserDao;
import hiber.model.Car;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

   @Autowired
   private UserDao userDao;

   @Transactional
   @Override
   public void add(User user) {
      userDao.add(user);
   }

   @Transactional(readOnly = true)
   @Override
   public List<User> listUsers() {
      return userDao.listUsers();
   }

   @Transactional
   @Override
   void getUserByModelAndSeries() {

      return userDao.
      String HQL="FROM  User user LEFT OUTER JOIN FETCH addr.employee WHERE addr.addressId=:addrId";
      Address address = session.createQuery(HQL, Address.class).setParameter("addrId", 1).uniqueResult();
      System.out.println(address);
      System.out.println(address.getEmployee());

   }




}
