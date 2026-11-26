package org.acme.datastores;

import java.util.List;
import org.acme.geometry.BoundingBox;
import org.acme.management.LandManagementMethod;

public record Field(BoundingBox bounds, LandManagementMethod method, List<Plant> plants,
        List<Animal> animals) {
    public Field {
        plants = List.copyOf(plants);
        animals = List.copyOf(animals);
    }
}
