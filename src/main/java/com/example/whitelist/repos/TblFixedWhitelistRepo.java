package com.example.whitelist.repos;

import com.example.whitelist.models.TblFixedWhitelist;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TblFixedWhitelistRepo extends JpaRepository<TblFixedWhitelist, Long> {
  
}
