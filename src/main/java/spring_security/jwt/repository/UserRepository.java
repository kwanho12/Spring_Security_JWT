package spring_security.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_security.jwt.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Boolean existsByUsername(String username);

    UserEntity findByUsername(String username);
}
