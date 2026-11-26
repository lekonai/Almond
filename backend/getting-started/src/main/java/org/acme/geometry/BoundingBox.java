package org.acme.geometry;

/**
 * BoundingBox
 * 
 * <p>
 * A bounding box defined by its top-left and bottom-right corners.
 * </p>
 * 
 * @param topLeft
 * @param bottomRight
 */
public record BoundingBox(Point topLeft, Point bottomRight) {
}
