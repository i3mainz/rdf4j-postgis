package main.java.de.hsmainz.rdf4jpostgis.geometry.transform;

import org.eclipse.rdf4j.model.vocabulary.POSTGIS;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.io.WKTReader;

import main.java.de.hsmainz.rdf4jpostgis.geometry.base.GeometricUnaryFunction;

public class ForceCollection extends GeometricUnaryFunction {

	@Override
	public String getURI() {
		return POSTGIS.st_forceCollection.stringValue();
	}

	@Override
	protected Geometry operation(Geometry geom) {
         GeometryFactory fac=new GeometryFactory();
         return fac.createGeometryCollection(new Geometry[] {geom});
	}

}