
package com.portfolio.portfolioback.Service;

import com.portfolio.portfolioback.Entity.Skills;
import com.portfolio.portfolioback.Repository.RSkills;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SSkills {
    @Autowired
    RSkills rSkills;
    
    public List<Skills> list(){
        return rSkills.findAll();
    }
    
    public Optional<Skills> getOne(int id){
        return rSkills.findById(id);
    }
    
     public Optional<Skills> getBySkillUrl(String skillUrl){
        return rSkills.findBySkillUrl(skillUrl);
    }
    
    public void save(Skills skills){
        rSkills.save(skills);
    }
    
    public void delet(int id){
        rSkills.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rSkills.existsById(id);
    }
    
    public boolean existsBySkillUrl(String skillUrl){
    return rSkills.existsBySkillUrl(skillUrl);
}
    

}
