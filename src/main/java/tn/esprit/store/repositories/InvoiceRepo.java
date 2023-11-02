package tn.esprit.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.store.models.Invoice;

@Repository
public interface InvoiceRepo extends JpaRepository<Invoice, Long> {
}
