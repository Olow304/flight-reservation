package org.saleban.flightReversation.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Flight extends AbstractEntity{
    private String flightNumber;

    private String operatingAirlines;

    private String departureCity;

    private String arrivalCity;

    private Date dateOfDeparture;

    private Timestamp estimatedDepartureTime;

}
