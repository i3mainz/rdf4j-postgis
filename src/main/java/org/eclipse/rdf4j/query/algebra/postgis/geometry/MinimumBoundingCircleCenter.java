package main.java.de.hsmainz.rdf4jpostgis.geometry;

import org.eclipse.rdf4j.model.vocabulary.POSTGIS;
import org.locationtech.jts.geom.Geometry;

import main.java.de.hsmainz.rdf4jpostgis.geometry.base.GeometricUnaryFunction;

public class MinimumBoundingCircleCenter extends GeometricUnaryFunction {

	@Override
	public String getURI() {
		return POSTGIS.st_minimumBoundingCircleCenter.stringValue();
	}

	@Override
	protected Geometry operation(Geometry geom) {
		org.locationtech.jts.algorithm.MinimumBoundingCircle minCircle = new org.locationtech.jts.algorithm.MinimumBoundingCircle(geom);
        return minCircle.getCircle().getCentroid();
	}

}