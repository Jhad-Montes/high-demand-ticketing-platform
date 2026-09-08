package com.jhadmontes.high_demand_ticketing_platform.repository;

import com.jhadmontes.high_demand_ticketing_platform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Data Access Object (DAO) for the User entity.
 * Provides out-of-the-box CRUD operations interacting with PostgreSQL.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Finds a user by their email address.
     * Essential for the login process to verify credentials.
     *
     * @param email The email to search for.
     * @return An Optional containing the User if found, or empty if not.
     */
    Optional<User> findByEmail(String email);

    /**
     * Checks if a user with the given email already exists in the database.
     * Useful for validation during the registration process.
     *
     * @param email The email to check.
     * @return True if the email exists, false otherwise.
     */
    boolean existsByEmail(String email);
}