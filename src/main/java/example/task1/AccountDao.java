package example.task1;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountDao {

    int saveAccount(AccountDto accountDto);

    List<AccountDto> findAllAccounts();

    int updateAccount(AccountDto accountDto);

    int deleteAccount(int number);
}
