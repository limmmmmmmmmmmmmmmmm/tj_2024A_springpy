package example.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class MyService {

    @Autowired private MyDao myDao;

    public int save(UserDto userDto){
        return myDao.save(userDto);
    }

     public List<UserDto> findAll(){
        return myDao.findAll();
    }

    public UserDto findById(int id){
        return myDao.findById(id);
    }

    public int update(UserDto userDto){
        return myDao.update(userDto);
    }

    public int delete(int id){
        return myDao.delete(id);
    }
}
