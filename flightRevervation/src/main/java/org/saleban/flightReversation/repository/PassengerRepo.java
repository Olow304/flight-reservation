package org.saleban.flightReversation.repository;

import org.saleban.flightReversation.domain.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepo extends JpaRepository<Passenger, Long> { }
