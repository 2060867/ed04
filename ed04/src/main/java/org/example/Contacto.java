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
class Contacto {
    private String name;
    private List<String> phones;

    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    public String getName() {
        return this.name;
    }

    public List<String> getPhones() {
        return this.phones;
    }
}