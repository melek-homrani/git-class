package tn.esprit.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.store.models.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
}
