/**
 * This class is generated by jOOQ
 */
package com.ethercis.dao.jooq.tables;

/**
 * specifies an ehr modality and ownership (patient)
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.3"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Status extends org.jooq.impl.TableImpl<com.ethercis.dao.jooq.tables.records.StatusRecord> {

	private static final long serialVersionUID = -198338013;

	/**
	 * The reference instance of <code>ehr.status</code>
	 */
	public static final com.ethercis.dao.jooq.tables.Status STATUS = new com.ethercis.dao.jooq.tables.Status();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.ethercis.dao.jooq.tables.records.StatusRecord> getRecordType() {
		return com.ethercis.dao.jooq.tables.records.StatusRecord.class;
	}

	/**
	 * The column <code>ehr.status.id</code>.
	 */
	public final org.jooq.TableField<com.ethercis.dao.jooq.tables.records.StatusRecord, java.util.UUID> ID = createField("id", org.jooq.impl.SQLDataType.UUID.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>ehr.status.ehr_id</code>.
	 */
	public final org.jooq.TableField<com.ethercis.dao.jooq.tables.records.StatusRecord, java.util.UUID> EHR_ID = createField("ehr_id", org.jooq.impl.SQLDataType.UUID, this, "");

	/**
	 * The column <code>ehr.status.is_queryable</code>.
	 */
	public final org.jooq.TableField<com.ethercis.dao.jooq.tables.records.StatusRecord, java.lang.Boolean> IS_QUERYABLE = createField("is_queryable", org.jooq.impl.SQLDataType.BOOLEAN.defaulted(true), this, "");

	/**
	 * The column <code>ehr.status.is_modifiable</code>.
	 */
	public final org.jooq.TableField<com.ethercis.dao.jooq.tables.records.StatusRecord, java.lang.Boolean> IS_MODIFIABLE = createField("is_modifiable", org.jooq.impl.SQLDataType.BOOLEAN.defaulted(true), this, "");

	/**
	 * The column <code>ehr.status.party</code>.
	 */
	public final org.jooq.TableField<com.ethercis.dao.jooq.tables.records.StatusRecord, java.util.UUID> PARTY = createField("party", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

	/**
	 * The column <code>ehr.status.other_details</code>.
	 */
	public final org.jooq.TableField<com.ethercis.dao.jooq.tables.records.StatusRecord, java.lang.Object> OTHER_DETAILS = createField("other_details", org.jooq.impl.DefaultDataType.getDefaultDataType("jsonb"), this, "");

	/**
	 * The column <code>ehr.status.sys_transaction</code>.
	 */
	public final org.jooq.TableField<com.ethercis.dao.jooq.tables.records.StatusRecord, java.sql.Timestamp> SYS_TRANSACTION = createField("sys_transaction", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

	/**
	 * The column <code>ehr.status.sys_period</code>.
	 */
	public final org.jooq.TableField<com.ethercis.dao.jooq.tables.records.StatusRecord, java.lang.Object> SYS_PERIOD = createField("sys_period", org.jooq.impl.DefaultDataType.getDefaultDataType("tstzrange"), this, "");

	/**
	 * Create a <code>ehr.status</code> table reference
	 */
	public Status() {
		this("status", null);
	}

	/**
	 * Create an aliased <code>ehr.status</code> table reference
	 */
	public Status(java.lang.String alias) {
		this(alias, com.ethercis.dao.jooq.tables.Status.STATUS);
	}

	private Status(java.lang.String alias, org.jooq.Table<com.ethercis.dao.jooq.tables.records.StatusRecord> aliased) {
		this(alias, aliased, null);
	}

	private Status(java.lang.String alias, org.jooq.Table<com.ethercis.dao.jooq.tables.records.StatusRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.ethercis.dao.jooq.Ehr.EHR, aliased, parameters, "specifies an ehr modality and ownership (patient)");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.ethercis.dao.jooq.tables.records.StatusRecord> getPrimaryKey() {
		return com.ethercis.dao.jooq.Keys.STATUS_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.ethercis.dao.jooq.tables.records.StatusRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.ethercis.dao.jooq.tables.records.StatusRecord>>asList(com.ethercis.dao.jooq.Keys.STATUS_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.ethercis.dao.jooq.tables.records.StatusRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.ethercis.dao.jooq.tables.records.StatusRecord, ?>>asList(com.ethercis.dao.jooq.Keys.STATUS__STATUS_EHR_ID_FKEY, com.ethercis.dao.jooq.Keys.STATUS__STATUS_PARTY_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.ethercis.dao.jooq.tables.Status as(java.lang.String alias) {
		return new com.ethercis.dao.jooq.tables.Status(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.ethercis.dao.jooq.tables.Status rename(java.lang.String name) {
		return new com.ethercis.dao.jooq.tables.Status(name, null);
	}
}