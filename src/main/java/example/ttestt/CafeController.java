package example.ttestt;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cafe")
public class CafeController {

    @Autowired CafeService cafeService;

    @PostMapping("/create")
    public boolean cCreate(CafeDto cafeDto){
        System.out.println("CafeController");
        return cafeService.cCreate(cafeDto);
    }

    @GetMapping("/allRead")
    public List<CafeDto> cRead(){
        return cafeService.cRead();
    }

    @PutMapping("/update")
    public boolean cUpdate(CafeDto cafeDto){
        System.out.println("CafeController.cUpdate");
        return cafeService.cUpdate(cafeDto);
    }

    @DeleteMapping("/delete")
    public boolean cDelete(CafeDto cafeDto){
        System.out.println("CafeController.cDelete");
        return cafeService.cDelete(cafeDto);
    }

}
