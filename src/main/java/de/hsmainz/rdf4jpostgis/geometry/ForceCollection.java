package main.java.de.hsmainz.rdf4jpostgis.geometry;

import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.io.WKTReader;

public class ForceCollection extends GeometricUnaryFunction {

	@Override
	public String getURI() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Geometry operation(Geometry geom) {
         GeometryFactory fac=new GeometryFactory();
         return fac.createGeometryCollection(new Geometry[] {geom});
	}

}
