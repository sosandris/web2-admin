/**
 * This class is generated by jOOQ
 */
package hu.tilos.radio.jooqmodel.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShowUrlRecord extends org.jooq.impl.UpdatableRecordImpl<hu.tilos.radio.jooqmodel.tables.records.ShowUrlRecord> implements org.jooq.Record2<java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 894237629;

	/**
	 * Setter for <code>tilos2.show_url.radioshow_id</code>.
	 */
	public void setRadioshowId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>tilos2.show_url.radioshow_id</code>.
	 */
	public java.lang.Integer getRadioshowId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>tilos2.show_url.url_id</code>.
	 */
	public void setUrlId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>tilos2.show_url.url_id</code>.
	 */
	public java.lang.Integer getUrlId() {
		return (java.lang.Integer) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<java.lang.Integer, java.lang.Integer> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return hu.tilos.radio.jooqmodel.tables.ShowUrl.SHOW_URL.RADIOSHOW_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return hu.tilos.radio.jooqmodel.tables.ShowUrl.SHOW_URL.URL_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getRadioshowId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getUrlId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ShowUrlRecord value1(java.lang.Integer value) {
		setRadioshowId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ShowUrlRecord value2(java.lang.Integer value) {
		setUrlId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ShowUrlRecord values(java.lang.Integer value1, java.lang.Integer value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ShowUrlRecord
	 */
	public ShowUrlRecord() {
		super(hu.tilos.radio.jooqmodel.tables.ShowUrl.SHOW_URL);
	}

	/**
	 * Create a detached, initialised ShowUrlRecord
	 */
	public ShowUrlRecord(java.lang.Integer radioshowId, java.lang.Integer urlId) {
		super(hu.tilos.radio.jooqmodel.tables.ShowUrl.SHOW_URL);

		setValue(0, radioshowId);
		setValue(1, urlId);
	}
}