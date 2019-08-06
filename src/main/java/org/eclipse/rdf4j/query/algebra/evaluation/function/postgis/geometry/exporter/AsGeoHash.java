package org.eclipse.rdf4j.query.algebra.evaluation.function.postgis.geometry.exporter;

import org.locationtech.jts.algorithm.Angle;
import org.locationtech.jts.geom.Geometry;
import org.apache.sis.index.GeoHashCoder;
import org.eclipse.rdf4j.model.vocabulary.POSTGIS;
import org.eclipse.rdf4j.query.algebra.evaluation.function.postgis.geometry.base.GeometricStringExportFunction;


public class AsGeoHash extends GeometricStringExportFunction {

	GeoHashCoder coder=new GeoHashCoder();
	
	@Override
	public String operation(Geometry geom) {
		if(geom.getGeometryType().equalsIgnoreCase("Point")) {
			String geohash = coder.encode(Angle.toDegrees(geom.getCoordinate().getX()), Angle.toDegrees(geom.getCoordinate().getY()));
			return geohash;
		}
		throw new RuntimeException("Input geometry needs to be a Point");

	}

	@Override
	public String getURI() {
		return POSTGIS.ST_ASGEOHASH.stringValue();
	}

}