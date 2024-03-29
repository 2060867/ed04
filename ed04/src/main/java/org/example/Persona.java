package org.example;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Pedro Galera
 * @version 1.0
 * @since 09/03/2024
 * @see Main
 * @see Agenda
 */
class Persona {
    private String name;
    private List<String> phones;

    public Persona(String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}