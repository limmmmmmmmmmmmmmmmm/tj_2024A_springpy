package example.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired private AccountDao accountDao;

    public int saveAccount(AccountDto accountDto){
        return accountDao.saveAccount(accountDto);
    }

    public List<AccountDto> findAllAccounts(){
        return accountDao.findAllAccounts();
    }

    public int updateAccount(AccountDto accountDto){
        return accountDao.updateAccount(accountDto);
    }
    public int deleteAccount(int number){
        return accountDao.deleteAccount(number);
    }
}
