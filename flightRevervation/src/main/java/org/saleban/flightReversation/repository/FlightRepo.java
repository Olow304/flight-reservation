package org.saleban.flightReversation.repository;

import org.saleban.flightReversation.domain.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FlightRepo extends JpaRepository<Flight, Long> {
    @Query("From Flight where departureCity=:departureCity and arrivalCity=:arrivalCity")
    List<Flight> findFlight(@Param("departureCity") String from,
                            @Param("arrivalCity") String to);

    @Query("from Flight where id=:id")
    List<Flight> findOne(@Param("id") Long id);

}
