/**
 * This class is generated by jOOQ
 */
package hu.tilos.radio.jooqmodel.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Role extends org.jooq.impl.TableImpl<hu.tilos.radio.jooqmodel.tables.records.RoleRecord> {

	private static final long serialVersionUID = 1765668409;

	/**
	 * The singleton instance of <code>tilos2.role</code>
	 */
	public static final hu.tilos.radio.jooqmodel.tables.Role ROLE = new hu.tilos.radio.jooqmodel.tables.Role();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<hu.tilos.radio.jooqmodel.tables.records.RoleRecord> getRecordType() {
		return hu.tilos.radio.jooqmodel.tables.records.RoleRecord.class;
	}

	/**
	 * The column <code>tilos2.role.id</code>.
	 */
	public final org.jooq.TableField<hu.tilos.radio.jooqmodel.tables.records.RoleRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>tilos2.role.parent_role_id</code>.
	 */
	public final org.jooq.TableField<hu.tilos.radio.jooqmodel.tables.records.RoleRecord, java.lang.Integer> PARENT_ROLE_ID = createField("parent_role_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>tilos2.role.name</code>.
	 */
	public final org.jooq.TableField<hu.tilos.radio.jooqmodel.tables.records.RoleRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

	/**
	 * Create a <code>tilos2.role</code> table reference
	 */
	public Role() {
		this("role", null);
	}

	/**
	 * Create an aliased <code>tilos2.role</code> table reference
	 */
	public Role(java.lang.String alias) {
		this(alias, hu.tilos.radio.jooqmodel.tables.Role.ROLE);
	}

	private Role(java.lang.String alias, org.jooq.Table<hu.tilos.radio.jooqmodel.tables.records.RoleRecord> aliased) {
		this(alias, aliased, null);
	}

	private Role(java.lang.String alias, org.jooq.Table<hu.tilos.radio.jooqmodel.tables.records.RoleRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, hu.tilos.radio.jooqmodel.Tilos2.TILOS2, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<hu.tilos.radio.jooqmodel.tables.records.RoleRecord, java.lang.Integer> getIdentity() {
		return hu.tilos.radio.jooqmodel.Keys.IDENTITY_ROLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<hu.tilos.radio.jooqmodel.tables.records.RoleRecord> getPrimaryKey() {
		return hu.tilos.radio.jooqmodel.Keys.KEY_ROLE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<hu.tilos.radio.jooqmodel.tables.records.RoleRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<hu.tilos.radio.jooqmodel.tables.records.RoleRecord>>asList(hu.tilos.radio.jooqmodel.Keys.KEY_ROLE_PRIMARY, hu.tilos.radio.jooqmodel.Keys.KEY_ROLE_UNIQ_57698A6AA44B56EA);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<hu.tilos.radio.jooqmodel.tables.records.RoleRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<hu.tilos.radio.jooqmodel.tables.records.RoleRecord, ?>>asList(hu.tilos.radio.jooqmodel.Keys.FK_57698A6AA44B56EA);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public hu.tilos.radio.jooqmodel.tables.Role as(java.lang.String alias) {
		return new hu.tilos.radio.jooqmodel.tables.Role(alias, this);
	}

	/**
	 * Rename this table
	 */
	public hu.tilos.radio.jooqmodel.tables.Role rename(java.lang.String name) {
		return new hu.tilos.radio.jooqmodel.tables.Role(name, null);
	}
}