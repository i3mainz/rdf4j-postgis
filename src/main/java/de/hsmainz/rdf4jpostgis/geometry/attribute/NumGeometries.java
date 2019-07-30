package main.java.de.hsmainz.rdf4jpostgis.geometry.attribute;

import org.eclipse.rdf4j.model.vocabulary.POSTGIS;
import org.locationtech.jts.geom.Geometry;

import main.java.de.hsmainz.rdf4jpostgis.geometry.base.GeometricIntegerAttributeFunction;

public class NumGeometries extends GeometricIntegerAttributeFunction {

	@Override
	public String getURI() {
		return POSTGIS.st_numGeometries.stringValue();
	}

	@Override
	public int attribute(Geometry geom) {
		return geom.getNumGeometries();
	}

}
