package org.saleban.flightReversation.repository;

import org.saleban.flightReversation.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
