package main.java.de.hsmainz.rdf4jpostgis.geometry.attribute;

import org.eclipse.rdf4j.model.vocabulary.POSTGIS;
import org.locationtech.jts.geom.Geometry;

import main.java.de.hsmainz.rdf4jpostgis.geometry.base.GeometricDoubleAttributeFunction;

public class Length3D extends GeometricDoubleAttributeFunction {

	@Override
	public double attribute(Geometry geom) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getURI() {
		return POSTGIS.st_Length3D.stringValue();
	}

}