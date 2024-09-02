package example.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mybatis")
public class MyController {
    @Autowired private MyService myService;

    @PostMapping("/save")
    public int save(UserDto userDto){
        return myService.save(userDto);
    }

    @GetMapping("/findAll")
    public List<UserDto> findAll(){
        return myService.findAll();
    }

    @GetMapping("/findById")
    public UserDto findById(int id){
        return myService.findById(id);
    }

    @PutMapping("/update")
    public int update(UserDto userDto){
        return myService.update(userDto);
    }

    @DeleteMapping("/delete")
    public int delete(int id){
        return myService.delete(id);
    }


}
