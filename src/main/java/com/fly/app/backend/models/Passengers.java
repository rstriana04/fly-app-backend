package com.fly.app.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Passengers {

    @Id
    @GeneratedValue
    private Long id;
    @OneToMany(mappedBy = "passengers")
    private List<Tickets> ticketsList;

    private String nombreCompleto;

    private String email;

    public Passengers() {
    }


    protected boolean canEqual(final Object other) {
        return other instanceof Passengers;
    }

    public Long getId() {
        return this.id;
    }

    @JsonIgnore
    public List<Tickets> getTicketsList() {
        return this.ticketsList;
    }

    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    public String getEmail() {
        return this.email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JsonIgnore
    public void setTicketsList(List<Tickets> ticketsList) {
        this.ticketsList = ticketsList;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Passengers)) return false;
        final Passengers other = (Passengers) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$ticketsList = this.getTicketsList();
        final Object other$ticketsList = other.getTicketsList();
        if (this$ticketsList == null ? other$ticketsList != null : !this$ticketsList.equals(other$ticketsList))
            return false;
        final Object this$nombreCompleto = this.getNombreCompleto();
        final Object other$nombreCompleto = other.getNombreCompleto();
        if (this$nombreCompleto == null ? other$nombreCompleto != null : !this$nombreCompleto.equals(other$nombreCompleto))
            return false;
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $ticketsList = this.getTicketsList();
        result = result * PRIME + ($ticketsList == null ? 43 : $ticketsList.hashCode());
        final Object $nombreCompleto = this.getNombreCompleto();
        result = result * PRIME + ($nombreCompleto == null ? 43 : $nombreCompleto.hashCode());
        final Object $email = this.getEmail();
        result = result * PRIME + ($email == null ? 43 : $email.hashCode());
        return result;
    }

    public String toString() {
        return "Passengers(id=" + this.getId() + ", ticketsList=" + this.getTicketsList() + ", nombreCompleto=" + this.getNombreCompleto() + ", email=" + this.getEmail() + ")";
    }
}
