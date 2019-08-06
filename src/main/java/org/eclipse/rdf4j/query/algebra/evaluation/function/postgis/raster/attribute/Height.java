package org.eclipse.rdf4j.query.algebra.evaluation.function.postgis.raster.attribute;

import org.eclipse.rdf4j.model.vocabulary.POSTGIS;
import org.eclipse.rdf4j.query.algebra.evaluation.function.postgis.raster.base.RasterAttributeFunction;
import org.geotoolkit.coverage.grid.GridCoverage2D;

public class Height extends RasterAttributeFunction {

	@Override
	public String getURI() {
		return POSTGIS.st_height.stringValue();
	}

	@Override
	public double attribute(GridCoverage2D raster) {
		return raster.getRenderedImage().getHeight();
	}

}