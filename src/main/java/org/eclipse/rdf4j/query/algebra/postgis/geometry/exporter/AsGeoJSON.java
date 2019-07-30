package main.java.de.hsmainz.rdf4jpostgis.geometry.exporter;

import org.eclipse.rdf4j.model.vocabulary.POSTGIS;
import org.locationtech.jts.geom.Geometry;
import org.wololo.geojson.GeoJSON;
import org.wololo.jts2geojson.GeoJSONWriter;

import main.java.de.hsmainz.rdf4jpostgis.geometry.base.GeometricStringExportFunction;

public class AsGeoJSON extends GeometricStringExportFunction{

	@Override
	public String getURI() {
		return POSTGIS.ASGEOJSON.stringValue();
	}

	@Override
	public String operation(Geometry geom) {
         GeoJSONWriter writer = new GeoJSONWriter();
         GeoJSON json = writer.write(geom);
         return  json.toString();
	}

}