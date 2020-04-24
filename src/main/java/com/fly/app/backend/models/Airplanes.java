package com.fly.app.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Airplanes {
    @Id
    @GeneratedValue
    private Long id;
    private String aerolinea;
    private String descripcion;
    private Integer cantidadMaximaPasajeros;


    @OneToMany(mappedBy = "airplanes")
    @JsonIgnore
//    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Tickets> ticketsList;

    public Airplanes() {
    }


    protected boolean canEqual(final Object other) {
        return other instanceof Airplanes;
    }

    public Long getId() {
        return this.id;
    }

    public String getAerolinea() {
        return this.aerolinea;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public Integer getCantidadMaximaPasajeros() {
        return this.cantidadMaximaPasajeros;
    }

    @JsonIgnore
    public List<Tickets> getTicketsList() {
        return this.ticketsList;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidadMaximaPasajeros(Integer cantidadMaximaPasajeros) {
        this.cantidadMaximaPasajeros = cantidadMaximaPasajeros;
    }

    @JsonIgnore
    public void setTicketsList(List<Tickets> ticketsList) {
        this.ticketsList = ticketsList;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Airplanes)) return false;
        final Airplanes other = (Airplanes) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$aerolinea = this.getAerolinea();
        final Object other$aerolinea = other.getAerolinea();
        if (this$aerolinea == null ? other$aerolinea != null : !this$aerolinea.equals(other$aerolinea)) return false;
        final Object this$descripcion = this.getDescripcion();
        final Object other$descripcion = other.getDescripcion();
        if (this$descripcion == null ? other$descripcion != null : !this$descripcion.equals(other$descripcion))
            return false;
        final Object this$cantidadMaximaPasajeros = this.getCantidadMaximaPasajeros();
        final Object other$cantidadMaximaPasajeros = other.getCantidadMaximaPasajeros();
        if (this$cantidadMaximaPasajeros == null ? other$cantidadMaximaPasajeros != null : !this$cantidadMaximaPasajeros.equals(other$cantidadMaximaPasajeros))
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
        final Object $aerolinea = this.getAerolinea();
        result = result * PRIME + ($aerolinea == null ? 43 : $aerolinea.hashCode());
        final Object $descripcion = this.getDescripcion();
        result = result * PRIME + ($descripcion == null ? 43 : $descripcion.hashCode());
        final Object $cantidadMaximaPasajeros = this.getCantidadMaximaPasajeros();
        result = result * PRIME + ($cantidadMaximaPasajeros == null ? 43 : $cantidadMaximaPasajeros.hashCode());
        final Object $ticketsList = this.getTicketsList();
        result = result * PRIME + ($ticketsList == null ? 43 : $ticketsList.hashCode());
        return result;
    }

    public String toString() {
        return "Airplanes(id=" + this.getId() + ", aerolinea=" + this.getAerolinea() + ", descripcion=" + this.getDescripcion() + ", cantidadMaximaPasajeros=" + this.getCantidadMaximaPasajeros() + ", ticketsList=" + this.getTicketsList() + ")";
    }
}
