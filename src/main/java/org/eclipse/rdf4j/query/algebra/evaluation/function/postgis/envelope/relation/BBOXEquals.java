package org.eclipse.rdf4j.query.algebra.evaluation.function.postgis.envelope.relation;

import org.eclipse.rdf4j.model.vocabulary.POSTGIS;
import org.eclipse.rdf4j.query.algebra.evaluation.function.postgis.util.LiteralUtils;
import org.locationtech.jts.geom.Geometry;

import org.eclipse.rdf4j.query.algebra.evaluation.function.postgis.geometry.base.GeometricRelationBinaryFunction;

/**
 * Returns true if the boundingbox of the first geometry equals the boundingbox of the second geometry.
 */
public class BBOXEquals extends GeometricRelationBinaryFunction {

	@Override
	public String getURI() {
		return POSTGIS.st_bboxequals.stringValue();
	}

	@Override
	protected boolean relation(Geometry g1, Geometry g2) {
		Geometry transformed=LiteralUtils.transform(g2, g1);
		return g1.getEnvelope().equals(transformed.getEnvelope());
	}

}
