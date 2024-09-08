package example.ttestt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CafeService {

    @Autowired CafeDao cafeDao;

    public boolean cCreate(CafeDto cafeDto){
        System.out.println("CafeService");
        return cafeDao.cCreate(cafeDto);
    }

    public List<CafeDto> cRead(){
        return cafeDao.cRead();
    }

    public boolean cUpdate(CafeDto cafeDto){
        System.out.println("CafeService.cUpdate");
        return cafeDao.cUpdate(cafeDto);
    }

    public boolean cDelete(CafeDto cafeDto){
        System.out.println("CafeService.cDelete");
        return cafeDao.cDelete(cafeDto);
    }

}
