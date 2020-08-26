package model;

/**
 * An object representing a Server Variable for server URL template substitution.
 */
public class ServerVariable {
    /**
     * 	An enumeration of string values to be used if the substitution options are from a limited set. The array
     * 	SHOULD NOT be empty.
     */
    private String[] _enum;

    /**
     * REQUIRED. The default value to use for substitution, which SHALL be sent if an alternate value is not supplied.
     * Note this behavior is different than the Schema Object's treatment of default values, because in those cases
     * parameter values are optional. If the enum is defined, the value SHOULD exist in the enum's values.
     */
    private String _default;

    /**
     * An optional description for the server variable. CommonMark syntax MAY be used for rich text representation.
     */
    private String description;

    public String[] getEnum() {
        return _enum;
    }

    public void setEnum(String[] _enum) {
        this._enum = _enum;
    }

    public String getDefault() {
        return _default;
    }

    public void setDefault(String _default) {
        this._default = _default;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
