package com.portfolio.portfolioback.Controller;

import com.portfolio.portfolioback.Dto.dtoProyecto;
import com.portfolio.portfolioback.Entity.Proyecto;
import com.portfolio.portfolioback.Security.Controller.Mensaje;
import com.portfolio.portfolioback.Service.SProyecto;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proyectos")
@CrossOrigin(origins = "https://portfolio-windows-95.web.app")
public class CProyecto {

    @Autowired
    SProyecto sProyecto;

    @GetMapping("/lista")
    public ResponseEntity<List<Proyecto>> list() {
        List<Proyecto> list = sProyecto.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Proyecto> getById(@PathVariable("id") int id) {
        if (!sProyecto.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }

        Proyecto proyecto = sProyecto.getOne(id).get();
        return new ResponseEntity(proyecto, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sProyecto.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        sProyecto.delet(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoProyecto dtoproyecto){
        if (StringUtils.isBlank(dtoproyecto.getNombreP()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if (sProyecto.existsByNombreP(dtoproyecto.getNombreP()))
            return new ResponseEntity(new Mensaje("Esa proyecto ya existe"), HttpStatus.BAD_REQUEST);

        Proyecto proyecto = new Proyecto(dtoproyecto.getNombreP(), dtoproyecto.getLinkP(), dtoproyecto.getDescripcionP(),dtoproyecto.getFechaP());
        sProyecto.save(proyecto);

        return new ResponseEntity(new Mensaje("Proyecto agregada exitosamente"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoProyecto dtoproyecto) {
        if (!sProyecto.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }

        if (sProyecto.existsByNombreP(dtoproyecto.getNombreP()) && sProyecto.getByNombreP(dtoproyecto.getNombreP()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("El nombre ya existe"), HttpStatus.BAD_REQUEST);
        }

        if (StringUtils.isBlank(dtoproyecto.getNombreP())) {
            return new ResponseEntity(new Mensaje("El campo no puede estar vacío"), HttpStatus.BAD_REQUEST);
        }

        Proyecto proyecto = sProyecto.getOne(id).get();

        proyecto.setNombreP(dtoproyecto.getNombreP());
        proyecto.setLinkP(dtoproyecto.getLinkP());
        proyecto.setDescripcionP(dtoproyecto.getDescripcionP());
        proyecto.setFechaP(dtoproyecto.getFechaP());
        
        sProyecto.save(proyecto);
        return new ResponseEntity(new Mensaje("Proyecto actualizado"), HttpStatus.OK);
    }
}
