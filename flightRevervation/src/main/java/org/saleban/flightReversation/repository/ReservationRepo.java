package org.saleban.flightReversation.repository;

import org.saleban.flightReversation.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepo extends JpaRepository<Reservation, Long> { }
