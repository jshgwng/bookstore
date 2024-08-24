package com.joshuaogwang.bookstore.repository;

import com.joshuaogwang.bookstore.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Long> {
    @Query("SELECT T FROM TOKEN T INNER JOIN USER U ON T.USER.ID = U.ID WHERE U.ID = :ID AND (T.EXPIRED = FALSE OR T.REVOKED = FALSE")
    List<Token> findAllValidTokenByUser(Long id);

    Optional<Token> findByToken(String token);
}
