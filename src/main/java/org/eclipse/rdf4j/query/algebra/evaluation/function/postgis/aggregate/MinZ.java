package org.eclipse.rdf4j.query.algebra.evaluation.function.postgis.aggregate;

import org.eclipse.rdf4j.query.algebra.AbstractAggregateOperator;
import org.eclipse.rdf4j.query.algebra.QueryModelVisitor;
import org.eclipse.rdf4j.query.algebra.ValueExpr;


/**
 * Aggregate function to find the minimum z coordinate of a set of geometries.
 *
 */
public class MinZ extends AbstractAggregateOperator {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6545650405164933961L;

	public MinZ(ValueExpr arg) {
		super(arg);
	}

	public MinZ(ValueExpr arg, boolean distinct) {
		super(arg, distinct);
	}

	@Override
	public <X extends Exception> void visit(QueryModelVisitor<X> visitor) throws X {
		visitor.meet(this);
	}

	@Override
	public boolean equals(Object other) {
		return other instanceof MinZ && super.equals(other);
	}

	@Override
	public int hashCode() {
		return super.hashCode() ^ "MinZ".hashCode();
	}

	@Override
	public MinZ clone() {
		return (MinZ) super.clone();
	}

}
