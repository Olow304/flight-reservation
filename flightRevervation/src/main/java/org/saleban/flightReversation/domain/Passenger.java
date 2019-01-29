package org.saleban.flightReversation.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Passenger extends AbstractEntity{

    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String phone;


}
