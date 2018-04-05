package io.gary.bestshop.messaging.event.account;

import io.gary.bestshop.messaging.dto.AccountDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountCreatedEvent {

    AccountDto newAccount;
}
