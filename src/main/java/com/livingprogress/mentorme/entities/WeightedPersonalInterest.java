package com.livingprogress.mentorme.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * The weighted personal interest.
 */
@Getter
@Setter
@Entity
public class WeightedPersonalInterest extends IdentifiableEntity {
    /**
     * The personal interest.
     */
    @ManyToOne
    @JoinColumn(name = "personal_interest_id")
    private PersonalInterest personalInterest;

    /**
     * The weight.
     */
    private int weight;

    /**
     * The user id.
     */
    @Column(name = "user_id", insertable = false, updatable = false)
    private long userId;

    /**
     * The user.
     */
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}

