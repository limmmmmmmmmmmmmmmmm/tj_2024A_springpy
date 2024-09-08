package example.ttestt;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CafeDao {

    boolean cCreate(CafeDto cafeDto);

    List<CafeDto> cRead();

    boolean cUpdate(CafeDto cafeDto);

    boolean cDelete(CafeDto cafeDto);
}
