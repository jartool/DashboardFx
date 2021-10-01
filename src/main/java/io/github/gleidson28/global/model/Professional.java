/*
 * Copyright (C) Gleidson Neves da Silveira
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.github.gleidson28.global.model;

import javafx.beans.property.*;

import java.math.BigDecimal;

/**
 *
 * Base class for creation models.
 *
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  10/04/2019
 */
public class Professional extends User {

    private final ObjectProperty<Status> status = new SimpleObjectProperty<>();
    private ObjectProperty<BigDecimal> price = new SimpleObjectProperty<>();

    private StringProperty location = new SimpleStringProperty();
    private StringProperty email = new SimpleStringProperty();
    private StringProperty teams = new SimpleStringProperty();

    private FloatProperty rating = new SimpleFloatProperty();

    public Status getStatus() {
        return status.get();
    }

    public ObjectProperty<Status> statusProperty() {
        return status;
    }

    public void setStatus(Status status) {
        this.status.set(status);
    }

    public BigDecimal getPrice() {
        return price.get();
    }

    public ObjectProperty<BigDecimal> priceProperty() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price.set(price);
    }

    public float getRating() {
        return rating.get();
    }

    public FloatProperty ratingProperty() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating.set(rating);
    }

    public String getLocation() {
        return location.get();
    }

    public StringProperty locationProperty() {
        return location;
    }

    public void setLocation(String location) {
        this.location.set(location);
    }

    public String getEmail() {
        return email.get();
    }

    public StringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public String getTeams() {
        return teams.get();
    }

    public StringProperty teamsProperty() {
        return teams;
    }

    public void setTeams(String teams) {
        this.teams.set(teams);
    }

    @Override
    public boolean isValid() {
        return this.getName() != null && this.getName().length() >= 3
                && this.getLastName() != null && this.getLastName().length() >= 3;
    }
}
