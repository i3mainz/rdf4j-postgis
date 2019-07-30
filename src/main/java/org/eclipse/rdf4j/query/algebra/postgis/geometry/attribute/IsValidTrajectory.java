package main.java.de.hsmainz.rdf4jpostgis.geometry.attribute;

import org.eclipse.rdf4j.model.vocabulary.POSTGIS;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.LineString;

import main.java.de.hsmainz.rdf4jpostgis.geometry.base.GeometricBinaryAttributeFunction;

public class IsValidTrajectory extends GeometricBinaryAttributeFunction {

	@Override
	public boolean attribute(Geometry geom) {
		if (geom instanceof LineString) {
			Double lastM = Double.MIN_VALUE;
			for (Coordinate coord : geom.getCoordinates()) {
				if (Double.isNaN(coord.getM()) || coord.getM() <= lastM) {
					return false;
				} else {
					lastM = coord.getM();
				}
			}
			return true;
		}
		return false;
	}

	@Override
	public String getURI() {
		return POSTGIS.st_isValidTrajectory.stringValue();
	}
	

}