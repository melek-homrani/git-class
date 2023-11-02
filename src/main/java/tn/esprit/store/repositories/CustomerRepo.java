package tn.esprit.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.store.models.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
