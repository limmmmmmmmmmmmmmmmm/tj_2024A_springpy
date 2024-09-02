package example.task1;

import lombok.*;
import org.springframework.web.service.annotation.GetExchange;

@AllArgsConstructor@NoArgsConstructor
@Getter@Setter@ToString @Builder
public class AccountDto {
    private int number;
    private String info;
    private int money;
    private String date;
}
