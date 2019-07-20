package com.fly.app.backend.models;

import javax.persistence.*;

@Entity
public class Tickets {
    @Id
    @GeneratedValue
    private Long id;

    private Double valorTickete;

    private Double ivaTiquete;

    private Double descuentoTickete;

    @ManyToOne
    @JoinColumn(name = "id_pasajero")
    private Passengers passengers;

    @ManyToOne
    @JoinColumn(name = "id_vuelo")
    private Flights flights;

    @ManyToOne
    @JoinColumn(name = "id_avion")
    private Airplanes airplanes;

    public Tickets() {
    }


    protected boolean canEqual(final Object other) {
        return other instanceof Tickets;
    }

    public Long getId() {
        return this.id;
    }

    public Double getValorTickete() {
        return this.valorTickete;
    }

    public Double getIvaTiquete() {
        return this.ivaTiquete;
    }

    public Double getDescuentoTickete() {
        return this.descuentoTickete;
    }

    public Passengers getPassengers() {
        return this.passengers;
    }

    public Flights getFlights() {
        return this.flights;
    }

    public Airplanes getAirplanes() {
        return this.airplanes;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setValorTickete(Double valorTickete) {
        this.valorTickete = valorTickete;
    }

    public void setIvaTiquete(Double ivaTiquete) {
        this.ivaTiquete = ivaTiquete;
    }

    public void setDescuentoTickete(Double descuentoTickete) {
        this.descuentoTickete = descuentoTickete;
    }

    public void setPassengers(Passengers passengers) {
        this.passengers = passengers;
    }

    public void setFlights(Flights flights) {
        this.flights = flights;
    }

    public void setAirplanes(Airplanes airplanes) {
        this.airplanes = airplanes;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Tickets)) return false;
        final Tickets other = (Tickets) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$valorTickete = this.getValorTickete();
        final Object other$valorTickete = other.getValorTickete();
        if (this$valorTickete == null ? other$valorTickete != null : !this$valorTickete.equals(other$valorTickete))
            return false;
        final Object this$ivaTiquete = this.getIvaTiquete();
        final Object other$ivaTiquete = other.getIvaTiquete();
        if (this$ivaTiquete == null ? other$ivaTiquete != null : !this$ivaTiquete.equals(other$ivaTiquete))
            return false;
        final Object this$descuentoTickete = this.getDescuentoTickete();
        final Object other$descuentoTickete = other.getDescuentoTickete();
        if (this$descuentoTickete == null ? other$descuentoTickete != null : !this$descuentoTickete.equals(other$descuentoTickete))
            return false;
        final Object this$passengers = this.getPassengers();
        final Object other$passengers = other.getPassengers();
        if (this$passengers == null ? other$passengers != null : !this$passengers.equals(other$passengers))
            return false;
        final Object this$flights = this.getFlights();
        final Object other$flights = other.getFlights();
        if (this$flights == null ? other$flights != null : !this$flights.equals(other$flights)) return false;
        final Object this$airplanes = this.getAirplanes();
        final Object other$airplanes = other.getAirplanes();
        if (this$airplanes == null ? other$airplanes != null : !this$airplanes.equals(other$airplanes)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $valorTickete = this.getValorTickete();
        result = result * PRIME + ($valorTickete == null ? 43 : $valorTickete.hashCode());
        final Object $ivaTiquete = this.getIvaTiquete();
        result = result * PRIME + ($ivaTiquete == null ? 43 : $ivaTiquete.hashCode());
        final Object $descuentoTickete = this.getDescuentoTickete();
        result = result * PRIME + ($descuentoTickete == null ? 43 : $descuentoTickete.hashCode());
        final Object $passengers = this.getPassengers();
        result = result * PRIME + ($passengers == null ? 43 : $passengers.hashCode());
        final Object $flights = this.getFlights();
        result = result * PRIME + ($flights == null ? 43 : $flights.hashCode());
        final Object $airplanes = this.getAirplanes();
        result = result * PRIME + ($airplanes == null ? 43 : $airplanes.hashCode());
        return result;
    }

    public String toString() {
        return "Tickets(id=" + this.getId() + ", valorTickete=" + this.getValorTickete() + ", ivaTiquete=" + this.getIvaTiquete() + ", descuentoTickete=" + this.getDescuentoTickete() + ", passengers=" + this.getPassengers() + ", flights=" + this.getFlights() + ", airplanes=" + this.getAirplanes() + ")";
    }
}
