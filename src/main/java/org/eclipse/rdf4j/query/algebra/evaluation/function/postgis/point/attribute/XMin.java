package org.eclipse.rdf4j.query.algebra.evaluation.function.postgis.point.attribute;

import org.eclipse.rdf4j.model.vocabulary.POSTGIS;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Geometry;

import org.eclipse.rdf4j.query.algebra.evaluation.function.postgis.geometry.base.GeometricDoubleAttributeFunction;

/**
 * Returns minimum x coordinate of the given geometry.
 */
public class XMin extends GeometricDoubleAttributeFunction {

	@Override
	public double attribute(Geometry geom) {
        Geometry geo=geom;
        Double minX=Double.MAX_VALUE;
        for(Coordinate coord:geo.getCoordinates()) {
        	if(minX>coord.getX()) {
        		minX=coord.getX();
        	}
        }
        return minX;
	}

	@Override
	public String getURI() {
		return POSTGIS.st_xMin.stringValue();
	}

}
