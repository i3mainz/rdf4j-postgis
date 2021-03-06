package org.eclipse.rdf4j.query.algebra.evaluation.function.postgis.geometry.constructor;

import org.eclipse.rdf4j.model.vocabulary.POSTGIS;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.io.ParseException;
import org.locationtech.jts.io.WKTReader;

import org.eclipse.rdf4j.query.algebra.evaluation.function.postgis.geometry.base.GeometricConstructor;

/**
 * Returns a geometry from a WKT String.
 */
public class GeomFromText extends GeometricConstructor {

	@Override
	public Geometry construct(String input) {
		WKTReader wktreader=new WKTReader();
		Geometry geom=null;
		try {
			geom = wktreader.read(input);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return geom;           
	}

	@Override
	public String getURI() {
		return POSTGIS.st_geomFromText.stringValue();
	}

}
