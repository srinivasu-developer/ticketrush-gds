package com.ticketrush.gds.theatre.entities;

import com.ticketrush.gds.theatre.enums.SeatType;
import jakarta.persistence.*;
import lombok.*;
import net.minidev.json.annotate.JsonIgnore;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "show_seats")
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ToString
public class ShowSeatsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "seat_number", nullable = false)
    private String seatNumber;

    @Column(name = "rate", nullable = false)
    private int rate;

    @Enumerated(EnumType.STRING)
    @Column(name = "seat_type", nullable = false)
    private SeatType seatType;

    @Column(name = "is_booked", columnDefinition = "bit(1) default 0", nullable = false)
    private boolean booked;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "booked_at")
    private Date bookedAt;

    @ManyToOne
    @JsonIgnore
    private ShowEntity show;

}
