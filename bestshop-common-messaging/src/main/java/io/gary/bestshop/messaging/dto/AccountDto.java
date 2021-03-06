package io.gary.bestshop.messaging.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Wither;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Wither
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {

    private String username;

    private String email;

    private String nickname;

    private String firstName;

    private String lastName;

    private LocalDate birthDate;

    private String mobilePhone;

    private String status;

    private LocalDateTime createdAt;

    private LocalDateTime lastModifiedAt;

}
