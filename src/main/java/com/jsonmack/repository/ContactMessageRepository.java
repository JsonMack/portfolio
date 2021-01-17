package com.jsonmack.repository;

import com.jsonmack.entity.ContactMessage;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Jason MacKeigan
 */
public interface ContactMessageRepository extends JpaRepository<ContactMessage, Long> {



}
