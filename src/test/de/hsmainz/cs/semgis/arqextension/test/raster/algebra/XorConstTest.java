package de.hsmainz.cs.semgis.arqextension.test.raster.algebra;

import static org.junit.Assert.assertEquals;

import org.eclipse.rdf4j.model.Value;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.impl.SimpleValueFactory;
import org.eclipse.rdf4j.query.algebra.evaluation.function.postgis.raster.algebra.XorConst;
import org.eclipse.rdf4j.query.algebra.evaluation.function.postgis.util.literals.raster.CovJSONDatatype;
import org.junit.jupiter.api.Test;

import de.hsmainz.cs.semgis.arqextension.test.util.SampleRasters;


public class XorConstTest extends SampleRasters {

	public static final String combinedRasterLiteral="";
	
	@Test
	public void testXorConst() {
		ValueFactory valfac=SimpleValueFactory.getInstance();
        Value cov1 = valfac.createLiteral(rasterLiteral1, CovJSONDatatype.LiteralIRI);
        Value cov2 = valfac.createLiteral(10);
        XorConst instance=new XorConst();
        Value expResult = valfac.createLiteral(combinedRasterLiteral, CovJSONDatatype.LiteralIRI);
        Value result= instance.evaluate(valfac,cov1,cov2);
        System.out.println(result);
        assertEquals(expResult, result);
	}

}
