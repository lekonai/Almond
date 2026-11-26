package org.acme.datastores;

/**
 * Plant
 * 
 * <p>
 * A record representing a plant with its associated properties.
 * </p>
 * 
 * @param id
 * @param nutrientUptake
 * @param rootGrowth
 * @param seasonalData
 * @param cropYield
 */
public record Plant(int id, double nutrientUptake, double rootGrowth, SeasonalData seasonalData,
        double cropYield) {
}
