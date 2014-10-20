/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

/**
 *
 * @author albert
 */
@Entity
@Table(name="UsuariRegistrat")

public class UsuariRegistrat {
    @Id String name;

    public UsuariRegistrat(String name) {
        this.name = name;
    }
    
}
