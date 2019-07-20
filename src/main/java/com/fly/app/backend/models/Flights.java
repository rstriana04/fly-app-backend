package com.fly.app.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
public class Flights {
    @Id
    @GeneratedValue
    private Long id;
    private String descripcion;
    private Date fechaSalida;
    private String ciudadOrigen;
    private String ciudadDestino;

    @JsonIgnore
    @OneToMany(mappedBy = "flights")
//    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Tickets> ticketsList;

    public Flights() {
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Flights;
    }

    public Long getId() {
        return this.id;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public Date getFechaSalida() {
        return this.fechaSalida;
    }

    public String getCiudadOrigen() {
        return this.ciudadOrigen;
    }

    public String getCiudadDestino() {
        return this.ciudadDestino;
    }

    @JsonIgnore
    public List<Tickets> getTicketsList() {
        return this.ticketsList;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }


    @JsonIgnore
    public void setTicketsList(List<Tickets> ticketsList) {
        this.ticketsList = ticketsList;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Flights)) return false;
        final Flights other = (Flights) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$descripcion = this.getDescripcion();
        final Object other$descripcion = other.getDescripcion();
        if (this$descripcion == null ? other$descripcion != null : !this$descripcion.equals(other$descripcion))
            return false;
        final Object this$fechaSalida = this.getFechaSalida();
        final Object other$fechaSalida = other.getFechaSalida();
        if (this$fechaSalida == null ? other$fechaSalida != null : !this$fechaSalida.equals(other$fechaSalida))
            return false;
        final Object this$ciudadOrigen = this.getCiudadOrigen();
        final Object other$ciudadOrigen = other.getCiudadOrigen();
        if (this$ciudadOrigen == null ? other$ciudadOrigen != null : !this$ciudadOrigen.equals(other$ciudadOrigen))
            return false;
        final Object this$ciudadDestino = this.getCiudadDestino();
        final Object other$ciudadDestino = other.getCiudadDestino();
        if (this$ciudadDestino == null ? other$ciudadDestino != null : !this$ciudadDestino.equals(other$ciudadDestino))
            return false;
        final Object this$ticketsList = this.getTicketsList();
        final Object other$ticketsList = other.getTicketsList();
        if (this$ticketsList == null ? other$ticketsList != null : !this$ticketsList.equals(other$ticketsList))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $descripcion = this.getDescripcion();
        result = result * PRIME + ($descripcion == null ? 43 : $descripcion.hashCode());
        final Object $fechaSalida = this.getFechaSalida();
        result = result * PRIME + ($fechaSalida == null ? 43 : $fechaSalida.hashCode());
        final Object $ciudadOrigen = this.getCiudadOrigen();
        result = result * PRIME + ($ciudadOrigen == null ? 43 : $ciudadOrigen.hashCode());
        final Object $ciudadDestino = this.getCiudadDestino();
        result = result * PRIME + ($ciudadDestino == null ? 43 : $ciudadDestino.hashCode());
        final Object $ticketsList = this.getTicketsList();
        result = result * PRIME + ($ticketsList == null ? 43 : $ticketsList.hashCode());
        return result;
    }

    public String toString() {
        return "Flights(id=" + this.getId() + ", descripcion=" + this.getDescripcion() + ", fechaSalida=" + this.getFechaSalida() + ", ciudadOrigen=" + this.getCiudadOrigen() + ", ciudadDestino=" + this.getCiudadDestino() + ", ticketsList=" + this.getTicketsList() + ")";
    }
}
