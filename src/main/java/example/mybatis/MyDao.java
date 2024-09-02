package example.mybatis;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MyDao {

    //[1] 등록
    int save(UserDto userDto);

    //[1] 추상메소드
    List<UserDto> findAll();

    int update(UserDto userDto);

    int delete(int id);

    UserDto findById(int id); // id로 UserDto ��기

}
