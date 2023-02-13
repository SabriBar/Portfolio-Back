package com.portfolio.portfolioback.Repository;

import com.portfolio.portfolioback.Entity.Skills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSkills extends JpaRepository<Skills, Integer> {

    public Optional<Skills> findBySkillUrl(String skillUrl);

    public boolean existsBySkillUrl(String skillUrl);

}
