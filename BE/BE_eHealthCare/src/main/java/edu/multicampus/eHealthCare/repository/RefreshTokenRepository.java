package edu.multicampus.eHealthCare.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import edu.multicampus.eHealthCare.model.RefreshToken;
import edu.multicampus.eHealthCare.model.User;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long>{
	@Override
    Optional<RefreshToken> findById(Long id);
    Optional<RefreshToken> findByToken(String token);
	int deleteByUser(User user);
}
