package org.eclipse.rdf4j.query.algebra.evaluation.function.postgis.raster.attribute;

import org.apache.sis.coverage.grid.GridCoverage;
import org.eclipse.rdf4j.model.vocabulary.POSTGIS;
import org.eclipse.rdf4j.query.algebra.evaluation.function.postgis.raster.base.RasterAttributeFunction;

public class NumDataElements extends RasterAttributeFunction{

	@Override
	public String getURI() {
		return POSTGIS.st_numDataElements.stringValue();
	}

	@Override
	public double attribute(GridCoverage raster) {
		return raster.render(raster.getGridGeometry().getExtent()).getNumXTiles();
	}

	
	
}