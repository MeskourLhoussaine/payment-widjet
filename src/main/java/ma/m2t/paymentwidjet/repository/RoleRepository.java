package ma.m2t.paymentwidjet.repository;

import ma.m2t.paymentwidjet.models.ERole;
import ma.m2t.paymentwidjet.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
