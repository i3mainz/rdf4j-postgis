package main.java.de.hsmainz.rdf4jpostgis.geometry.exporter;

import org.eclipse.rdf4j.model.vocabulary.POSTGIS;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jtstest.util.io.SVGWriter;

import main.java.de.hsmainz.rdf4jpostgis.geometry.base.GeometricStringExportFunction;

public class AsSVG extends GeometricStringExportFunction {

	@Override
	public String operation(Geometry geom) {
        SVGWriter writer=new SVGWriter();
        String result=writer.write(geom);
        return result.toString();
	}

	@Override
	public String getURI() {
		return POSTGIS.ASSVG.stringValue();
	}

}