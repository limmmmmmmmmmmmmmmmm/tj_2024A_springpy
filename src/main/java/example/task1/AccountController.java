package example.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired private AccountService accountService;

    @PostMapping("/save")
    public int saveAccount(AccountDto accountDto){
        return accountService.saveAccount(accountDto);
    }
    @GetMapping("/findAll")
    public List<AccountDto> findAllAccounts(){
        return accountService.findAllAccounts();
    }
    @PutMapping("/update")
    public int updateAccount(AccountDto accountDto){
        return accountService.updateAccount(accountDto);
    }
    @DeleteMapping("/delete")
    public int deleteAccount(int number){
        return accountService.deleteAccount(number);
    }

}
