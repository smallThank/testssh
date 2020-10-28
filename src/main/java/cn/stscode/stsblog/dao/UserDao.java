package cn.stscode.stsblog.dao;

import cn.stscode.stsblog.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper
public interface UserDao extends JpaRepository<User , Integer> , JpaSpecificationExecutor<User> {

    //public abstract List<User> findUsers();
}
