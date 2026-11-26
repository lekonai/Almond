package org.acme.datastores;

/**
 * SeasonalData
 * 
 * <p>
 * A record representing seasonal data for a plant.
 * </p>
 * 
 * @param plantingMonth
 * @param harvestMonth
 */
public record SeasonalData(int plantingMonth, int harvestMonth) {
}
